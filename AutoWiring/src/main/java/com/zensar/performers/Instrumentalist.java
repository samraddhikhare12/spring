package com.zensar.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.zensar.spring.instruments.Instrument;
@Component("pyare mohan")
public class Instrumentalist implements Performer{
	  @Autowired
	  @Qualifier("tabla")
	  private Instrument instrument;
	  @Value("khairiyat")
	     private String song;
	  
		@Override
		public void Performe()
		{
			// TODO Auto-generated method stub
			System.out.println("Instrumentalist is playing a song" +song);
			instrument.play();
			
		}
}
