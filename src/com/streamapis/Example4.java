package com.streamapis;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class Example4 {

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
		
		long l=list.stream()
				.sorted(Comparator.comparing(Product::getId))
					.map(Product::getPrice)
						.reduce((long) 0,(a,b)->a+b);
		System.out.println("Sum of prices==="+l+" $");
		String s=list.stream()
					.sorted(Comparator.comparing(Product::getName))
						.map(Product::getName)
							.reduce("",(a,b)->a+" "+b+" ");
		System.out.println("\nAdding the name of product =>"+s);
		Optional<Long> max=list.stream()
				.sorted(Comparator.comparing(Product::getName))
					.map(Product::getPrice)
						.reduce((l1,l2)->Long.max(l1, l2));
		if(max.isPresent())
		{
			System.out.println("Max price="+max.get());
		}
		
		Optional<Long> min=list.stream()
				.sorted(Comparator.comparing(Product::getName))
					.map(Product::getPrice)
						.reduce((l1,l2)->Long.min(l1, l2));
		if(min.isPresent())
		{
			System.out.println("Min price="+min.get());
		}
		
	}

}
