package com.interviewChallenges;

import java.util.Iterator;

import org.testng.annotations.Test;

public class TyChallenges21to30 
{
//	35. i/p= my name is neon -- o/p=mynameisneon
	
	@Test
	public void p21()
	{
		System.out.println("=======Program :-21=========");
		
		String s="my name is neon";
		s=s.replaceAll(" ","");
		System.out.println(s);
	}
	
//	36. i/p=my name is neon  o/p=noen si eman ym
	
	
	
	@Test
	public void p22()
	{
		System.out.println("=======Program :-22=========");
		
		String s="my name is neon";
		String[] st = s.split(" ");
		String rev="";
		for (int i = st.length-1; i>=0  ; i--)
		{
			String str = st[i]+" ";
			for (int j = str.length()-1; j>=0 ; j--) 
			{
				rev=rev+str.charAt(j);
				
			}
		}
		System.out.println(rev);
	}
	
//37,38 & 39 WJP for to find vowel count in a words
	//input Vijay,Vivek,Jawahar
	@Test
	public void p23()
	{
		System.out.println("=======Program :-23=========");
		
		String[] st= {"vijay","vivek","jawahar"};
		
		for (int i = 0; i < st.length; i++) {
			String s = st[i];
			int count=0;
			for (int j = 0; j < s.length(); j++) {
				char ch = s.charAt(j);
				
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
				}
			}
			System.out.println(st[i]+" "+count);
		}
		
	}
	
// 41 -	Palindrome
	@Test
	public void p24()
	{
		System.out.println("=======Program :-24=========");
		
		String s="malayalam";
		String rev="";
		for (int i = s.length()-1; i>=0 ; i--) 
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println(rev+" is a Palindrome");
		}
		else
		{
			System.out.println(rev+" is not Palindrome");
		}
	}
	
//	42 - Program for super call statement

//	45 - Input is "i am in ooty";
//	o/p - ma ni ytoo
	
	@Test
	public void p25()
	{
		System.out.println("=======Program :-25=========");

		
		String s="i am in ooty";

		String[] st = s.split(" ");
		String rev="";
		for (int i = 0; i < st.length; i++) 
		{
			String str = st[i]+" ";
			for (int j = str.length()-1; j>=0; j--)
			{
				if(str.length()>2)
				{
				rev=rev+str.charAt(j);
				}
			}
		}
		System.out.println(rev);
	}
	
//	47. String s="immunuties" Count of 'u' alphabet present
	
	@Test
	public void p26()
	{
		System.out.println("=======Program :-26=========");
		
		String s="immunuties";
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if(ch=='u')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

//	48. Print Vowels in a String
	@Test
	public void p27()
	{
		System.out.println("=======Program :-27=========");
		
		String s="education";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
//	A 
//	A B 
//	A B C 
//	A B C D 
//	A B C D E 
//	A B C D E F
	
	@Test
	public void p28()
	{
		System.out.println("=======Program :-28=========");
		int n=5;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print((char)(65+j)+" ");
			}
			System.out.println();
		}
	}
	
//	50. I/p :{1,3,5,2,8,9,10} Print combination of numbers sum of numbers should be 11
	
	@Test
	public void p29()
	{
		System.out.println("=======Program :-29=========");

		int[] ar= {1,3,5,2,8,9,10};
		for (int i = 0; i < ar.length; i++)
		{
			
			for (int j = 0; j < ar.length; j++) 
			{
				
				if(ar[i]+ar[j]==11)
				{
					System.out.println(ar[i]+ar[j]);
				}
			}
		}
	}
// 52.i/P:"AfgaDFkGdm" , based on ascii value which is the greatest character, which is repeated moore times.
	
	@Test
	public void p30()
	{
		System.out.println("=======Program :-30=========");
		
		String s="AfgaDFkGdz";
		int max=(int)(s.charAt(0));
		
		for (int i = 0; i < s.length(); i++) {
			int ch = (int)(s.charAt(i));
			if(max<=ch)
			{
				max=ch;
			}
			
		}
		System.out.println((char)(max));

	}
	
}
