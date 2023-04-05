package com.java.exercise;

public class DivionCalc {
public void Divisibleby(int n)
{
	if(n%3==0)
	{
		System.out.println("The Number is Divisible By 3");
	}
	if(n%5==0)
	{
		System.out.println("The Number is divisible by 5");
	}
	if(n%7==0)
	{
		System.out.println("The Number is divisible by 7");
	}
	if(n%9==0)
	{
		System.out.println("The Number is divisible by 9");
	}
	
	
}
public void replaceString()
{
	String str1="Proinjavaisayuvan";
	String str2="java";
	String str3="html";
	
	String res=str1.replace(str2, str3);
	System.out.println(res);

}


}

