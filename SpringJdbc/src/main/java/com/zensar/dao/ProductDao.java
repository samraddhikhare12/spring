package com.zensar.dao;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.zensar.entities.Product2;

/**
 * @author Samraddhi Khare
 * @creation_date 4th October 2019 10:00AM
 * @modification_date 4th October 2019 10:00AM
 * @version 1.0
 * @copyright Zensar Technologies. All rights reserved
 * @Description It is a dao interface using persistence layer.
 *            
 */


public interface ProductDao 
{
      
      List<Product2> getAll();
      Product2 getById(int productId);
      
      void update(Product2 product);
      void insert(Product2 product);
      void delete(Product2 product);
      
      
      
      
}
