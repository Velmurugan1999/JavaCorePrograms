package com.arrays;

public class Example8 {
//------Sorting the Student details by selection sort-----
	public static void main(String[] args) {
		Student obj1=new Student(5, "kavin", 8);
		Student obj2=new Student(10, "ashoke", 2);
		Student obj3=new Student(2, "prem", 5);
		Student obj4=new Student(8, "ganesh", 6);
		Student[] arr= {obj1,obj2,obj3,obj4};
		for(int i=0;i<arr.length;i++)
		{
			int mIdx=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j].getSid()<arr[mIdx].getSid())
				{
					mIdx=j;
				}
			}
			Student temp=arr[i];
			arr[i]=arr[mIdx];
			arr[mIdx]=temp;
		}
		System.out.println("Sorting bu Student Id - Selection Sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].toString());
		}
	}

}
