package com.sample;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a="+a);
		System.out.println("a="+b);
		String s="Raghuvaran";
		int l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		

	}

}
