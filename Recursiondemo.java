package com.learning;

public class Recursiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursiondemo rd = new Recursiondemo();
		rd.display(10);
		
	}

	private void display(int no) {
		// TODO Auto-generated method stub
	    System.out.println(no);
	    no = no+10;
	    if(no>=60) 
	    {
	      
	    display(no);
	    }
	    
	  }
}
