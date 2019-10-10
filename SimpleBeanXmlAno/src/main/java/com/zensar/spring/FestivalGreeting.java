package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("festival")
public class FestivalGreeting implements Greeting{
  
	public String greet()
	{
		return "happy Navratri";	
	}
	public FestivalGreeting()
	{
		System.out.println("festival greeting is created");
	}
}
