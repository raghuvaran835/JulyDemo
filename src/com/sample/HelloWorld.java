package com.sample;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Values of a and b:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("The sum of Two numbers is: "+c);

	}

}
