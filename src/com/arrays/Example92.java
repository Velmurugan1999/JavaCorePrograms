package com.arrays;

//---------Merge Sort--------------

public class Example92 {
	public void merge(int[] arr, int l,int m,int r)
	{
		int n1=m-l+1;
		int n2=r-m;
		int[] lft=new int[n1];
		int[] rit=new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			lft[i]=arr[l+i];
		}
		for(int i=0;i<n2;i++)
		{
			rit[i]=arr[m+i+1];
		}
		int a=0,b=0,kk=l;
		while(a<n1 && b<n2)
		{
			if(lft[a]<=rit[b])
			{
				arr[kk]=lft[a];
				a++;
			}
			else
			{
				arr[kk]=rit[b];
				b++;
			}
			kk++;
		}
		
		while(a<n1)
		{
			arr[kk]=lft[a];
			a++;
			kk++;
		}
		while(b<n2)
		{
			arr[kk]=rit[b];
			b++;
			kk++;
		}
		
	}
	public void sort(int[] arr,int l, int r)
	{
		if(l<r)
		{
			int mid=(l+r)/2;
			sort(arr, l,mid);
			sort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr= {22,14,5,6,77,10};
		System.out.println("---Before Sorting------");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Example92 obj=new Example92();
		obj.sort(arr, 0, arr.length-1);
		System.out.println("---After Sorting------");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
