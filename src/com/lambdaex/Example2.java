package com.lambdaex;

import java.util.ArrayList;


import com.arrays.Student;

//Functional Interface

public class Example2 {

	public static void main(String[] args) {
		ArrayList<Student> lst=new ArrayList<Student>();
		Student s1=new Student(12, "Prem", 1);
		Student s2=new Student(15, "Neeraj", 3);
		Student s3=new Student(13, "Kumar", 2);
		Student s4=new Student(5, "Kavin", 8);
		Student s5=new Student(8, "Manoj", 11);
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		lst.add(s4);
		lst.add(s5);
		System.out.println("---Implementing Oneparam Interface in Student Class---");
		
		lst.forEach((s)->s.pass(s.getSid()));
		long t1=System.nanoTime();
		
		
		System.out.println("\n---Implementing interface at main method without Lambda--- ");
		Oneparam one=new Oneparam() {
			
			@Override
			public void pass(int i) {
				System.out.println("Rank : "+i);
			}
		};
		lst.forEach((s)->one.pass(s.getRank()));
		long t2=System.nanoTime();
		System.out.println("Time taken with out Lambda="+(t2-t1));
		
		
		System.out.println("\n---Implementing interface at main method with Lambda--- ");
		long t3=System.nanoTime();
		Oneparam obj=(int x)->{
			System.out.println("Rank : "+x);
		};
		lst.forEach((s)->obj.pass(s.getRank()));
		long t4=System.nanoTime();
		System.out.println("Time taken by using Lambda="+(t4-t3));
		
		
		
	}

}




