package com.lambdaex;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.arrays.Student;

//====Consumer Interface====Predicate Interface====Function Interface===

public class Example3 {

	public static void main(String[] args) {
		ArrayList<Student> lst = new ArrayList<Student>();
		Student s1 = new Student(12, "Prem", 5);
		Student s2 = new Student(15, "Neeraj", 3);
		Student s3 = new Student(13, "Kumar", 7);
		Student s4 = new Student(5, "Kavin", 2);
		Student s5 = new Student(8, "Manoj", 11);
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		lst.add(s4);
		lst.add(s5);
		// Consumer
		System.out.println("-------Consumer Interface-------");
		Consumer<Student> consumer=(sObj)->System.out.println(sObj.getName()+"  Id: "+sObj.getSid());
		lst.forEach((s)->consumer.accept(s));
		
		System.out.println("-------BiConsumer Interface-------");
		BiConsumer<Student,Student> consumer1=(sObj1,sObj2)->System.out.println(sObj1.getName()+"  Id: "+sObj1.getSid()+
													"\n"+sObj2.getName()+"  Id: "+sObj2.getSid());
		consumer1.accept(s1, s2);
		// Predicate
		System.out.println("\n-------Predicate Interface-------");
		System.out.println("-----Name Starts with k:");
		Predicate<String> predicate = (s) -> {
			s = s.toLowerCase();
			return s.startsWith("k");
		};
		lst.forEach((stu) -> {
			if (predicate.test(stu.getName())) {
				System.out.println(stu.toString());
			}
		});
		
		//Function
		System.out.println("\n-------Function Interface------");
		Function<Student,String> fun=(student)->
		{
			if(student.getRank()<=5)
			{
				return student.getName()+" :Very Good |  Rank="+student.getRank();
			}
			else
			{
				return student.getName()+" :Good  |  Rank="+student.getRank();
			}
		};
		lst.forEach((s)->System.out.println(fun.apply(s)));
		
		
		//Supplier
		System.out.println("\n------supplier----------");
		Supplier<Student> supplier=()->
		{
			Student student=new Student(55, "Ram", 9);
			return student;
			
		};
		System.out.println(supplier.get().toString());
	}

}
