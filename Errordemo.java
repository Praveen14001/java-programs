package com.learning;

public class Errordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {100,90,97, 96, 92};
		display(marks);

		  }

		  public static void display(int[] ar) {
		    int total = 0; 
		    for(int i=0; i<5;i++)
		    {
		      total = total + ar[i];
		    }
		    
		  System.out.println("total "+ total);
		  }

	}


