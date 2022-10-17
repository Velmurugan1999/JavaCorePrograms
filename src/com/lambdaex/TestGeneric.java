package com.lambdaex;

import java.util.Comparator;

public class TestGeneric<T> {
	private  T obj;
	int count;
	public TestGeneric(T obj)
	{
		this.obj=(T) obj;
	}
	
	public TestGeneric() {
		
	}

	public T getObj()
	{
		return this.obj;
	}
	
	public void print()
	{
		String str=this.obj.getClass().getName();
		String[] s=str.split("\\.");
		System.out.println("Type: "+s[2]+"\n Value:"+this.obj+"\n---------------");
	}

	
		
}
