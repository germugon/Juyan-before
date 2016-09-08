package com.controller;

import java.beans.PropertyEditor;
import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
	public void addProductSalesattr(ProductSalesattr productSalesattr, Writer writer) throws IOException {
		
		logger.info(productSalesattr);

		String prodNo = productSalesattr.getProdNo();
		if(!productService.ifProdNoExist(prodNo)) {
			writer.write("商品编号不存在");
			
		} else {
			String sku = productSalesattr.getSku();
			if(productService.ifSkuExist(sku)) {
				writer.write("SKU编号已存在");
				
			} else {
				int res = productService.addProductSalesattr(productSalesattr);
				
				if(res > 0) {
					writer.write("");
				} else {
					writer.write("添加销售属性失败");
				}
			}
		}
	}
	
	@RequestMapping("removeProductSalesattr")  
	public void removeProductSalesattr(String sku, String prodNo, Writer writer) throws IOException {
		
		logger.info(sku);


		int res = productService.removeProductSalesattr(sku, prodNo);
			
		if(res > 0) {
			writer.write("");
		} else {
			writer.write("删除销售属性失败");
		}
	}
	
	@InitBinder  
    public void dataBinder(WebDataBinder binder) {  
       DateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );  
       PropertyEditor propertyEditor = new CustomDateEditor(dateFormat, true ); // 第二个参数表示是否允许为空  
       binder.registerCustomEditor(Date. class , propertyEditor);  
	}
}
