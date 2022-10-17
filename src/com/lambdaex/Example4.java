package com.lambdaex;

import java.util.ArrayList;

public class Example4 {
//Functional Interface
	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<Integer>();
		lst.add(101);
		lst.add(252);
		lst.add(12);
		lst.add(55);
//Find odd or Even
		System.out.println("====== ODD or EVEN =========");
		Oneparam even = (i) -> {
			if (i % 2 == 0) {
				System.out.println(i + "==EVEN");
			} else
				System.out.println(i + "==ODD");
		};
		lst.forEach((i) -> even.pass(i));
//Prime or not		
		System.out.println("\n====== PRIME Number =========");
		Oneparam prime = (n) -> {
			int count = 0;
			for (int i = 1; i <= n / 2; i++) {
				if (n % i == 0)
					count++;
			}
			if (count > 1)
				System.out.println(n + "==COMPOSITE");
			else
				System.out.println(n + "==PRIME");
		};
		lst.forEach((i) -> prime.pass(i));
//Palindrome or not
		System.out.println("\n====== Palindrome =========");
		Oneparam palindrome = (n) -> {
			String s = n + "";
			boolean p = true;
			for (int i = 0, j = s.length() - 1; i <= s.length() / 2; i++, j--) {
				if (s.charAt(i) != s.charAt(j)) {
					p = false;
				}
			}
			if (p)
				System.out.println(n + "==Palindrome");
			else
				System.out.println(n + "==Not Palindrome");
		};
		lst.forEach((i) -> palindrome.pass(i));

		System.out.println("=====Using Thread=====");
		Thread t1 = new Thread(() -> {
			lst.forEach((i) -> {
				even.pass(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		});

		Thread t2 = new Thread(() -> {
			lst.forEach((i) -> {
				prime.pass(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		});

		Thread t3 = new Thread(() -> {
			lst.forEach((i) -> {
				palindrome.pass(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		});

		t1.start();// Odd or even
		t2.start();// Prime or Composite
		t3.start();// Palindrome
	}

}
