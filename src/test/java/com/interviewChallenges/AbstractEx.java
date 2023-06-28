package com.interviewChallenges;

abstract class ExAbstractEx {
	static int a=10;
	static int b=20;
	public ExAbstractEx()
	{
		this(10);
		System.out.println("Constructor without arg");
	}
	public ExAbstractEx(int a)
	{
		
		System.out.println("Constructor with arg "+a);

	}
	public static void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void add1()
	{
		int c=a+b;
		System.out.println(c+" from nonstatic");
	}

}
public class AbstractEx extends ExAbstractEx
{
	public AbstractEx()
	{
		super();
	}
	
	public static void main(String[] args)
	{
	ExAbstractEx.add();
	ExAbstractEx ab=new   AbstractEx();
	ab.add1();
	}
}