package com.collectionex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class SetTreeSet {
	int size;

	public static void main(String[] args) {
		TreeSet<Employee> set = new TreeSet<Employee>();
		Employee emp1 = new Employee(15, "John", "Testing", 40000);
		Employee emp2 = new Employee(8, "Gopal", "Testing", 50000);
		Employee emp3 = new Employee(21, "Premkumar", "Backend Dev", 45000);
		Employee emp4 = new Employee(28, "John", "Backend Dev", 42000);
		Employee emp5 = new Employee(11, "Priya", "Frontend Dev", 41000);
		Employee emp6 = new Employee(35, "Kavin", "Testing", 48000);
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);
		set.add(emp6);
		System.out.println("=====Tree Set=======");
		Iterator<Employee> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		TreeSet<Employee> set2 = new TreeSet<Employee>();
		set2.add(emp1);
		set2.add(emp2);
		set2.add(emp3);
		set2.add(emp4);
		set2.add(emp5);
		set2.add(emp6);
		System.out.println("\n====List of TreeSet=======");
		ArrayList<TreeSet<Employee>> alist = new ArrayList<>();
		alist.add(set);
		alist.add(set2);
		AtomicInteger i=new AtomicInteger(1);
		alist.forEach((s) -> {
			System.out.println("\nSet === "+i.getAndIncrement());
			s.forEach((e) -> System.out.println(e.getName()));
			
		});

	}

}
