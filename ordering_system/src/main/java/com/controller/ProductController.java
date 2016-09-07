package com.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Product;
import com.model.ProductSalesattr;
import com.service.ProductService;

@Controller
public class ProductController {
	@Resource
	private ProductService productService;
	
	private Logger logger = Logger.getLogger(ProductController.class);
	
	@RequestMapping("addProduct")  
	public ModelAndView addProduct(Product product) {
		
		ModelAndView modelAndView = new ModelAndView(); 
		
		logger.info(product);
		String prodNo = product.getProdNo();
		
		if(productService.ifProdNoExist(prodNo)) {
			modelAndView.setViewName("addProduct");
			modelAndView.addObject("msg", "商品编号已存在");
		} else {
			int res = productService.addProduct(product);
			
			if(res > 0) {
				modelAndView.setViewName("addProductSalesattr");
				modelAndView.addObject("prodNo", prodNo);
			} else {
				modelAndView.setViewName("addProduct");
				modelAndView.addObject("msg", "添加商品失败");
			}
		}
		return modelAndView;
	}
	
	@RequestMapping("addProductSalesattr")  
	public ModelAndView addProductSalesattr(ProductSalesattr productSalesattr) {
		
		ModelAndView modelAndView = new ModelAndView(); 
		
		logger.info(productSalesattr);

		String prodNo = productSalesattr.getProdNo();
		if(!productService.ifProdNoExist(prodNo)) {
			modelAndView.setViewName("addProductSalesattr");
			modelAndView.addObject("msg", "商品编号不存在");
		} else {
			int res = productService.addProductSalesattr(productSalesattr);
			
			if(res > 0) {
				modelAndView.setViewName("register_success");
				modelAndView.addObject("msg", "添加销售属性成功");
			} else {
				modelAndView.setViewName("addProductSalesattr");
				modelAndView.addObject("msg", "添加商品失败");
			}
		}
		return modelAndView;
	}
}
