package com.collectionex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
/// HashMap and Tree Map
public class MapLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Employee, Address> map=new LinkedHashMap<Employee, Address>();
		Employee emp1 = new Employee(15, "John", "Testing", 40000);
		Employee emp2 = new Employee(8, "Gopal", "Testing", 50000);
		Employee emp3 = new Employee(21, "Premkumar", "Backend Dev", 45000);
		Employee emp4 = new Employee(28, "John", "Backend Dev", 42000);
		Employee emp5 = new Employee(11, "Priya", "Frontend Dev", 41000);
		Employee emp6 = new Employee(35, "Kavin", "Testing", 48000);
		Address a1=new Address(101,"MGR Street","Chennai",600096);
		Address a2=new Address(56,"Santhi Nagar","Coimbature",600154);
		Address a3=new Address(20,"MGR Street","Erode",638107);
		Address a4=new Address(12,"Gandhi Street","Madurai",612012);
		Address a5=new Address(8,"Gangapuram","Chennai",600008);
		Address a6=new Address(204,"Venkat Street","Chennai",600895);
		map.put(emp1, a1);
		map.put(emp2, a2);
		map.put(emp3, a3);
		map.put(emp4, a4);
		map.put(emp5, a5);
		map.put(emp6, a6);
		
		for(Entry<Employee, Address> e:map.entrySet())
		{
			System.out.println("Employee Name:"+e.getKey().getName());
			System.out.println("Address====> "+e.getValue().toString());
		}
		LinkedHashMap<Employee, Address> map2=new LinkedHashMap<Employee, Address>();
		for(Entry<Employee, Address> e:map.entrySet())
		{
			if(e.getValue().getCity().equals("Chennai"))
			{
				map2.put(e.getKey(), e.getValue());
			}
		}
		
		System.out.println("\n=====Employees in chennai========");
		for(Entry<Employee, Address> e:map.entrySet())
		{
			System.out.println("Name:"+e.getKey().getName());
			System.out.println("Address====> "+e.getValue().toString()+"\n");
		}
		
		
		System.err.println("\n\n=========TreeMap===============");
		Map<Employee,Address> tMap=new TreeMap<Employee, Address>();
		tMap.put(emp1, a1);
		tMap.put(emp2, a2);
		tMap.put(emp3, a3);
		tMap.put(emp4, a4);
		tMap.put(emp5, a5);
		tMap.put(emp6, a6);
		for(Entry<Employee, Address> e:tMap.entrySet())
		{
			System.out.println("Employee Id:"+e.getKey().getEid());
			System.out.println("Address====> "+e.getValue().toString());
		}
		
	}

}
