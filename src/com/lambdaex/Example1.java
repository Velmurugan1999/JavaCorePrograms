package com.lambdaex;

import java.util.concurrent.atomic.AtomicInteger;

public class Example1 {
	static AtomicInteger k = new AtomicInteger(1);
	static int inc() {
		return k.getAndIncrement();
	}

	static void print1(int i, boolean x) {
		if (x) {
			System.out.println(inc() + "   | " + i + "        |");
		} else {
			System.out.println(inc() + "   | " + "         | " + i);
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println("------Thread ex using Lambda Expression-------");
		System.out.println("Sno | Thread 1 | Thread 2");

		Thread t1 = new Thread(() -> {

			for (int i = 0; i < 5; i++) {

				print1(i, true);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				print1(i, false);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();
		
		

	}

	

}
