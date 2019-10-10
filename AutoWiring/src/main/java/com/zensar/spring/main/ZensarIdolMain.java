package com.zensar.spring.main;

import org.checkerframework.checker.units.qual.Acceleration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.zensar.performers.Performer;
import com.zensar.spring.config.PerformerConfig;

public class ZensarIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new AnnotationConfigApplicationContext(PerformerConfig.class);
		Performer p=ctx.getBean("pyare mohan", Performer.class);
		p.Performe();
	       
	}

}
