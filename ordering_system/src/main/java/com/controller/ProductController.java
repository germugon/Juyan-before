package com.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Product;
import com.model.list.ProductImageList;
import com.model.list.ProductSalesattrList;
import com.service.ProductService;

@Controller
public class ProductController {
	@Resource
	private ProductService productService;
	
	private Logger logger = Logger.getLogger(ProductController.class);
	
	@RequestMapping("addProduct")  
	public ModelAndView addProduct(Product product, ProductImageList productImageList, 
			ProductSalesattrList productSalesattrList) {
		
		ModelAndView modelAndView = new ModelAndView(); 
		
		logger.info(product);
		logger.info(productImageList);
		logger.info(productSalesattrList);
		String prodNo = product.getProdNo();
		
		if(productService.ifProdNoExist(prodNo)) {
			modelAndView.setViewName("error");
			modelAndView.addObject("msg", "产品编号已存在");
		} else {
			int res = productService.addProduct(product, productImageList.getList(), 
					productSalesattrList.getList());
			
			if(res > 0) {
				modelAndView.setViewName("addProduct_success");
				modelAndView.addObject("msg", "添加产品成功");
			} else {
				modelAndView.setViewName("error");
				modelAndView.addObject("msg", "添加产品失败");
			}
		}
		return modelAndView;
	}
}
