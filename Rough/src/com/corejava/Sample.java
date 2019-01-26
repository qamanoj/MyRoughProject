package com.corejava;

import java.util.Scanner;

class Sample
{
	 Sample(int n)
	{
		//int no=5;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) 
	{
		Sample s=new Sample(3);
		//s.m(5);
	}
	
}
