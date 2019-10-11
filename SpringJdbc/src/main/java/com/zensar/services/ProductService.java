package com.zensar.services;

import java.util.List;

import com.zensar.entities.Product2;

/**
 * @author Samraddhi Khare
 * @creation_date 4th october 2019 10:00AM
 * @modification_date 4th october 2019 11:37AM
 * @version 1.0
 * @copyright Zensar Technologies. All rights reserved
 * @Description It is a Service interface using buisness layer.
 *            
 */
public interface ProductService
{
 List<Product2> findAllProduct();
  Product2 findProductId(int productId);
 void add(Product2 product);
 void update(Product2 product);
 void remove(Product2 product);
 List<Product2>findProductByPriceRange(float maxPrice,float minPrice);
 List<Product2>findProductByName(String name);
 List<Product2>findProductByBrand(String brand);
 long getProduct2Count();
 
 
 
 
}
