package com.zensar.spring.performers;
import com.zensar.spring.poems.Poem;


public class PoeticJuggler extends Juggler{
      
     private Poem poem;
 
       public PoeticJuggler() 
     {
    	   
	 System.out.println("no argument constructor of poetic jugglers");
	 
     }
   public PoeticJuggler(int beanBags,Poem poem) {
	   super(beanBags);
	   this.poem=poem;
	   System.out.println("parameterized constrcutor of poetic juggler");
   }
   public void perform() {
	   super.perform();
	   System.out.println("while reciting poem");
	   poem.recite();
   }
}



