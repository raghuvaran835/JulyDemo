package com.java.exercise;

public class LargeCalculation {
	
	public int large(int ... a)
	{
		int big=0;
		for(int i:a)
		{
			if(i>big)
			{
				big=i;
			}
		}
		return big;
		
	}

}
