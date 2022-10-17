package com.arrays;

//-----Bubble Sort-----

public class Example5 {

	public static void main(String[] args) {
		int[] arr= {22,10,5,44,78,25,1};
		int n=arr.length;
		System.out.println("Before sort");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("After sort");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
