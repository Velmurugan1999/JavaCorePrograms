package com.streamapis;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class Example5 {

	public static void main(String[] args) {
		ArrayList<Transactions> list=new ArrayList<Transactions>();
		Transactions tran1=new Transactions(1, new Traders("kavin", "chennai"), 2018, 51);
		Transactions tran2=new Transactions(5, new Traders("ashoke", "bangalore"), 2015, 75);
		Transactions tran3=new Transactions(8, new Traders("abi", "erode"), 2019, 80);
		Transactions tran4=new Transactions(12, new Traders("john", "coimbatore"), 2021, 11);
		Transactions tran5=new Transactions(3, new Traders("bala", "chennai"), 2018, 24);
		list.add(tran1);
		list.add(tran2);
		list.add(tran3);
		list.add(tran4);
		list.add(tran5);
		
		
		System.out.println("Transactions in 2018==========>");
		list.stream()
				.filter(t->t.getYear()==2018)
					.sorted(Comparator.comparing(Transactions::getId))
						.forEach(System.out::println);
		
		System.out.println("\nCities where traders work=====>");
		list.stream()
				.map(t->t.getTrader().getCity())
						.distinct()
							.forEach(System.out::println);
		
		System.out.println("\nTraders name ascending order=====>");
		list.stream()
				.map(t->t.getTrader().getName())
					.sorted((s1,s2)->s1.compareTo(s2))
						.map(s->s.toUpperCase())
							.distinct()
								.forEach(System.out::println);
						
		System.out.println("\nAny traders from Chennai======>");
		list.stream()
				.filter(t->t.getTrader().getCity().equals("chennai"))
					.forEach(System.out::println);
		
		System.out.println("\nHighest transaction=====>");
		Optional<Integer> max=list.stream()
									.map(t->t.getValue())
										.reduce(Integer::max);
		System.out.println(max.get());
		
		System.out.println("\nLowest transaction=====>");
		Optional<Integer> min=list.stream()
									.map(t->t.getValue())
										.reduce(Integer::min);
		System.out.println(min.get());
		
		System.out.println("\nHow many trader fron chennai=======>");
		long count=list.stream()
							.filter(t->t!=null)
								.filter(t->t.getTrader().getCity().equals("chennai"))
									.count();
		System.out.println(count);
							
		
	}

}
