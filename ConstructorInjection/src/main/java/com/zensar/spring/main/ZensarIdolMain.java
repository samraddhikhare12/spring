package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		ApplicationContext var= new ClassPathXmlApplicationContext("performance.xml");
		
		Performer p= var.getBean("pyare mohan",Performer.class);
		p.perform();
	}

}
