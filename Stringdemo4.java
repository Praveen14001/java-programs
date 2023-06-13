package com.learning;

public class Stringdemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Amal Raj";
	    for(int i=0; i<name.length(); i++)
	    {
	    char letter = name.charAt(i); //letter = A
	//if the letter is present in between 'a' and 'z':
	    if(letter>='a' && letter<='z')
	      System.out.print((char)(letter-32));
	    else
	      System.out.print(letter);
	    }

	}

}
