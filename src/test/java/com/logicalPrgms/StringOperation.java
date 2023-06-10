package com.logicalPrgms;

import java.util.LinkedHashMap;

import org.testng.annotations.Test;

public class StringOperation 
{
	
	@Test
	public void string()
	{
		String str1="manjunath";;
		String str2="yadav";
		
		str1=str1.concat(str2);
		
//		System.out.println(str2);
		
		str1="manj";
//		str1=str1+str2;
//		System.out.println(str1);
		
		
		
		StringBuffer bf=new StringBuffer();
		StringBuilder bd=new StringBuilder();
		StringBuilder str3 = bd.append(str1).append(str2);
//		StringBuffer str3 = bf.append(str1).append(str2);
		System.out.println(str3);
	}
	
	
	
	
	@Test
	public void str() {
//		
//		String st="manjunath";
//		st=st.toLowerCase();
//		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
//		for (int i = 0; i < st.length(); i++) {
//			if (map.containsKey(st.charAt(i))==false) {
//				map.put(st.charAt(i), 1);
//			}
//			else
//			{
//				Integer ch=map.get(st.charAt(i));
//				ch=ch+1;
//				map.put(st.charAt(i), ch);
//			}
//		}
//		System.out.println(map);
	}
	
	
}
