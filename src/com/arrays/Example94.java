package com.arrays;


//-------------Heap Sort-----------

public class Example94 {
	public static void heapify(int arr[],int n,int i)
	{
		int large=i;
		int left=i*2+1;
		int right=i*2+2;
		if(left<n && arr[left]>arr[large])
		{
			large=left;
		}
		if(right<n && arr[right]>arr[large])
		{
			large=right;
		}
		if(i!=large)
		{
			int temp=arr[i];
			arr[i]=arr[large];
			arr[large]=temp;
			heapify(arr,n,large);
		}
	}
	
	
	public static void heapsort(int[] arr)
	{
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(arr,n,i);
		}
		
		for(int i=n-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
		
	}
	
	
	public static void print(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int arr[]= {22,78,2,54,89,12};
		System.out.println("Before sorting");
		print(arr);
		heapsort(arr);
		System.out.println("After sorting");
		print(arr);
		
	}

}
