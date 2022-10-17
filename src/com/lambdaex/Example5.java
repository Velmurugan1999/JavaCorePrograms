package com.lambdaex;

import java.util.ArrayList;

public class Example5 {

	public static <T> void main(String[] args) {
		//Integer
		TestGeneric<Integer> test1=new TestGeneric<Integer>(1);
		
		//String
		TestGeneric<String> test2=new TestGeneric<String>("Hello world");
		
		//Patient Class
		Patient pat1=new Patient(10, "Vivek", 500, 9957642111L);
		TestGeneric<Patient> test3=new TestGeneric<Patient>(pat1);
		
		Patient pat2=new Patient(11, "Anand", 1000, 8847642112L);
		TestGeneric<Patient> test4=new TestGeneric<Patient>(pat2);
		
		ArrayList<TestGeneric> list=new ArrayList<TestGeneric>();
		list.add(test1);
		list.add(test2);
		list.add(test3);
		list.add(test4);
		
		//Print the details
		list.forEach((t)->t.print());
		
		
	}

}
