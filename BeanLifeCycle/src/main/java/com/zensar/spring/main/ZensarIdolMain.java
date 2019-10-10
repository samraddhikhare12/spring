package com.zensar.spring.main;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("performance.xml");
	    Performer p=ctx.getBean("sonu nigam", Performer.class);   
	    p.Performe();
	    ConfigurableApplicationContext cfgCtx=(ConfigurableApplicationContext) ctx;
	    cfgCtx.close();
	    
	
	}
}
