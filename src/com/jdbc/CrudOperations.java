package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CrudOperations {
	public static Connection con = DbConnection.getConnection();

	public void printall() {

		Statement stmt;
		try {
			stmt = con.createStatement();

			ResultSet rs;
			rs = stmt.executeQuery("select * from employee");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " || " + rs.getString(2) + " || " + rs.getInt(3) + " || "
						+ rs.getString(4) + " || " + rs.getLong(5) + " || " + rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert() {
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
			PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			pstmt.setInt(1,id);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			pstmt.setString(4, department);
			pstmt.setLong(5, salary);
			pstmt.setString(6, company);
			if(pstmt.executeUpdate()==1)
			{
				System.out.println("Inserted Successfully!!!");
			}
			else
				System.err.println("Failed to insert!!!!!!");
		} catch (SQLException e) {
			System.err.println("Error in Insert method----------------------------");
		}
	}
	
	public void update() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter:\n(1)->Update age (2)->Salary (others)->Skip update");
		int i=Integer.parseInt(sc.nextLine());
		System.out.println("enter id:");
		int id=Integer.parseInt(sc.nextLine());
		if(i==1)
		{
			System.out.println("enter age:");
			int age=Integer.parseInt(sc.nextLine());
			PreparedStatement pstmt;
			try {
				pstmt = con.prepareStatement("update employee set age=? where eid=?");
				pstmt.setInt(1,age);
				pstmt.setInt(2, id);
				if(pstmt.executeUpdate()==1)
					System.out.println("Updated Successfully!!!!!!");
				else
					System.out.println("Failed****Please check id*********8");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		else if(i==2)
		{
			System.out.println("enter salary:");
			long salary =Long.parseLong(sc.nextLine());
			PreparedStatement pstmt;
			try {
				pstmt = con.prepareStatement("update employee set salary=? where eid=?");
				pstmt.setLong(1, salary);
				pstmt.setInt(2, id);
				if(pstmt.executeUpdate()==1)
					System.out.println("Updated Successfully!!!!!!");
				else
					System.out.println("Failed****Please check id*********");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	public void delete()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID to delete:");
		
		Integer id=Integer.parseInt(sc.nextLine());
		try {
			PreparedStatement pstmt=con.prepareStatement("delete from employee where eid=?");
			pstmt.setInt(1, id);
			if(pstmt.executeUpdate()==1)
				System.out.println("Deleted Successfully!!!!!");
			else
				System.err.println("Wrong Id Pls Check***********");
		} catch (SQLException e) {
			System.err.println("Error in delete method----------------------------");
		}
	}
	public void closeCon() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
