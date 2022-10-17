package com.arrays;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Enter the size of Matrix");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[][] arr=new String[n][n];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++) {
				arr[i][j]="  ";
			}
		}
		int value=1;
		for(int j=0;j<arr.length;j++) {
			arr[0][j]=value+" ";
			value++;
		}
		for(int j=1;j<arr.length;j++) {
			arr[j][arr.length-1]=""+value;
			value++;
		}
		for(int j=arr.length-2;j>=0;j--) {
			arr[arr.length-1][j]=""+value;
			value++;
		}
		for(int j=arr.length-2;j>=1;j--) {
			arr[j][0]=""+value;
			value++;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
