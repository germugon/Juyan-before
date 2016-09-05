package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ProductImageMapper;
import com.dao.ProductMapper;
import com.dao.ProductSalesattrMapper;
import com.model.Product;
import com.model.ProductImage;
import com.model.ProductSalesattr;

@Service
public class ProductService {
	@Resource
	private ProductMapper productMapper;
	@Resource
	private ProductImageMapper productImageMapper;
	@Resource
	private ProductSalesattrMapper productSalesattrMapper;
	
	public int addProduct(Product product, List<ProductImage> productImageList, 
			List<ProductSalesattr> productSalesattrList) {
		
		int res = productMapper.insert(product);
		if( res > 0 ) {
			for(ProductImage productImage : productImageList) {
				productImage.setProdNo(product.getProdNo());
				res = productImageMapper.insert(productImage);
			}
			
			for(ProductSalesattr productSalesattr : productSalesattrList) {
				productSalesattr.setProdNo(product.getProdNo());
				res = productSalesattrMapper.insert(productSalesattr);
			}
		}
		return res;
	}
	
	public boolean ifProdNoExist(String prodNo) {
		
		Product product = productMapper.selectByPrimaryKey(prodNo);
		
		if( product != null )
			return true;
		else
			return false;
	}
}
