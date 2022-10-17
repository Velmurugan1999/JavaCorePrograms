package com.arrays;

import java.util.Scanner;
//---------Binary Search--------------
public class Example9 {

	public static void main(String[] args) {
		Student obj1=new Student(1, "kavin", 8);
		Student obj2=new Student(2, "ashoke", 2);
		Student obj3=new Student(3, "prem", 5);
		Student obj4=new Student(4, "ganesh", 6);
		Student[] arr= {obj1,obj2,obj3,obj4};
		System.out.println("Enter student id to search");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		int low=0,high=arr.length-1;
		while(high-low>1)
		{
			int mid=(high+low)/2;
			if(arr[mid].getSid()<id)
			{
				low=mid+1;
			}
			else
			{
				high=mid;
			}
					
		}
		if(arr[low].getSid()==id)
		{
			System.out.println("Details==[ "+arr[low].toString()+"]");
		}
		else if(arr[high].getSid()==id)
		{
			System.out.println("Details==[ "+arr[high].toString()+"]");
		}
		else
		{
			System.out.println("Student not found");
		}
	}

}
