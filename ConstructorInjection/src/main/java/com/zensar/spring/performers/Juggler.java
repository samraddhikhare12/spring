package com.zensar.spring.performers;

public class Juggler implements Performer 
{
private  int beanBags;

 		public Juggler() 
 		{
 		System.out.println("no argument");
 	    }
		public Juggler(int beanBags)
		{
			super();
			this.beanBags = beanBags;
			System.out.println("parameteizsed constructor");
		}
		public void perform() 
		{
				System.out.println("jugglers juggling beanBags"+beanBags);
		}
}
