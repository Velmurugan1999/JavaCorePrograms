package com.arrays;

//----Selection Sort---------

public class Example4 {
	
	public static void main(String[] args) {
		int[] arr= {22,10,5,44,78,25};
		int n=arr.length;
		System.out.println("Before sort");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			int mIndx=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[mIndx]>arr[j])
				{
					mIndx=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[mIndx];
			arr[mIndx]=temp;
		}
		System.out.println("After sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
