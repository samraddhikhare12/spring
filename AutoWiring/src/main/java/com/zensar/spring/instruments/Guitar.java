package com.zensar.spring.instruments;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument{
	
	public void play() {
		// TODO Auto-generated method stub
		 System.out.println("ting ting ting");
	}

}
