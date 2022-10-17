package com.arrays;


public class Example6 {
//-------------InsertionSort----------------

	public static void main(String[] args) {
		int[] arr= {22,10,5,44,78,25,1};
		int n=arr.length;
		System.out.println("Before sort");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=1;i<n;i++)
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
		System.out.println("After sort");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
