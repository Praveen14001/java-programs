package com.learning;

public class matrix3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[][]={{1,2,3},{5,6,7},{8,9,10}};    
		int b[][]={{1,2,3},{4,5,6},{7,8,9}};
		int c[][]=new int [3][3];
	    for(int j=0;j<a.length;j++) {
		     for(int i=0;i<a.length;i++) {
		      c[j][i]=a[j][i]*b[j][i];
		      System.out.println(c[j][i]);
		     }
		     
		    }

	}




		
		

	}


