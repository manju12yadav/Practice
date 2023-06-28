package com.interviewChallenges;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class TyChallenges01to10
{

	//	1.input: Welcome to expleo
	//	output:expleo to welcome
	@Test
	public void p1()
	{
		System.out.println("=======Program :-1=========");

		String s="Welcome to expleo";
		String[] st = s.split(" ");
		for (int i = st.length-1; i >= 0; i--) {
			System.out.print(st[i]+" ");
		}

		System.out.println("===========================");
	}





	//	Remove Duplicates from a String
	@Test
	public void p2()
	{
		System.out.println("=======Program :-2=========");

		String s="neonnoblegas";  //n e o b l g a s
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			System.out.print(ch+" ");
		}

	}

	//	Remove duplicate words

	@Test
	public void p3()
	{
		System.out.println("=======Program :-3=========");
		String s="i am neon but i am fearless"; //i am neon but fearless

		String[] st = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < st.length; i++) {
			set.add(st[i]);
		}
		for (String str : set) {
			System.out.print(str+" ");
		}
		System.out.println();
		System.out.println("===========================");

	}

	@Test
	public void p4()
	{
		System.out.println("=======Program :-4=========");
		String s="today is friday";
		String[] st = s.split(" ");
		for (int i = st.length-1; i >= 0; i--) {
			System.out.print(st[i]+" ");
		}
		System.out.println();
		System.out.println("===========================");
	}

	//	Insert a String into middle of String array

	@Test
	public void p5()
	{
		System.out.println("=======Program :-5=========");
		String[] s= {"hari","manju","kiran","veeeru"};
		String[] add=new String[s.length+1];
		int h = (add.length)/2;
		String st="kala";
		System.out.println(h);
		
		for (int i = 0; i < h; i++) {
			add[i]=s[i];
		}
		add[h]=st;
		for (int i = h+1; i < add.length; i++) {
			add[i]=s[i-1];
		}
		for (int i = 0; i < add.length; i++) {
			System.out.println(add[i]);
		}
	}

	//Reverse the words in a String
	@Test
	public void p6()
	{
		System.out.println("=======Program :-6=========");
		String s="i am broot";
		String[] st = s.split(" ");

		for (int i = 0; i < st.length; i++) {
			String str = st[i];
			for (int j = str.length()-1; j >=0; j--) {

				System.out.print(str.charAt(j)+"");
			}
			System.out.print(" ");
		}

	}

	//	input: aaabbcdddf
	//	output: a3b2cd3f

	@Test
	public void p7()
	{
		System.out.println("=======Program :-7=========");

		String s="aaabbcdddf";
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {

			int count=0;
			for (int i = 0; i < s.length(); i++) {

				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.print(ch+""+count);
			}
			else
			{
				System.out.print(ch);
			}

		}
	}

	//	input:{7,-3,0,2,1,-9} find first max element without bubble sorting

	@Test
	public void p8()
	{
		System.out.println("=======Program :-8=========");

		int[] ar= {7,-3,0,2,1,-9};
		int max=ar[0];
		for (int i = 0; i < ar.length; i++) 
		{
			if(max<=ar[i])
			{
				max=ar[i];
			}
		}
		System.out.println(max);

	}

	//	Product of Max 3 Element
	@Test
	public void p9()
	{
		System.out.println("=======Program :-9=========");
		int ar[]= {8,2,4,3,1};
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = i+1; j < ar.length; j++) 
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}

		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("Product of: "+ar[1]*ar[2]*ar[3]);	

	}
	//	input: i am selenium
	//	output: m ui nelesmai

	@Test
	public void p10()
	{
		System.out.println("=======Program :-10=========");

		String s="i am selenium";
		String rev="";
		for (int i = s.length()-1; i >=0 ; i--) 
		{
			if(s.charAt(i)!=' ')
			{
				rev=rev+s.charAt(i);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ')
			{
				rev=rev.substring(0,i)+" "+rev.substring(i,rev.length());
			}
		}
		System.out.println(rev);
	}
	
	
}
