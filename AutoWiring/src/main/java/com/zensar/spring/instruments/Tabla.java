package com.zensar.spring.instruments;

import org.springframework.stereotype.Component;

@Component
public class Tabla implements Instrument{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("tab taba tab tab");
	}
}
