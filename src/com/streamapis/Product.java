package com.streamapis;

public class Product {
	private int id;
	private String name;
	private String colour;
	private long price;
	
	public Product() {
		
	}
	
	public Product(int id, String name, String colour, long price) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.price = price;
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
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	public String toString() {
		return "Id:"+this.id+"     Name:"+this.name+"     Colour:"+this.colour+"     Price:"+this.price;
	}

	@Override
	public boolean equals(Object obj) {
		Product p=(Product)obj;
		return this==obj;
	}
	
	
}
