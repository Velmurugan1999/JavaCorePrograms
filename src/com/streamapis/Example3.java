package com.streamapis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example3 {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();
		Product product1 = new Product(5, "Mobile", "Black", 10000);
		Product product2 = new Product(1, "Laptop", "Blue", 45000);
		Product product3 = new Product(4, "Desktop", "White", 36000);
		Product product4 = new Product(12, "Earphone", "Green", 1200);
		Product product5 = new Product(6, "Mouse", "Black", 300);
		Product product6 = new Product(8, "Keyboard", "Black", 450);
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		list.add(product5);
		list.add(product6);
		
		//Slice by filter
		System.out.println("Slice by Filter====>");
		list.stream()
				.filter((p)->p.getId()<=8).forEach(System.out::println);
		//limit and Skip
		System.out.println("\nLimit and Skip=====>");
		list.stream()
				.sorted(Comparator.comparing(Product::getId))
					.limit(4)
						.skip(2)
							.forEach((p)->System.out.println("Id=>"+p.getId()+"  Name=>"+p.getName()));
		
		List<String> sList=new ArrayList<String>();
		System.out.println("\nOriginal String Array");
		sList.add("hello");
		sList.add("world");
		
		sList.forEach(l->System.out.print(l+" "));
		System.out.println();
		
		System.out.println("\nFlat Map ========>");
		List<String> clist=sList.stream()
									.map(str->str.split(""))
										.flatMap((arr)->Arrays.stream(arr))
											.distinct()
												.collect(Collectors.toList());
		clist.forEach(l->System.out.print(l+" "));
		//Match
		System.out.println("\n\nAny Match=================>");
		boolean b=list.stream().anyMatch((p)->p.getColour().equals("Black"));
		if(b)
		{
			System.out.println("Black colour product are availabe");
		}
		else
		{
			System.out.println("Black colour product are not available");
		}
		System.out.println("\nAll Match=================>");
		boolean b2=list.stream().allMatch((p)->p.getColour().equals("Black"));
		if(b2)
		{
			System.out.println("All are Black colour");
		}
		else
		{
			System.out.println("All are not Black colour");
		}
		
		System.out.println("\nAll Match=================>");
		boolean b3=list.stream().noneMatch(p->p.getColour().equals("Yellow"));
		if(b3)
		{
			System.out.println("Non match with yellow="+b3);
		}
		else
		{
			System.out.println("Non match with yellow="+b3);
		}
		System.out.println("\nFindany Method==>");
		
		list.stream()
				.filter(p->p.getPrice()<=500)
					.findAny()
						.ifPresent(p->System.out.println(p));
						
	}

}
