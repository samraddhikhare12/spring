package com.zensar.performers;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer{
     private Map<Instrument,String> instrumentSongMap;
     
     
	

	public Map<Instrument, String> getInstrumentSongMap() {
		return instrumentSongMap;
	}



	public void setInstrumentSongMap(Map<Instrument, String> instrumentSongMap) {
		this.instrumentSongMap = instrumentSongMap;
	}

	@Override
	public void Performe() {
		
		
		for (Map.Entry<Instrument,String> entry : instrumentSongMap.entrySet())
		{
		    entry.getKey().play();
		    
		    System.out.println("instrumentalist is playing" +entry.getValue());
			
		}
		
		
	}
}	
	
