package com.collectionex;

import java.util.Collections;
import java.util.LinkedList;

public class ListLinkedList {

	public static void main(String[] args) {
		LinkedList<Employee> list=new LinkedList<Employee>();
		Employee emp1=new Employee(15, "Ashoke", "Testing", 40000);
		Employee emp2=new Employee(8, "Gopal", "Testing", 50000);
		Employee emp3=new Employee(21, "Premkumar", "Backend Dev", 45000);
		Employee emp4=new Employee(28, "John", "Backend Dev", 42000);
		Employee emp5=new Employee(11, "Priya", "Frontend Dev", 41000);
		Employee emp6=new Employee(35, "Kavin", "Testing", 48000);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		//Adding dublicate 
		Employee emp7=new Employee(15, "Ashoke", "Testing", 40000);
		Employee emp8=new Employee(8, "Gopal", "Testing", 50000);
		Employee emp9=new Employee(21, "Premkumar", "Backend Dev", 45000);
		Employee emp10=new Employee(21, "Premkumar", "Backend Dev", 45000);
		list.add(emp7);
		list.add(emp8);
		list.add(emp9);
		list.add(emp10);
		System.out.println("========Comparable Sorting========");
		Collections.sort(list);
		list.forEach(System.out::println);
		LinkedList<Integer> idList=new LinkedList<Integer>();
		System.out.println("\n==========Employee Id=============");
		for(Employee e:list)
		{
			idList.add(e.getEid());
			System.out.print(e.getEid()+"  ");
		}
		System.out.println();
		LinkedList<Integer> kList=new LinkedList<Integer>();
		LinkedList<Integer> oList=new LinkedList<Integer>();
		
		for(int i=0;i<idList.size();i++)
		{
			int occur=0;
			for(int j=0;j<idList.size();j++)
			{
				if(idList.get(i)==idList.get(j))
				{
					occur++;
				}
			}
			if(!kList.contains(idList.get(i)))
			{
				kList.add(idList.get(i));
				oList.add(occur);
			}
		}
		System.out.println("==========Employee Id without Duplicate======");
		for(int k:kList)
			System.out.print(k+"  ");
		System.out.println("\n\n==========Duplicate Id and Occurence=========");
		for(int i=0;i<kList.size();i++)
			if(oList.get(i)>1)
				System.out.println(kList.get(i)+"  Occured: "+oList.get(i)+" Times");
	}
}
