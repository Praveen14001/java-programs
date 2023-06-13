package com.learning;

public class choco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Chocolate Problem
	    {
	        int totalChoco= 15;
	        int totalWrap= totalChoco;

	        while (totalWrap >= 3)
	        {
	            int freeChoco = totalWrap / 3;
	            totalChoco = freeChoco + totalChoco;
	            totalWrap= totalWrap % 3;
	            totalWrap= totalWrap + freeChoco;
	        }
	        System.out.println(totalChoco);
	    }
	}

}
