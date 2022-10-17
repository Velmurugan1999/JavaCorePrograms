package com.arrays;

import com.lambdaex.Oneparam;

public class Student implements Oneparam{
	private int sid;
	private String name;
	private int rank;
	
	
	public Student(int sid, String name, int rank) {
		this.sid = sid;
		this.name = name;
		this.rank = rank;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Id: "+sid+"-Name: "+name+"-Rank: "+rank;
	}
	/*public void execute(Oneparam p) {
		p.pass(5);
	}*/
	@Override
	public void pass(int i) {
		System.out.println("Sid : "+i);
	}
	
}
