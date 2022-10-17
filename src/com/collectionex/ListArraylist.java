package com.collectionex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListArraylist {

	public static void main(String[] args) {
		Employee emp1=new Employee(15, "Ashoke", "Testing", 40000);
		Employee emp2=new Employee(8, "Gopal", "Testing", 50000);
		Employee emp3=new Employee(21, "Premkumar", "Backend Dev", 45000);
		Employee emp4=new Employee(28, "John", "Backend Dev", 42000);
		Employee emp5=new Employee(11, "Priya", "Frontend Dev", 41000);
		Employee emp6=new Employee(35, "Kavin", "Testing", 48000);
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		long time1=System.nanoTime();
		Collections.sort(list,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEid()-o2.getEid();
			}
			
		});
		long time2=System.nanoTime();
		System.out.println("========Comprator========");
		ListArraylist.print(list);
		System.out.println("Time ==> "+(time2-time1));
		long time3=System.nanoTime();
		System.out.println("========Comparable========");
		Collections.sort(list);
		long time4=System.nanoTime();
		ListArraylist.print(list);
		System.out.println("Time ==> "+(time4-time3));
		
		
		
	}
	
	
	
	public static void print(ArrayList<Employee> list)
	{
		for(Employee e:list)
		{
			System.out.println(e);
		}
	}

}
