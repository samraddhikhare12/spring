package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.AnniversayGreeting;
import com.zensar.spring.FestivalGreeting;
import com.zensar.spring.Greeting;

    //creating of obj of ioc container
    public class SpringMain {

	public static void main(String[] args)
	
	{	
	//creating obj of ioc container
	ApplicationContext var= new ClassPathXmlApplicationContext("greeting.xml");
	Greeting g= var.getBean("AnniversayGreeting",Greeting.class);
	System.out.println(g.greet());
		
	Greeting g1= var.getBean("festival",Greeting.class);
	System.out.println(g1.greet());
	}
}
