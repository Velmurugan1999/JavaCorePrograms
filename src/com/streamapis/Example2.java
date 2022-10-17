package com.streamapis;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Example2 {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();
		Product product1 = new Product(5, "Mobile", "Black", 10000);
		Product product2 = new Product(1, "Laptop", "Blue", 45000);
		Product product3 = new Product(4, "Desktop", "White", 36000);
		Product product4 = new Product(12, "Earphone", "Green", 1200);
		Product product5 = new Product(6, "Mouse", "Black", 500);
		Product product6 = new Product(8, "Keyboard", "Black", 450);
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		list.add(product5);
		list.add(product6);
		
		System.out.println("Normal Stream===========>");
		long t1=System.nanoTime();
		list.stream()
			.sorted((o1,o2)->o1.getId()-o2.getId())
				.forEach(System.out::println);
		long t2=System.nanoTime();
		System.out.println("Time="+(t2-t1)+"\n\nParallel Stream==========>");
		long t3=System.nanoTime();
		list.parallelStream()
			.sorted((o1,o2)->o1.getId()-o2.getId())
				.forEach((p)->System.out.println(p));
		long t4=System.nanoTime();
		System.out.println("Time="+(t4-t3)+"\n\nFilter the products by price and colour===========>");
		List<Product> pList= list.stream()
									.filter((p)->p.getPrice()<40000)
											.filter(p->p.getColour().equals("Black"))
												.limit(5)
													.collect(Collectors.toList());
		pList.forEach(System.out::println);
		
		
		System.out.println("\nConverting List to Map================>");
		Map<Integer,Product> map=list.stream()
										.collect(Collectors.toMap(Product::getId,(p)->p));
		for(Entry<Integer,Product> e:map.entrySet())
		{
			System.out.println("Key::"+e.getKey()+"  ///// Values:::"+e.getValue());
		}
		
		
		System.out.println("\nRemoving duplicate Products============>");
		Product product7 = product1;
		Product product8 = product2;
		list.add(product7);
		list.add(product8);
		List<Product> dList=list.stream()
								.sorted(Comparator.comparing(Product::getId))
									.distinct()
										.collect(Collectors.toList());
		long l=list.stream()
				.sorted(Comparator.comparing(Product::getId))
					.distinct()
						.count();
		
		dList.forEach(System.out::println);
		System.out.println("Original Length without Dupicate product=="+l);
		System.out.println("\nOriginal List Values===>");
		list.forEach(System.out::println);
		
		
	}

}
