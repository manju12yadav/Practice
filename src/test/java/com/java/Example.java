package com.java;

public class Example {

	static int a=100;
	public static void main(String[] args) 
	{
		Example s=new Example();
		int a=50;
		System.out.println(s.a);
		System.out.println(a);
		add();
	}
	
	public static void add()
	{
		System.out.println(a);
	}
	
}
