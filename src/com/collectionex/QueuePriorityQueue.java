package com.collectionex;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueuePriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.add("Amit");
		q.add("Kumar");
		q.add("Bala");
		q.offer("Prem");//if not able add, it does not throw exception 
		q.offer("Bharani");
		System.out.println("Peek the first name : "+q.peek());//return null if no elements
		System.out.println("Element the first name : "+q.element());//throw exception if no element
		Iterator<String> it=q.iterator();
		System.out.println("\n=====All Names======");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("Poll element : "+q.poll());
		System.out.println("Remove element : "+q.remove());
		System.out.println("\n=====After removing the two elements======");
		for(String s:q)
			System.out.println(s);
		System.out.println("\n=======Adding Employee Objects========");
		PriorityQueue<Employee> q1=new PriorityQueue<Employee>();
		Employee emp1=new Employee(15, "Ashoke", "Testing", 40000);
		Employee emp2=new Employee(8, "Gopal", "Testing", 50000);
		Employee emp3=new Employee(21, "Premkumar", "Backend Dev", 45000);
		Employee emp4=new Employee(28, "John", "Backend Dev", 42000);
		q1.add(emp1);
		q1.add(emp2);
		q1.add(emp3);
		q1.add(emp4);
		for(Employee e:q1)
			System.out.println(e);
	}

}
