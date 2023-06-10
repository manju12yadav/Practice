package com.logicalPrgms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class SpecialOperations 
{

	@Test
	public void numToWord() 
	{
		Scanner sc=new Scanner(System.in);
		int amt=sc.nextInt();
		nw(amt/10000000,"Crore");
		nw(amt/100000%100,"Lakh");
		nw(amt/1000%100,"Thousand");
		nw(amt/100%10,"Hundred");
		nw(amt%100,"");
	}

	public static void nw(int x,String st)
	{
		String fw[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","Twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String sw[]={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		if(x<20)
			System.out.print(fw[x]);
		else
			System.out.print(sw[x/10]+fw[x%10]);

		if(x!=0)
			System.out.print(st+" ");
	}

}
