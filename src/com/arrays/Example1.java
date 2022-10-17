package com.arrays;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

//Occurrence of elements in array

public class Example1 {
	
	public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of Array");
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++) {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            map.put(arr[i], count);
        }
        for(Entry e:map.entrySet())
        {
            System.out.println(e.getKey()+" Occurs in "+e.getValue()+" times");
        }
    }


}
