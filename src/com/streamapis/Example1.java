package com.streamapis;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//StreamApi
public class Example1 {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();
		Product product1 = new Product(5, "Mobile", "Black", 10000);
		Product product2 = new Product(1, "Laptop", "Blue", 45000);
		Product product3 = new Product(4, "Desktop", "White", 36000);
		Product product4 = new Product(12, "Earphone", "Green", 1200);
		Product product5 = new Product(6, "Mouse", "Black", 500);
		Product product6 = new Product(8, "Keyboard", "White", 450);
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		list.add(product5);
		list.add(product6);

		System.out.println("Filter the products under 10000=============>");
		list.stream().filter((p) -> p.getPrice() <= 10000)
						.forEach(o -> System.out.println(o.toString()));
		
		
		System.out.println("\nSorting the Products by Id==================>");
		list.stream().sorted((o1,o2)->o1.getId()-o2.getId())
						.forEach(o->System.out.println(o.toString()));
		
		
		System.out.println("\nSorting the Products by Price===============>");
		list.stream().sorted((o1,o2)->(int)o1.getPrice()-(int)o2.getPrice())
						.forEach(o->System.out.println(o.toString()));
		
		System.out.println("\nSorting the Products by Colour===============>");
		list.stream().sorted((o1,o2)->o1.getColour().compareTo(o2.getColour()))
						.forEach(o->System.out.println(o.toString()));
		
		System.out.println("\nFinding largest and Lowest price of products========>");
		List<Product> prods =  list.stream()
		.sorted(Comparator.comparing(Product::getPrice).reversed())
		.collect(Collectors.toList());
		System.out.println("\nHigh Priced Product=>");
		System.out.println(prods.get(0));
		System.out.println("\nLow Priced Product=>");
		System.out.println(prods.get(prods.size()-1));
		
		System.out.println("\nProduct Names==================>");
		List<String> pName=list.stream().map((p)->p.getName()).collect(Collectors.toList());
		pName.stream().forEach(System.out::println);
		
		
		
	}

}
