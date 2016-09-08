package com.service;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ProductImageMapper;
import com.dao.ProductMapper;
import com.dao.ProductSalesattrMapper;
import com.model.Product;
import com.model.ProductSalesattr;
import com.model.ProductSalesattrExample;
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
	
	public boolean ifSkuExist(String sku) {

		ProductSalesattr productSalesattr = productSalesattrMapper.selectByPrimaryKey(sku);

		if( productSalesattr != null )
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

			String serialNo = product.getSerialNo();
			String spec = product.getSpec();
			
			String attrName = productSalesattr.getAttrName();
			String desc = productSalesattr.getDescription();
			
			if(attrName.equals(ConfigUtil.SALESATTR_SERIALNO)) {	
				product.setSerialNo( (serialNo == null ? "": serialNo) + " " + desc);
			}
			else if(attrName.equals(ConfigUtil.SALESATTR_SPEC)) {				
				product.setSpec((spec == null ? "": spec) + " " + desc);
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

			res = productMapper.updateByPrimaryKey(product);
		}
		return res;
	}
	
	//有问题，待检查
	public int removeProductSalesattr(String sku, String prodNo) {

		int res = productSalesattrMapper.deleteByPrimaryKey(sku);
		
		if(res > 0) {

			StringBuilder serialNo = new StringBuilder();
			StringBuilder spec = new StringBuilder();
			
			BigDecimal minPrice = null;
			BigDecimal maxPrice = null;
			
			
			ProductSalesattrExample example = new ProductSalesattrExample();
			example.createCriteria().andProdNoEqualTo(prodNo);
			
			List<ProductSalesattr> productSalesattrList = productSalesattrMapper.selectByExample(example);
			
			for(ProductSalesattr productSalesattr : productSalesattrList) {

				String attrName = productSalesattr.getAttrName();
				String desc = productSalesattr.getDescription();
				
				if(attrName.equals(ConfigUtil.SALESATTR_SERIALNO)) {	
					serialNo.append(desc + " ");
				}
				else if(attrName.equals(ConfigUtil.SALESATTR_SPEC)) {				
					spec.append(desc + " ");
				}
				
				BigDecimal price = productSalesattr.getPrice();
				
				if(minPrice == null || price.compareTo(minPrice) == -1) {
					minPrice = price;
				}
				if(maxPrice == null || price.compareTo(maxPrice) == 1) {
					maxPrice = price;
				}
			}
			
			Product product = new Product();
			product.setProdNo(prodNo);
			if(serialNo.length() > 0) {
				serialNo.deleteCharAt(serialNo.length()-1);
				product.setSerialNo(serialNo.toString());
			}
			if(spec.length() > 0) {
				spec.deleteCharAt(spec.length()-1);
				product.setSpec(spec.toString());
			}
			product.setMinPrice(minPrice);
			product.setMaxPrice(maxPrice);
			
			res = productMapper.updateByPrimaryKeySelective(product);	
	
		}
		return res;
	}
}
