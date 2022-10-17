package com.streamapis;

public class Transactions {
	private int id;
	private Traders trader;
	private int year;
	private int value;
	public Transactions(int id, Traders trader, int year, int value) {super();
		this.id = id;
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Traders getTrader() {
		return trader;
	}
	public void setTrader(Traders trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String toString() {
		return "Id:"+this.id+"  Name:"+this.trader.getName()+"  City:"+
					this.trader.getCity()+"  Year:"+this.year+"  Value:"+this.value;
	}
}
