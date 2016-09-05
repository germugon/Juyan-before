package com.model.list;

import java.util.List;

import com.google.gson.Gson;
import com.model.ProductSalesattr;

public class ProductSalesattrList {
	private List<ProductSalesattr> list;

	public List<ProductSalesattr> getList() {
		return list;
	}

	public void setList(List<ProductSalesattr> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		Gson gson = new Gson();
		return "ProductSalesattrList" + gson.toJson(list);
	}

}
