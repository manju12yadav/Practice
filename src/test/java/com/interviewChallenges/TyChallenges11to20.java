package com.interviewChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class TyChallenges11to20 
{

	//	14. Print 1-20,all the no. which are divisible by 2
	@Test
	public void p11()
	{
		System.out.println("=======Program :-11=========");

		for (int i = 1; i <=20; i++) {
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}

	//	String s="My name is rishav it contains ri and shav" 
	//	Print occurance of word
	@Test
	public void p12()
	{
		System.out.println("=======Program :-12=========");

		String s="My name is rishav it contains ri and shav";
		String[] st = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < st.length; i++) {
			set.add(st[i]);
		}
		for (String str : set) {
			int count=0;
			for (int i = 0; i < st.length; i++) {
				if(str==st[i])
				{
					count++;
				}
			}
			if(count>=1)
			{
				System.out.println(str+"-"+count);
			}
		}
	}

	//	WAP to print 1 to 100 prime no

	@Test
	public void p13()                                                                    
	{
		System.out.println("=======Program :-13=========");

		int n=100;  //		2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
		for (int i =1; i<=n; i++)
		{
			int count=0;
			for (int j = 1; j <=i; j++) 
			{
				
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}

		}
	}

	//	WAP to print count of characters I/P-aweexxxyyyyy

	@Test
	public void p14()
	{
		System.out.println("=======Program :-14=========");

		String s="aweexxxyyyyy"; //a1w1e2x3y5
		
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) 
		{
			set.add(s.charAt(i));
		}
		for (Character ch : set) 
		{

			int count=0;
			for (int i = 0; i < s.length(); i++) 
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count>=1)
			{
				System.out.print(ch+""+count);
			}

		}
	}
	
	@Test
	public void p14a()
	{
		System.out.println("=======Program :-14a=========");

		String s="aweexxxyyyyy"; //a1w1e2x3y5
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) 
		{
			if(map.containsKey(s.charAt(i)))
			{
			map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else
			{
				map.put(s.charAt(i), 1);
			}
		}
		for ( Entry<Character, Integer> entry: map.entrySet()) {
			System.out.print(entry.getKey()+""+entry.getValue());
		}
	}
	


	//	23. Print the character which are not duplicate in sorting order
	@Test
	public void p15()
	{
		System.out.println("=======Program :-15=========");
		String s="manjunath";
		TreeSet<Character> set=new TreeSet<Character>();
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
			if(count==1)
			{
				System.out.println(ch);
			}
		}
	}

	//	24. input: String s="aabcbbdeaa";
	//	o/p : aa ab bc cb bb bd de ea aa 

	@Test
	public void p16()
	{
		System.out.println("=======Program :-16========");

		String s="aabcbbdeaa";
		//aa ab bc cb bb bd de ea aa 

		for (int i = 0; i < s.length()-1; i++)
		{
			System.out.print(s.charAt(i)+""+s.charAt(i+1)+" ");
		}
	}

	//	25.27. if arr[]= {1,2,5} Print the no. in b/w 1-10 except the no. which are present in array

	@Test
	public void p17()
	{
		System.out.println("=======Program :-17=========");
		
		int arr[]= {2,5,1};
		for (int i = 1; i <=10; i++) 
		{
			int count=0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]==i)
				{
					count++;
				}
			}
			if(count!=1)
			{
				System.out.println(i);
			}
			
		}
	}
//	26.  input: "Selenium";
//	s se sel sele selen seleni seleniu selenium
	@Test
	public void p18()
	{
		System.out.println("=======Program :-18=========");
		
		String s="Selenium";
		String st = s.toLowerCase();
		String str="";
		for (int i = 0; i < st.length(); i++)
		{
				str=str+st.charAt(i);
				System.out.print(str+" ");
			
		}
		
	}
	
//	33. Program to remove while space and replace it with a comma
	
	@Test
	public void p19()
	{
		System.out.println("=======Program :-19=========");
		String s="I am Hari Krishna";
		s=s.replaceAll(" ", ",");
		System.out.println(s);
	}
	
//	34. Java program for taking input in ArrayList and returning in an Array
	
	@Test
	public void p20()
	{
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(20);
		ar.add(25);
		ar.add(15);
		ar.add(12);
		System.out.println(ar);
	}
	
	
	
}
