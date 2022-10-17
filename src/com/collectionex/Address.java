package com.collectionex;

public class Address {
	private int dNo;
	private String streetName;
	private String city;
	private long pincode;
	public Address() {
		
	}
	public Address(int dNo, String streetName, String city, long pincode) {
		super();
		this.dNo = dNo;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}
	public int getdNo() {
		return dNo;
	}
	public void setdNo(int dNo) {
		this.dNo = dNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String toString() {
		return "Doorno:"+this.dNo+"  Street:"+this.streetName+"  City:"+this.city+"  Pincode:"+this.pincode;
	}
}
