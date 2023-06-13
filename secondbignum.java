package com.learning;

public class secondbignum {

	  public static void main(String[] args) {
	    int[] marks= {92,93,89,100,99};
	    
	    secondbignum bn = new secondbignum();
	    bn.Find_Second_Big_number_in_Array(marks);

	  }

	  private void Find_Second_Big_number_in_Array(int[] marks) {
	    int big = Integer.MIN_VALUE,sbig=Integer.MIN_VALUE;
	    for(int i=0;i<marks.length;i++) {
	      if(marks[i]>big) { 
	        sbig=big;
	        big=marks[i];
	      }
	      else if(marks[i]>sbig) {
	        sbig=marks[i]; 
	      }
	    }
	    
	    System.out.println("Bigest value in Array : "+big);
	    System.out.println("Second Bigest value in Array : "+sbig);
	  }

	}