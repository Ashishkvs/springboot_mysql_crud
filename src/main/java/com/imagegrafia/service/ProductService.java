package com.imagegrafia.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.imagegrafia.model.Product;
@Service

public class ProductService implements ProductI {
	//single product
	public Product getProduct() {
		return new Product(1,"Laptop",20000);
	}
	//list of Products
	public List<Product> getProductList(){
		return new ArrayList<>(Arrays.asList(new Product(2,"Ipad",2000)
				,new Product(3,"Screen",300),new Product(4,"Mobile",1300)
				));
	}

}
