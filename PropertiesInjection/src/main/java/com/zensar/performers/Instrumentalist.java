package com.zensar.performers;

import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;



public class Instrumentalist implements Performer
{

	private Properties instrumentSongProps;
	
	
	
	public Properties getInstrumentSongProps() {
		return instrumentSongProps;
	}



	public void setInstrumentSongProps(Properties instrumentSongProps) {
		this.instrumentSongProps = instrumentSongProps;
	}



	public void Performe() 
	{
		System.out.println("instrumentalist is playing song");
		Enumeration instruments= instrumentSongProps.keys();
		while (instruments.hasMoreElements()) 
		{
			String veena = (String) instruments.nextElement();
			String song=instrumentSongProps.getProperty(veena);
			System.out.println(song + "by" + veena);
			
		}
		
	}
}