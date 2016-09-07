package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.DepartmentMapper;
import com.dao.MerchantMapper;
import com.dao.RoleMapper;
import com.dao.StaffMapper;
import com.dao.UserMapper;
import com.model.Department;
import com.model.Merchant;
import com.model.Role;
import com.model.Staff;
import com.model.User;
import com.model.UserExample;

@Service
public class UserService {

	@Resource
	private UserMapper userMapper;
	@Resource
	private RoleMapper roleMapper;
	@Resource
	private MerchantMapper merchantMapper;
	@Resource
	private StaffMapper staffMapper;
	@Resource
	private DepartmentMapper departmentMapper;
	
	public User ifUserExist(String account, String password, int roleNo) {
		
		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		criteria.andAccountEqualTo(account).andPasswordEqualTo(password).andRoleNoEqualTo(roleNo);
		
		List<User> list = userMapper.selectByExample(example);
		
		if( list != null && list.size() > 0 )
			return list.get(0);
		else {
			example.clear();
			criteria = example.createCriteria();
			criteria.andPhoneEqualTo(account).andPasswordEqualTo(password).andRoleNoEqualTo(roleNo);
			
			list = userMapper.selectByExample(example);
			
			if( list != null && list.size() > 0 )
				return list.get(0);
			else 
				return null;	
		}
	}
	
	public User ifPhoneExist(String phone, int roleNo) {
		
		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		criteria.andPhoneEqualTo(phone).andRoleNoEqualTo(roleNo);
		
		List<User> list = userMapper.selectByExample(example);
		
		if( list != null && list.size() > 0 )
			return list.get(0);
		else
			return null;
	}
	
	public String sendPin(String phone) {
		/////////////////////////////////
		/**
		 * 短信验证码服务商
		 */
		String pin = "123456";
		return pin;
	}

	public boolean ifAccountExist(String account) {
		
		User user = userMapper.selectByPrimaryKey(account);
		
		if( user != null )
			return true;
		else
			return false;
	}
	
	public int addMerchant(Merchant merchant) {
		
		int roleNo = merchant.getRoleNo();
		Role role = roleMapper.selectByPrimaryKey(roleNo);
		merchant.setRoleName(role.getRoleName());
		
		int res = merchantMapper.insert(merchant);
		if(res > 0) {
			User user = new User();
			user.setAccount(merchant.getMerchantNo());
			user.setName(merchant.getName()); 
			user.setPassword(merchant.getPassword());
			user.setPhone(merchant.getPhone());
			user.setRoleNo(merchant.getRoleNo());
			user.setRoleName(merchant.getRoleName());
			
			res = userMapper.insert(user);
		}
		
		return res;
	}
	
	public int addStaff(Staff staff) {
		
		int deptNo = staff.getDeptNo();
		Department department = departmentMapper.selectByPrimaryKey(deptNo);
		staff.setDeptName(department.getDeptName());
		
		int roleNo = staff.getRoleNo();
		Role role = roleMapper.selectByPrimaryKey(roleNo);
		staff.setRoleName(role.getRoleName());
		
		int res = staffMapper.insert(staff);
		if(res > 0) {
			User user = new User();
			user.setAccount(staff.getStaffNo());
			user.setName(staff.getName());
			user.setPassword(staff.getPassword());
			user.setPhone(staff.getPhone());
			user.setRoleNo(staff.getRoleNo());
			user.setRoleName(staff.getRoleName());
			
			res = userMapper.insert(user);
		}
		
		return res;
	}
	
}
