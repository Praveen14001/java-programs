package com.learning;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name:");
	    Scanner sc=new Scanner(System.in);
	    String n=sc.next();
	    int count=0;
	    for(int i=0;i<n.length();i++)
	    {
	    if(n.charAt(i)=='a'||`n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o'||n.charAt(i)=='u')
	    {
	      System.out.println("The vowels are: "+ n.charAt(i));
	      count++;
	    }
	    
	    }
	    System.out.println("count of vowels: "+count);

	}

}
