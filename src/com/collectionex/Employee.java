package com.collectionex;

public class Employee implements Comparable<Employee>{
	private int eid;
	private String name;
	private String department;
	private long salary;
	public Employee(int eid, String name, String department, long salary) {
		this.eid = eid;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override 
	public String toString()
	{
		return "Id=> "+this.getEid()+" || Name=> "+this.getName()+" || Department=> "+
				this.getDepartment()+" || Salary=> "+this.getSalary();
	}
	@Override
	public int compareTo(Employee o) {
		return (int) (this.getEid()-o.getEid());
	}
	
}
