package com.learning;

import java.util.Scanner;

public class calculatorsub {


	  public static void main(String[] args) {
		    // TODO Auto-generated method stub
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter first number: ");
		    int firstnumber = sc.nextInt();
		    
		    System.out.println("Enter second number: ");
		    int secondnumber = sc.nextInt();
		    
		    int answer = firstnumber - secondnumber;
		    System.out.println("Sum is: "+  answer);

	}
	
}
