package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component
public class AnniversayGreeting implements Greeting {

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "happy Anniversay";
	}
public AnniversayGreeting() {
	// TODO Auto-generated constructor stub
	System.out.println("Anniversay Greeting card");
      }
}
