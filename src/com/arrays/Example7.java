package com.arrays;

import java.util.Scanner;

public class Example7 {
//-------finding n th max and min value--------
	public static void main(String[] args) {
		int arr[]= {11,2,55,47,21,14,87,13};
		System.out.print("Values=> ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=1;i<arr.length;i++)
		{
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp)	
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		
		System.out.println();
		System.out.println("Enter 1=>Min Value - 2=>Max Value");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		if(m==1)
		{
			System.out.println("Enter the value n to find N th minimum value");
			int n=sc.nextInt();
			if(n>0 && n<=arr.length)
			{
				System.out.println(arr[n-1]);
			}
			else
			{
				System.out.println("Invalid");
			}
		}
		else if(m==2)
		{
			System.out.println("Enter the value n to find N th maximum value");
			int n=sc.nextInt();
			if(n>0 && n<=arr.length)
			{
				System.out.println(arr[arr.length-n]);
			}
			else
			{
				System.out.println("Invalid");
			}
			
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}
