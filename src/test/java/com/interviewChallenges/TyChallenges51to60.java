package com.interviewChallenges;

import org.testng.annotations.Test;

import com.matrix.Matrix;

public class TyChallenges51to60 
{
	@Test
	public void p50()
	{
		System.out.println("=======Program :-50=========");
		String[][] ar = { { "a", "b", "c", "d" },{ "1", "2", "3", "4","5"}};
		//		outPut:[a1,b2,c3,d4,5]
		for(int i=0;i<ar.length;i++)
		{
			try {	
				for(int j=0;j<ar[i].length;j++)	
				{

					System.out.print(ar[i][j]+ar[i+1][j]);
				}
				if(ar.length<ar[i].length)
				{
					System.out.print(ar[i+1][ar[i].length]);
				}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	@Test
	public void p51()
	{
		System.out.println("=======Program :-51=========");

		String[][] arr = {{"a", "b", "c", "d", "e","f"}, {"1", "2", "3", "4","5"}};

		int length=arr[0].length;
		if(length<arr[1].length){
			length=arr[1].length;
		}

		String[] a = arr[0];
		String[] b= arr[1];

		for (int i = 0; i <length ; i++) {

			try {
				System.out.print(a[i]+""+b[i]+" ");
			}
			catch (Exception e) {
				try {
					System.out.print(b[i]);
				}
				catch (Exception e1) {
					System.out.print(a[i]);
				}
			}
		}
		System.out.println();
	}

	@Test
	public void p52()
	{
		System.out.println("=======Program :-52=========");
		String s="a8&*b1@3c21%!d23";
		String rev="";
		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length()-1; j>=0 ; j--) {

				char ch1 = s.charAt(i);
				char ch2 = s.charAt(j);
				if(ch1>='a' && ch1<='z'|| ch2>='a' && ch2<='z')
				{
					ch1=ch2;
					rev=rev+ch1;
					System.out.println(ch1);
				}
			}
			
		}

	}
	
	@Test
	public void p53()
	{
		System.out.println("=======Program :-53=========");
		int[] a= {1,2,3}; //354
			System.out.println(a[0]+a[1]+""+(a[1]+a[2])+""+(a[0]+a[2]));
		
		
	}
}
