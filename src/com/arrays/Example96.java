package com.arrays;

public class Example96 {
	//Right shift and Left shift
	public static void main(String[] args) {
		int[] rArr= {1,2,3,4,5,6,7,8,9};
		int nOfShift=2;
		System.out.println("==========Right Rotation=========");
		System.out.println("Before Rotation");
		for(int i:rArr)
			System.out.print(i+"  ");
		for(int n=0;n<nOfShift;n++)
		{
			int last=rArr[rArr.length-1];
			for(int i=rArr.length-1;i>0;i--)
			{
				rArr[i]=rArr[i-1];
			}
			rArr[0]=last;
		}
		System.out.println("\nAfter "+nOfShift+" shift right Rotation");
		for(int i:rArr)
			System.out.print(i+"  ");
		
		int[] lArr= {1,2,3,4,5,6,7,8,9};
		System.out.println("\n\n==========Left Rotation=========");
		System.out.println("Before Rotation");
		for(int i:lArr)
			System.out.print(i+"  ");
		for(int i=0;i<nOfShift;i++)
		{
			int first=lArr[0];
			for(int j=0;j<lArr.length-1;j++)
			{
				lArr[j]=lArr[j+1];
			}
			lArr[lArr.length-1]=first;
		}
		System.out.println("\nAfter "+nOfShift+" shift left Rotation");
		for(int i:lArr)
			System.out.print(i+"  ");
		
	}

}
