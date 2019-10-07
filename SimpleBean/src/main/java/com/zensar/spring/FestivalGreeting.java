package com.zensar.spring;

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
