package com.zensar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.zensar.dao.ProductDao;
import com.zensar.entities.Product2;

/**
 * @author Samraddhi Khare
 * @creation_date 4th October 2019 10:00AM
 * @modification_date 10th October 2019 4:02AM
 * @version 3.0
 * @copyright Zensar Technologies. All rights reserved
 * @Description It is a dao class of product using in persistence.
 *            
 */

@Repository
public class ProductDaoImpl implements ProductDao 
{ 
   @Autowired
   private JdbcTemplate jdbcTemplate;
   
   
	@Override
	public List<Product2> getAll()
	{
		// TODO Auto-generated method stub
		String sql="select * from product2";
		
		
		return jdbcTemplate.query(sql,new ResultSetExtractor<List<Product2>>() 
		{
			
		public List<Product2> extractData(ResultSet rs) throws SQLException, DataAccessException 
		{
				List<Product2>products=new ArrayList<>();
				while(rs.next()) {
					
					Product2 product=new Product2();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getDouble(4));
					products.add(product);
	
				}
				return products;
		  }
		});
	}

	@Override
	public Product2 getById(int productId) {
		// TODO Auto-generated method stub
		String sql="select * from product2 where id=?";
		return jdbcTemplate.query(sql,new Object[] {productId},new ResultSetExtractor<Product2>() {

			
			@Override
			public Product2 extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if(rs.next())
				{

					Product2 product=new Product2();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getDouble(4));
					
					return product;
				}
				
				
				else {
			             return null;
				}
			}

		});
	}
      
	@Override
	public void update(Product2 product) 
	{
		String sql="update Product2 set name=?, brand=?, price=? where id=?";
		jdbcTemplate.update(sql, product.getName(),product.getBrand(),product.getPrice(), product.getProductId());
		System.out.println("product updated");
		
	}

	@Override
	public void insert(Product2 product) 
	{
		// TODO Auto-generated method stub
		String sql="insert into product2 values(?,?,?)";
		jdbcTemplate.update(sql, product.getProductId(),product.getName(),product.getBrand(),product.getPrice());
		System.out.println("insertion is successful");
		
		
	}

	@Override
	public void delete(Product2 product)
	{
		// TODO Auto-generated method stub

		String sql="delete from product2 where id=?";
		jdbcTemplate.update(sql, product.getProductId());
		System.out.println("product deleted");
		
	}
}