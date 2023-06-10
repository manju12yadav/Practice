package com.logicalPrgms;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Anagram 
{

	@Test
	public void anagram()
	{
		String s1="appa";
		String s2="papa";
		
		s1=s1.replaceAll(" ", "");
		s2=s2.replaceAll(" ", "");

		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] st1 = s1.toCharArray();
		char[] st2 = s2.toCharArray();
		
		Arrays.sort(st1);
		Arrays.sort(st2);
		
		Assert.assertEquals(st1, st2);
		
		System.out.println(st1);
		System.out.println(st2);
		
	}
	
	@Test
	public void ana()
	{
		 String str1="angle";
	        String str2="angel";
	        char[] sa1=str1.toCharArray();
	        char[] sa2=str2.toCharArray();
	        Arrays.sort(sa1);
	        Arrays.sort(sa2);
	        String st1 = Arrays.toString(sa1);
	        String st2 = Arrays.toString(sa2);
	        if(st1.equals(st2))
	        {
	            System.out.println("Anagram");    
	        }
	        else
	        {
	            System.out.println("Not Anagram");
	        }
	}
	
	@Test
	public void palindrome()
    {
        String s="malayalam",rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev))
        {
            System.out.println("Paliandrome");
        }
        else
        {
            System.out.println("Not Paliandrome");
        }
        
    }
}
