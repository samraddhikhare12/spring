package com.zensar.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.zensar.entities.Product2;
import com.zensar.services.ProductService;

public class DbOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext ac=new ClassPathXmlApplicationContext("dbconfig.xml");
     ProductService productService=ac.getBean("productServiceImpl",ProductService.class);
   //  List<Product2>products=productService.findAllProduct();
  //   for (Product2 product2 : products)
 //    {
		//System.out.println(product2);
//	}
    // Product2 product=productService.findProductId(101);
    // System.out.println(product);
    // Product2 product= new Product2(101,"fiber","sony",5600);
    // productService.add(product);
    // Product2 product= new Product2(101,"fiber","sony",9600);
     Product2 product=productService.findProductId(101);
     //System.out.println(product);
     
     if(product!=null) 
          {
    	 product.setName("bike");
    	 product.setPrice(5690);
    	 product.setBrand("Honda");
    	productService.update(product);
    	 }
     else {
    	 
    	 System.out.println("not found");
     }
     
	}

}
