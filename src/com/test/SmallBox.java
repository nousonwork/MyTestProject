package com.test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SmallBox extends BigBox {

	

	   public void add() {
	      System.out.println("This is small box add");
	   }

	   public void get() {
		   System.out.println("This is small box get");
	   }

	   
}



interface A{
	
	public void show() throws IOException;
}


interface B{
	
	public void show() throws FileNotFoundException;
}


/*
 * interface C extends A, B{
 * 
 * public void show();
 * 
 * }
 */

class D implements A, B{

	@Override
	public void show() {
		
		
	}
	
}