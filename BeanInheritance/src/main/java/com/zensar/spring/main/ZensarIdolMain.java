package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("performance.xml");
		
		 Performer p=ctx.getBean("tabla", Performer.class); 
		 
		    p.Performe();
		    
		    Performer p1=ctx.getBean("", Performer.class); 
		    
		    p1.Performe();
		   
		    
		    
		    
	       
	}

}
