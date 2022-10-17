package com.arrays;

public class Example2 {
	
	// Creating 2D array by multiplying the each element in 1D array
	
	public static void main(String[] args) {
		int[] arr= {5,3,4,1};
		int[][] arr1=new int[arr.length][arr.length-1];
		long t1=System.nanoTime();
		System.out.println("------Mutiplying with other elements----");
		for(int i=0;i<arr.length;i++)
		{

			for(int j=0,k=0;j<arr.length;j++)
			{
				if(i!=j)
				{
					int mul=arr[i]*arr[j];
					arr1[i][k]=mul;
					k++;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------Sorting each Row--------------");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				for(int k=j+1;k<arr.length-1;k++)
				{
					if(arr1[i][j]>arr1[i][k])
					{
						int temp=arr1[i][k];
						arr1[i][k]=arr1[i][j];
						arr1[i][j]=temp;
					}
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------Sorting each Column--------------");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr1[j][i]>arr1[k][i])
					{
						int temp=arr1[k][i];
						arr1[k][i]=arr1[j][i];
						arr1[j][i]=temp;
					}
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-------------sorted 2D array----------------");
		int[] larr=new int[arr1.length * arr1[0].length];
		for(int i=0,nn=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
			{
				larr[nn]=arr1[i][j];
				nn++;
			}
		}
		
		for(int i=0;i<larr.length;i++)
		{
			for(int j=i+1;j<larr.length;j++)
			{
				if(larr[i]>larr[j])
				{
					int temp=larr[i];
					larr[i]=larr[j];
					larr[j]=temp;
				}
			}
		}
		int l=0,m=0;
		for(int k=0;k<larr.length;k++) {
			arr1[l][m]=larr[k];
			m++;
			if(m%arr1[0].length==0)
			{
				m=0;
				l++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		long t2=System.nanoTime();
		System.out.println("----Total Time------");
		System.out.println(t2-t1);
	}

}





















