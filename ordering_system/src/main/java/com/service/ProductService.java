package com.service;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ProductImageMapper;
import com.dao.ProductMapper;
import com.dao.ProductSalesattrMapper;
import com.model.Product;
import com.model.ProductSalesattr;
import com.util.ConfigUtil;

@Service
public class ProductService {
	@Resource
	private ProductMapper productMapper;
	@Resource
	private ProductImageMapper productImageMapper;
	@Resource
	private ProductSalesattrMapper productSalesattrMapper;

	public boolean ifProdNoExist(String prodNo) {

		Product product = productMapper.selectByPrimaryKey(prodNo);

		if( product != null )
			return true;
		else
			return false;
	}

	public int addProduct(Product product) {

		return productMapper.insert(product);
	}

	public int addProductSalesattr(ProductSalesattr productSalesattr) {

		int res = productSalesattrMapper.insert(productSalesattr);

		if(res > 0) {

			String prodNo = productSalesattr.getProdNo();
			Product product = productMapper.selectByPrimaryKey(prodNo);

			String desc = productSalesattr.getDescription();
			if(productSalesattr.equals(ConfigUtil.SALESATTR_SERIALNO)) {
				String serialNo = product.getSerialNo();
				product.setSerialNo( (serialNo == null ? "": serialNo) + desc);
			}
			else if(productSalesattr.equals(ConfigUtil.SALESATTR_SPEC)) {
				String spec = product.getSpec();
				product.setSpec((spec == null ? "": spec) + desc);
			}

			BigDecimal minPrice = product.getMinPrice();
			BigDecimal maxPrice = product.getMaxPrice();

			BigDecimal price = productSalesattr.getPrice();
			if(minPrice == null || price.compareTo(minPrice) == -1) {
				product.setMinPrice(price);
			}
			if(maxPrice == null || price.compareTo(maxPrice) == 1) {
				product.setMaxPrice(price);
			}

			res = productMapper.updateByPrimaryKeySelective(product);
		}
		return res;
	}
}
