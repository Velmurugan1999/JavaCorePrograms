package com.arrays;

public class Example97 {
//Sorting two arrays and Merging sorted arrays
	public static void main(String[] args) {
		int[] arr1= {22,1,4,5,45,14,54};
		int[] arr2= {41,87,21,45,11,12};
		selectionSort(arr1);
		selectionSort(arr2);
		System.out.println("After sorting Array 1=====>");
		print(arr1);
		System.out.println("After sorting Array 2=====>");
		print(arr2);
		System.out.println("Mergeing the Sorted Array=======>");
		int[] mergeArr=new int[arr1.length+arr2.length];
		int m=0,a1=0,a2=0;
		while(m<=mergeArr.length && a1<arr1.length && a2<arr2.length)
		{
			if(arr1[a1]<=arr2[a2])
			{
				mergeArr[m]=arr1[a1];
				a1++;
			}
			else
			{
				mergeArr[m]=arr2[a2];
				a2++;
			}
			m++;
		}
		while(a1<arr1.length)
		{
			mergeArr[m]=arr1[a1];
			a1++;
			m++;
		}
		while(a2<arr2.length)
		{
			mergeArr[m]=arr2[a2];
			a2++;
			m++;
		}
		print(mergeArr);
		
	}
	public static void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");
		System.out.println();
	}
	
	public static void selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			if(min!=i)
			{
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}
	}
}
