package com.zensar.spring.poems;

public class TwinkleTwinkle implements Poem {
   private static final String LINES[]= {
		   "Twinkle twinkle little start",
		   "how i wonder what you are",
		   "up above and world so high",
		   "like a diamond in the sky"
   };
	@Override
	public void recite() {
		// TODO Auto-generated method stub
     for (String poem: LINES) {
		System.out.println(poem);
	}
	}

}
