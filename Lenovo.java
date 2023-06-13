package com.learning;

public class Lenovo extends Laptop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Lenovo lenovo = new Lenovo();
   lenovo.browse();
   lenovo.doProgram();
   lenovo.touch_screen();
   System.out.println(lenovo.harddisk);
   
	}
	void touch_screen()
	  {
	    System.out.println("Touch Screen");
	  }
}
