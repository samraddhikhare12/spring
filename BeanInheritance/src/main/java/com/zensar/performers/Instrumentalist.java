package com.zensar.performers;

import org.springframework.beans.factory.BeanNameAware;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer,BeanNameAware{
	  private Instrument instrument;
	     private String song;
	     private String name;
	     
	     public Instrumentalist() {
			// TODO Auto-generated constructor stub
	    	 System.out.println("Instrumental is created");
		}
	     
		public Instrument getInstrument() {
			return instrument;
		}

		public void setInstrument(Instrument instrument) {
			this.instrument = instrument;
			System.out.println("Instrument is set");
		}

		public String getSong() {
			return song;
		}

		public void setSong(String song) {
			this.song = song;
			System.out.println("song is set");
		}

		@Override
		public void Performe()
		{
			// TODO Auto-generated method stub
			System.out.println("Instrumentalist is playing a song" +song+name);
			instrument.play();
			
		}

		@Override
		public void setBeanName(String name) {
			// TODO Auto-generated method stub
			this.name=name;
			
		}
}
