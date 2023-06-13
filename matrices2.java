package com.learning;

public class matrices2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] a = {{1,2},{3,4}};
		    int[][] b = {{5,6},{7,8}};
		    int c[][] = new int[2][2];
		    for(int j=0;j<a.length;j++) {
		     for(int i=0;i<a.length;i++) {
		      c[j][i]=a[j][i]*b[j][i];
		      System.out.println(c[j][i]);
		     }
		     
		    }
		

	}

}
