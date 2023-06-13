package com.learning;

public class charcater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "100abcd";
		int count =0; 
		  for(int i=0;i<password.length();i++)
		  {
		    char ch = password.charAt(i);
		    if(ch>='0' && ch<='9')
		    {
		      count++; 
		    }
		  }
		  if(count == password.length())
		  {
		    System.out.println("yes all numbers");
		  }
		  else
		  {
		    System.out.println("no other datatypes");
		  }

	}

}
