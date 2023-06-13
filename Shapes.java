package com.learning;

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes square = new Shapes();
		Shapes rectangle = new Shapes();
		Shapes circle = new Shapes();
		square.calculate_area(40);
		rectangle.calculate_area(40,30);

	}
	abstract void calculate_area();

	private void calculate_area(int len,int bre) {
		// TODO Auto-generated method stub
		System.out.println(len*bre);
		
		
		
	}

	private void calculate_area(int a) {
		// TODO Auto-generated method stubs
		System.out.println(a*a);
		
	}

}
