package com.imagegrafia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.imagegrafia.model.Product;
import com.imagegrafia.service.ProductI;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductI producti;
	
	@RequestMapping(value="/getproduct",method=RequestMethod.GET)
	
	public Product getProduct() {
		
		return producti.getProduct();
		
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<Product> getProductList(){
		
		
		
		return producti.getProductList();
	}

}
