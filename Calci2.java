package com.learning;


import java.util.Scanner;

public class Calci2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		
		for(int i = 50; i>0;i--)
		{
			System.out.print("*"+" ");
		}

		System.out.println("\n"+"Select operation.");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		
		for(int i = 50; i>0;i--)
		{
			System.out.print("*"+" ");
		}

		System.out.println("\n"+"Enter the operation:");
		
		int operation = sc.nextInt();
		
		switch (operation) {
		case 1:
			System.out.println("Addition of given numbers:"+"\n"+num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case 2:
			System.out.println("Subtraction of given numbers:"+"\n"+ num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case 3:
			System.out.println("Multiplication of given numbers:"+"\n"+ num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case 4:
			System.out.println("Division of given numbers:"+"\n"+ num1 + " / " + num2 + " = " + (num1 / num2));
			break;
		default:
			System.out.println("Invalid operation!");
			break;
		}
	}
}
