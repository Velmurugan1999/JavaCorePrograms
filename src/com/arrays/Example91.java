package com.arrays;

import java.util.Scanner;
//-------Dynamic array----------
public class Example91 {
	public int[] insert(int[] arr)
	{
		int n=arr.length;
		int[] newArr=new int[n+1];
		for(int i=0;i<n;i++)
		{
			newArr[i]=arr[i];
		}
		return newArr;
	}
	public int[] delete(int[] arr)
	{
		if(arr.length>1)
		{
			int n=arr.length;
			int[] newArr=new int[n-1];
			for(int i=0;i<newArr.length-1;i++)
			{
				newArr[i]=arr[i];
			}
			return newArr;
		}
		else
		{
			System.out.println("Nothing to delete");
			return arr;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Example91 obj=new Example91();
		int k=0;
		int[] arr=new int[1];
		while(k!=4)
		{
			System.out.println("Enter 1=>Insert  2=>delete 3=>Show  4=>End");
			k=sc.nextInt();
			if(k==1)
			{
				arr=obj.insert(arr);
				System.out.println("Enter the element to insert");
				int val=sc.nextInt();
				arr[arr.length-2]=val;
			}
			else if(k==2)
			{
				arr=obj.delete(arr);
			}
			else if(k==3)
			{
				for(int i=0;i<arr.length-1;i++)
				{
					System.out.println(arr[i]+" ");
				}
			}
			else
			{
				break;
			}
		}
	}

}
