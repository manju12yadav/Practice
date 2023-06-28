package com.logicalPrgms;

public class Recursion 
{
	static int i=0;
	public static void rec()
	{
		
		i++;
		if(i<5)
		{
			System.out.println("rec");
			rec();
		}
	}
	
	
	public static void main(String[] args) 
	{
		rec();
	}

}
