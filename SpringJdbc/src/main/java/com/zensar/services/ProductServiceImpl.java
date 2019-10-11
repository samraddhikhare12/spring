package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dao.ProductDao;
import com.zensar.dao.ProductDaoImpl;
import com.zensar.entities.Product2;
@Service
public class ProductServiceImpl implements ProductService
{   @Autowired
	private ProductDao  productDao;
	
	public List<Product2> findAllProduct() 
	{
		
		return productDao.getAll();
	}

	@Override
	public Product2 findProductId(int productId) {
	
		return productDao.getById(productId);
	}

	@Override
	public void add(Product2 product) {
	productDao.insert(product);

	}

	@Override
	public void update(Product2 product) {
		// TODO Auto-generated method stub
      productDao.update(product);
	}

	@Override
	public void remove(Product2 product) {
		// TODO Auto-generated method stub
      productDao.delete(product);
	}

	@Override
	public List<Product2> findProductByPriceRange(float maxPrice, float minPrice) {
	
		List<Product2>products=productDao.getAll();
		List<Product2>products1=new ArrayList<>();
		
		for (Product2 product : products) 
		{
			float price = (float) product.getPrice();
			if(price>=minPrice && price<=maxPrice) 
			{
				products1.add(product);
			}
			
		}
		
		
		return products1;
	}
	
	
	@Override
	public List<Product2> findProductByName(String name) {
		// TODO Auto-generated method stub
		List<Product2>products=productDao.getAll();
		List<Product2>products1=new ArrayList<>();
		for (Product2 product2 : products)
		{
			if(product2.getName().equals(name)) {
				products1.add(product2);
			}
		} 
			
		return products1;
		
		
	}

	@Override
	public List<Product2> findProductByBrand(String brand) {
		// TODO Auto-generated method stub
		List<Product2>products=productDao.getAll();
		List<Product2>products1=new ArrayList<>();
		for (Product2 product2 : products)
		{
			if(product2.getBrand().equals(brand)) {
				products1.add(product2);
			}
		} 
			
		return products1;
		
		
	}

	@Override
	public long getProduct2Count()
	{
		List<Product2>products=productDao.getAll();
		List<Product2>products1=new ArrayList<>();
		long count=products.size();
		
			
		return count;
	}

}
