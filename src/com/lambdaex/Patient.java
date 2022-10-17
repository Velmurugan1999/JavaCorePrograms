package com.lambdaex;

public class Patient {
	private int id;
	private String name;
	private double fee;
	private long mobileno;
	
	public Patient(int id, String name, double fee, long mobileno) {
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.mobileno = mobileno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String toString() {
		return "Id:"+this.getId()+"  Name:"+this.getName()+"  Fee:"+this.getFee()
			+"  Mobile:"+this.getMobileno();
	}
}
