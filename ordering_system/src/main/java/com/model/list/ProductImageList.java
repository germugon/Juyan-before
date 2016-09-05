package com.model.list;

import java.util.List;

import com.google.gson.Gson;
import com.model.ProductImage;

public class ProductImageList {
	private List<ProductImage> list;

	public List<ProductImage> getList() {
		return list;
	}

	public void setList(List<ProductImage> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		Gson gson = new Gson();
		return "ProductImageList" + gson.toJson(list);
	}
	
	
}
