package com.arrays;

public class Example93 {

	//-----Quick Sort----------------
	
	public static void quicksort(int[] arr,int low,int high)
	{
		if(low>=high)
		{
			return;
		}
		int pivot=high;
		int lp=low;
		int rp=high-1;
		while(lp<rp)
		{
			while(arr[lp]<= arr[pivot]&& lp<rp)
			{
				lp++;
			}
			while(arr[rp]>=arr[pivot] && lp<rp)
			{
				rp--;
			}
			swap(arr,lp,rp);
		}
		swap(arr,lp,pivot);
		quicksort(arr,low,lp-1);
		quicksort(arr,lp+1,high);
	}
	
	public static void swap(int[] arr, int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr= {22,10,5,44,78,25,1};
		int n=arr.length;
		System.out.println("Before sort");
		print(arr);
		quicksort(arr,0,arr.length-1);
		System.out.println("After sort");
		print(arr);
	}

}
