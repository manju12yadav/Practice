package com.interviewChallenges;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class TyChallenges41to50 
{
	
	//input - s="aabc";  o/p - a aa aab aabc  a ab abc  b bc  c

	@Test
	public void p41()
	{
		System.out.println("=======Program :-41=========");

		String s="aabc";
		String str="";
		for (int i = 0; i < s.length(); i++) {
			str=str+s.charAt(i);
			System.out.println(str);
		}
		String str1="";
		for (int i = 1; i < s.length(); i++) {
			str1=str1+s.charAt(i);
			System.out.println(str1); 
		}
		String str2="";
		for (int i = 2; i < s.length(); i++) {
			str2=str2+s.charAt(i);
			System.out.println(str2);
		}
		System.out.println(s.charAt(s.length()-1));

	}
	

	//input - s="aabc";  o/p - a aa aab aabc  a ab abc  b bc  c
	@Test
	public void p42()
	{
		System.out.println("=======Program :-42=========");
		String s="aabc"; 

		for (int i = 0; i <=s.length(); i++) {
			for (int j = i; j <=s.length(); j++) {
				System.out.print(s.substring(i,j)+" ");
			}
		}
	}

//	s="i am neon i am from blr";
	//O/P
//	i : 2
//	am : 2
//	neon : 1
//	from : 1
//	blr : 1
	
	@Test
	public void p43()
	{
		System.out.println("=======Program :-43=========");
		String s="i am neon i am from blr";
		String[] str=s.split(" ");
		LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
		for(int i=0;i<str.length;i++)
		{
			if(map.containsKey(str[i]))
			{
				Integer count = map.get(str[i]);
				map.put(str[i],count+1 );
			}
			else
			{
				map.put(str[i], 1);
			}
		}
		for(Entry<String, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	
//	str="i am neon i am from blr"; - 7
	
	@Test
	public void p44()
	{
		System.out.println("=======Program :-44=========");
		String str="i am neon i am from blr";
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("Number of words in the string: " + count);
	}
	

//	s="i am neon i am from blr";
	//O/P
//	i : 2
//	am : 2
//	neon : 1
//	from : 1
//	blr : 1

	@Test
	public void p45()
	{
		System.out.println("=======Program :-45=========");
		String st="i am neon i am from blr";
		String[] str = st.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			int count=1;
			for (int j = i+1; j < str.length; j++) 
			{
				if(str[i].equals(str[j]))
				{
					count++;
					str[j]="*";
				}
			}
			if(count >=1 && str[i]!="*")
			{
				System.out.println(str[i]+" "+count);
			}
		}
		
	}

	                                                                                                                                                                                                                                                                                                                                                                                                                  
	
	@Test
	public void p46()
	{
		System.out.println("=======Program :-46=========");
		int []a= {2,-1,3,-2,1,0};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>=0)
			{
				sum=sum+a[i];
			}

		}

		System.out.println(sum);
	}

	@Test
	public void p47()
	{
		System.out.println("=======Program :-47=========");
		//		Input:Man456ju789ya657dhav
		//		Output: 456,789,657
		String s="Man456ju789ya657dhav";
		String num="";
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c>='0' && c<='9')
			{
				num=num+c;
				flag=true; 
			}
			else
			{
				if(flag) {
					num=num+",";
					flag=false;
				}
			}
		}
		num=num.substring(0,num.length()-1);
		System.out.println(num);

	}
	
	// write java program to segregate numerical values and letters in given string 
	
	@Test
	public void p48()
	{
		System.out.println("=======Program :-48=========");
		String s="Hari143Krishna341";
		String c="";
		String n="";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='0'&& ch<='9')
			{
				n=n+ch;
			}
			else
			{
				c=c+ch;
			}
		}
		System.out.println(n);
		System.out.println(c);
	}
	
	@Test
	public void p49()
	{
		System.out.println("=======Program :-49=========");
		String s="my name is manjunath";
		String[] str = s.split(" ");
		int max=str[0].length();
		int min=str[0].length();
		
		String maxi="";
		String mini="";
		for (int i = 0; i < str.length; i++) {
			
			
			if(max<=str[i].length())
			{
//				max=str[i].length();
				maxi=str[i];
			}
			if(max>=str[i].length())
			{
//				min=str[i].length();
				mini=str[i];
			}
		}
		System.out.println(maxi);
		System.out.println(mini);
		
	}

	@Test
	public void p50()
	{
		System.out.println("=======Program :-50=========");
		int [] str= {12,123,1234,1};
		int max=str[0];
		int min=str[0];
		
		int maxi=0;
		int mini=0;
		for (int i = 0; i < str.length; i++) {
			
			
			if(max<=str[i])
			{
				maxi=str[i];
			}
			if(max>=str[i])
			{
				mini=str[i];
			}
		}
		System.out.println(maxi);
		System.out.println(mini);

		
	}
	}

