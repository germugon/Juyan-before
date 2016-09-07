package com.controller;

import java.io.IOException;
import java.io.Writer;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Merchant;
import com.model.Staff;
import com.model.User;
import com.service.UserService;
import com.util.ConfigUtil;
import com.util.CookieUtil;

@Controller
public class UserController{
	@Resource
	private UserService userService;
	
	private Logger logger = Logger.getLogger(UserController.class);
	
	@RequestMapping("login")  
	public ModelAndView login(User user, HttpSession session) {
		
		ModelAndView modelAndView = new ModelAndView(); 
		
		logger.info(user);
		User usr = userService.ifUserExist(user.getAccount(), user.getPassword(), user.getRoleNo());
		
		if(usr == null) {
			modelAndView.setViewName("login");
			modelAndView.addObject("msg", "用户名与密码不匹配");
		} else {
			modelAndView.setViewName("login_success");
			session.setAttribute(ConfigUtil.SESSION_USER, usr);
			modelAndView.addObject("msg", "登录成功");
		}
		return modelAndView;
	}
	
	@RequestMapping("ifPhoneExist") 
	public void ifPhoneExist(@RequestParam("phone") String phone, @RequestParam("roleNo") int roleNo, 
			Writer writer) throws IOException {
		
		User user = userService.ifPhoneExist(phone,roleNo);
		if(user != null) {
			writer.write(user.getAccount());
		} else {
			writer.write("");
		}
	}
	
	@RequestMapping("sendPin")  
	public void sendPin(@RequestParam("phone") String phone, HttpServletResponse response) {

		String pin = userService.sendPin(phone);
		logger.info(pin);
		
		CookieUtil.addCookie(ConfigUtil.COOKIE_PHONE, phone, 15 * 60, response);	//设置为15min有效
		CookieUtil.addCookie(ConfigUtil.COOKIE_PIN, pin, 15 * 60, response);		//设置为15min有效  
	}
	
	@RequestMapping("verifyByPhone")  
	public ModelAndView verifyByPhone(@RequestParam("pin") String pin1, @RequestParam("roleNo") int roleNo, 
			HttpServletRequest request) {
		
		ModelAndView modelAndView = new ModelAndView(); 
		
		String phone = CookieUtil.getCookie(ConfigUtil.COOKIE_PHONE, request);
		String pin2 = CookieUtil.getCookie(ConfigUtil.COOKIE_PIN, request);
		logger.info(pin1 + " " + pin2);
		
		if(pin1.equals(pin2)) {
//			User user = userService.ifPhoneExist(phone,roleNo);
//			if(user != null) {
//				modelAndView.setViewName("register");
//				modelAndView.addObject("phone", phone);
//				modelAndView.addObject("msg", "该手机号已被注册，请使用手机号登录");
//			} else {
				modelAndView.setViewName("fill_basic_info");
				modelAndView.addObject("phone", phone);
//			}
		} else {
			modelAndView.setViewName("register");
			modelAndView.addObject("phone", phone);
			modelAndView.addObject("msg", "验证码不正确");
		}
		return modelAndView;
	}
	
	@RequestMapping("ifAccountExist") 
	public void ifAccountExist(@RequestParam("account") String account, Writer writer) throws IOException {
		
		if(userService.ifAccountExist(account)) {
			writer.write("existent");
		} else {
			writer.write("non-existent");
		}
	}
	
	@RequestMapping("register")  
	public ModelAndView register(Merchant merchant) {
		
		ModelAndView modelAndView = new ModelAndView(); 
		
		logger.info(merchant);
		String merchantNo = merchant.getMerchantNo();
		
		if(merchantNo == null || merchantNo.equals("")) {
			modelAndView.setViewName("error");
			modelAndView.addObject("msg", "用户名不能为空");
			
		} else if(userService.ifAccountExist(merchantNo)) {
			modelAndView.setViewName("error");
			modelAndView.addObject("msg", "用户名已存在");
			
		} else {
			merchant.setName(merchant.getMerchantNo());
			int res = userService.addMerchant(merchant);
			
			if(res > 0) {
				modelAndView.setViewName("register_success");
				modelAndView.addObject("msg", "注册成功");
			} else {
				modelAndView.setViewName("error");
				modelAndView.addObject("msg", "注册失败");
			}
		}
		return modelAndView;
	}
	
	@RequestMapping("addStaff")  
	public ModelAndView addStaff(Staff staff) {
		
		ModelAndView modelAndView = new ModelAndView(); 
		
		logger.info(staff);
		String staffNo = staff.getStaffNo();
		
		if(userService.ifAccountExist(staffNo)) {
			modelAndView.setViewName("error");
			modelAndView.addObject("msg", "用户名已存在");
		} else {
			int res = userService.addStaff(staff);
			
			if(res > 0) {
				modelAndView.setViewName("addStaff_success");
				modelAndView.addObject("msg", "添加成功");
			} else {
				modelAndView.setViewName("error");
				modelAndView.addObject("msg", "添加失败");
			}
		}
		return modelAndView;
	}

}
