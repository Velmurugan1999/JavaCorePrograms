package com.collectionex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class MapHashMap {

	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<String, String>();
		map.put("Ashoke01","ashoke@01");
		map.put("Amit04","amit@05");
		map.put("Zafer02","zafer@02");
		map.put("Prem12","prem@12");
		map.put("Balaji50","123@05");
		map.put("John15","john@02");
		System.out.println("=========Hash Map===========");
		for(Entry<String, String> e:map.entrySet()) {
			System.out.println("Username="+e.getKey()+"  Password="+e.getValue());
		}
		long t1=System.nanoTime();
		Set<String> set1=map.keySet();
		System.out.println("=========Copy Key from map to set by keySet()======");
		long t2=System.nanoTime();
		set1.forEach(k->System.out.println(k));
		System.out.println("Time:"+(t2-t1));
		Set<String> set2=new TreeSet<String>();
		long t3=System.nanoTime();
		for(Entry<String, String> e:map.entrySet()) {
			set2.add((String) e.getKey());
		}
		long t4=System.nanoTime();
		System.out.println("=========Copy Key from map to set by manual======");
		set2.forEach(k->System.out.println(k));
		System.out.println("Time:"+(t4-t3));
		
		
	}

}
