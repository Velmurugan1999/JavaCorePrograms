package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Connection con = DbConnection.getConnection();
		System.out.println("Enter the Details:");
		CallableStatement stmt = null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID:");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		System.out.println("Enter the age:");
		int age=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the department:");
		String department=sc.nextLine();
		System.out.println("Enter the Salary:");
		long salary=Long.parseLong(sc.nextLine());
		System.out.println("Enter the company name:");
		String company=sc.nextLine();
		try {
			stmt=con.prepareCall("insert into employee values(?,?,?,?,?,?)");
			stmt.setInt(1,id);
			stmt.setString(2, name);
			stmt.setInt(3, age);
			stmt.setString(4, department);
			stmt.setLong(5, salary);
			stmt.setString(6, company);
			System.out.println(stmt.executeUpdate());
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
