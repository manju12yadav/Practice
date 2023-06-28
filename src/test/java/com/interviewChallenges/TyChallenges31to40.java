package com.interviewChallenges;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class TyChallenges31to40 {

	//	58. str= "i a1m goi123ng to fi3215nd pro234duct for the num1212bers ins1212ide th1212is st3245ring";
	//	O/p: 1*123*3215*234*1212*1212*1212*3245
	//	Output should be product of these

	@Test
	public void p31()
	{
		System.out.println("=======Program :-31=========");
		String str= "i a1m goi123ng to fi3215nd pro234duct for the num1212bers ins1212ide th1212is st3245ring";
//			o/p - 1*123*3215*234*1212*1212*1212*3245*-361053038934760064
		
		String[] s = str.split(" ");
		long product = 1;
		for(int i=0 ;i<s.length;i++)
		{
			String s1 = s[i];
			long sum =0;
			for(int j=0 ; j<s1.length();j++)
			{
				char ch = s1.charAt(j);
				if(ch>='0'&& ch<='9')
				{
					Character c = ch;
					String s2 = c.toString();
					long a = Long.parseLong(s2);
					sum=sum * 10+a;			 
				}
			}

			if(sum != 0)
			{
				System.out.print(sum+"*");
				product = product * sum;
			}
		}
		System.out.println(product);

	}

	//	59. Programs find consonants in a string, without duplicate print the string, count the characters in the string

	@Test
	public void p32()
	{
		System.out.println("=======Program :-32=========");


		String s="potteti pushpakala";
		String[] st = s.split(" ");
		int count=0;
		for (int i = 0; i < st.length; i++) {
			String str = st[i];
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch==' ')
				{
					System.out.print("");
				}
				else
				{
					count++;
				}
			}
		}
		System.out.println(count);

	}


	//	int = {1,2,3}  o/p- {3,4,5}

	@Test
	public void p33()
	{
		System.out.println("=======Program :-33=========");

		int []a= {1,2,3};
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				System.out.println(a[i]+a[j]);

			}
		}

	}

	//	60. Program on sort an given array and remove duplicate in given array

	@Test
	public void p34()
	{
		System.out.println("=======Program :-34=========");

		int a[]= {5,9,8,2,5,1,4,6,2,1};

		TreeSet<Integer> set=new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			set.add(n);
		}
		for (Integer in : set) {
			System.out.println(in);
		}
	}


	//	61. String s="this is java programming questions"
	//	Reverse the alternative words and count;

	@Test
	public void p35()
	{
		System.out.println("=======Program :-35=========");

		String s="this is java programming questions"; //si gnimmargorp
		String[] st = s.split(" ");
		String rev="";
		for (int i = 0; i <st.length; i++) {
			String str = st[i]+" ";
			for (int j = str.length()-1; j >=0; j--) 
			{
				if(i%2==1)
				{
					rev=rev+str.charAt(j);
				}
			}
		}
		System.out.println(rev);
	}

	//	63. Print the 0th,10th,100th,1000th place in given number

	@Test
	public void p36()
	{
		System.out.println("=======Program :-36=========");

		long dig=14521;
		for (int i = 0; i < dig; i++) {
			if(i==10||i==100||i==1000||i==0)
			{
				System.out.println(i);
			}
		}

	}
	//	64. String s="this is fun show"; s1="fun tv show" o/p : this is tv

	@Test
	public void p37()
	{
		System.out.println("=======Program :-37=========");
		String s="this is fun show", s1="fun tv show";
		s=s+" "+s1;
		String[] st = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < st.length; i++) 
		{
			set.add(st[i]);
		}
		for (String str : set) 
		{
			int count=0;
			for (int i = 0; i < st.length; i++) 
			{

				if(str.equals(st[i]))
				{
					count++;
				}
			}
			if(count==1)
				System.out.print(str+" ");
		}

	}

	//	54. Write a java program to get the frequency of odd and even numbers in the given matrix

	@Test
	public void p38()
	{
		System.out.println("=======Program :-38=========");
		//		int[][] mat=new int[3][2];
		int[][] mat= 
			{
					{4,1,5},
					{5,3,6}
			};
		int even=0;
		int odd=0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j]%2==0)
				{
					even++;
				}
				else
				{
					odd++;
				}
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}


	//WAJP to print Character and Number Separate without duplicates

	@Test
	public void p39()
	{
		System.out.println("=======Program :-39=========");
		
		String s="KA59HA9019";
		LinkedHashSet<Character> lh1=new LinkedHashSet<Character>();
		LinkedHashSet<Character> lh2=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				lh1.add(ch);
			}
			else
			{
				lh2.add(ch);
			}
		}
		for (Character num : lh1) {
			System.out.print(num+" ");
		}
		System.out.println();

		for (Character alp : lh2) {
			System.out.print(alp+" ");
		}
	}

//Count Digits in a Number

	@Test
	public void p40()
	{
		System.out.println("=======Program :-40=========");
		
		int num=152142;
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		while(num!=0)
		{
			int n=num%10;
			if(hm.containsKey(n))
			{
				hm.put(n, hm.get(n)+1);
			}
			else
			{
				hm.put(n,1);
			}
			num=num/10;
		}
		for (Entry<Integer, Integer> entry : hm.entrySet()) {
			if(entry.getValue()>=1)
			{
				System.out.println(entry.getKey()+" = "+entry.getValue());
			}
		}

	}

}