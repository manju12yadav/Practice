package com.patterns;

import org.testng.annotations.Test;

public class InterviewPattern 
{
	
//	0,0  0,1  0,2  0,3  0,4  
//	1,0  1,1  1,2  1,3  1,4  
//	2,0  2,1  2,2  2,3  2,4  
//	3,0  3,1  3,2  3,3  3,4  
//	4,0  4,1  4,2  4,3  4,4

	@Test
	public void p()
	{
		int n=4;
		for(int i=0;i<=n;i++)
		{
			for (int j = 0; j <=n; j++) {
				System.out.print(i+","+j+"  ");
			}
			System.out.println();
		}
	}
	
	
//    	    * 
//        * * 
//      * * * 
//    * * * * 
//  * * * * * 
//    * * * * 
//  	* * * 
//  	  * * 
//  	  	*	

	
	
	@Test
	public void p1()
	{
		int n = 4; 

		for (int i = 0; i <n; i++) 
		{
			for (int j = i+1; j <n; j++) 
			{
				System.out.print("  ");
			}
			for (int j = 0; j <=i; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <n; i++) 
		{
			for (int j = 0; j <i; j++) 
			{
				System.out.print("  ");
			}
			for (int j = i; j <n; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}


	//   * 
	//  * * 
	// * * * 
	//* * * * 
	//    
	//   * 
	//  * * 
	// * * * 
	//* * * * 
	//    
	//   * 
	//  * * 
	// * * * 
	//* * * * 

	@Test
	public void p2()
	{
		int n=5;
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j <n ; j++) 
			{
				for (int k = j; k < n; k++) {
					System.out.print(" ");
				}
				for (int k = 0; k < j; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}


		}
	}

	//	      10 
	//	   11 12 
	//	13 14 15 
	//	      16 
	//	   17 18 
	//	19 20 21 
	//	      22 
	//	   23 24 
	//	25 26 27

	@Test
	public void p3()
	{
		int n=3;
		int m=11;
		char c='a';
		for (int i = 1; i <=3; i++) 
		{
			for (int j = 1; j <=n ; j++) 
			{
				for (int k = j; k < n; k++) {
					System.out.print("   ");
				}
				for (int k = 1; k <=j; k++) {
					System.out.print(m+" ");
					c++;
					m++;
				}
				System.out.println();
			}
		}
	}

	//      * 
	//    * * 
	//  * * * 
	//      * 
	//    * * 
	//  * * *

	@Test
	public void p4()
	{
		int n=3;
		int m=10;
		for (int j = 1; j <=n ; j++) 
		{
			for (int k = j; k <=n; k++) {
				System.out.print("  ");
			}
			for (int k = 1; k <=j; k++) {
				System.out.print("* ");
				m++;
			}
			System.out.println();
		}
		for (int j = 1; j <=n ; j++) 
		{
			for (int k = j; k <=n; k++) {
				System.out.print("  ");
			}
			for (int k = 1; k <=j; k++) {
				System.out.print("* ");
				m++;
			}
			System.out.println();
		}
	}


	//	m         
	//	 a        
	//	  n       
	//	   j      
	//	    u     
	//	     n    
	//	      a   
	//	       t  
	//	        h

	@Test
	public void p5()
	{
		String s="manjunath";
		int n=s.length();
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if(i==j)
				{
					System.out.print(s.charAt(i)+" ");	
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}

	//			  u
	//			j u
	//		  n j u
	//		a n j u
	//	  m a n j u

	@Test
	public void p6()
	{
		String s="manjunath",rev="";
		int n=s.length()-1;
		for (int i = n; i>=0 ; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		int m = rev.length();
		for (int i = 0; i < m; i++) {
			for (int j = m-i; j >1; j--) {
				System.out.print("  ");
			}
			for (int j = i; j>=0; j--) {
				System.out.print(rev.charAt(j)+" ");
			}
			System.out.println();
		}


	}
	
//        * 
//      * * 
//    * * * 
//  * * * * 
//    	  * * * * 
//    	  * * * 
//    	  * * 
//    	  * 
	
	
	
	@Test
	public void p7()
	{
		int n=4;
		for (int i = 0; i < n; i++)
		{
			for (int j = i+1; j < n; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n; i < n*2; i++) {
			for (int j = 0; j <n-1 ; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <n*2 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}


}
