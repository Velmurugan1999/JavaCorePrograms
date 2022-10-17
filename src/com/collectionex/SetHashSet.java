package com.collectionex;

import java.util.HashSet;
import java.util.LinkedHashSet;
// HashSet and Linked Hash Set
public class SetHashSet {

	public static void main(String[] args) {
		HashSet<Employee> set=new HashSet<Employee>();
		Employee emp1=new Employee(15, "Ashoke", "Testing", 40000);
		Employee emp2=new Employee(8, "Gopal", "Testing", 50000);
		Employee emp3=new Employee(21, "Premkumar", "Backend Dev", 45000);
		Employee emp4=new Employee(28, "John", "Backend Dev", 42000);
		Employee emp5=new Employee(11, "Priya", "Frontend Dev", 41000);
		Employee emp6=new Employee(35, "Kavin", "Testing", 48000);
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);
		set.add(emp6);
		System.out.println("=====No Insertion Order=====");
		for(Employee e:set)
			System.out.print(e.getEid()+" ");
		System.out.println();
		
		//adding duplicate objects
		Employee emp7=emp1;
		Employee emp8=emp2;
		set.add(emp7);
		set.add(emp8);
		System.out.println("=====After adding duplicates====");
		for(Employee e:set)
			System.out.print(e.getEid()+" ");
		System.out.println("\n\n======After adding Null=========");
		set.add(null);
		for(Employee e:set)
			if(e!=null)
				System.out.println(e);
			else
				System.err.println("==>"+e);
		System.out.println();
		set.remove(null);
		HashSet<Employee> set2=(HashSet<Employee>) set.clone();
		System.out.println("=====Cloned Set====");
		for(Employee e:set2)
			System.out.print(e.getEid()+" ");
		
		LinkedHashSet<Employee> lhSet=new LinkedHashSet<Employee>();
		for(Employee e:set2)
			lhSet.add(e);
		
		System.out.println("\n\n=========LinkedHashset==========");
		for(Employee e:lhSet)
			System.out.println(e);
		
	}

}
