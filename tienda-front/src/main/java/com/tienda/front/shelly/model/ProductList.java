package com.tienda.front.shelly.model;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
 
	List<ProductoVender> products; 
	
	public ProductList(){
		products=new ArrayList<>();
	}

	public List<ProductoVender> getProducts() {
		return products;
	}

	public void setProducts(List<ProductoVender> products) {
		this.products = products;
	}
 
 
}
