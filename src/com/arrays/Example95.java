package com.arrays;

public class Example95 {

	public static void main(String[] args) {
		System.out.println("========Occurence of Elements in Array==========");
		int[] arr= {55,4,4,55,21,1,56,7,8,55,4,21};
		boolean[] bArr=new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			bArr[i]=false;
		}
		for(int i=0;i<arr.length;i++)
		{
			int occur=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					occur++;
					bArr[j]=true;
				}
			}
			if(bArr[i]==false)
			{
				System.out.println(arr[i]+" Occured :"+occur+" times");
			}
		}
	}

}
