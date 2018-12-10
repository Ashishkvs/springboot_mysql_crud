package com.imagegrafia.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.imagegrafia.model.Product;
@Service
@Primary
public class ProductService2 implements ProductI {
	//single product
	public Product getProduct() {
		return new Product(2,"Laptop",20000);
	}
	//list of Products
	public List<Product> getProductList(){
		return new ArrayList<>(Arrays.asList(new Product(12,"Ipad",2000)
				,new Product(3,"Screen",300),new Product(4,"Mobile",1300)
				));
	}

}
