package com.collectionex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(7,4,5,7,7,7,1,4,5,14,25);
		System.out.println("Using array List==>");
		ArrayList<Integer> check=new ArrayList<Integer>();
		for(int i=0;i<list.size();i++)
		{
			int count=0;
			for(int j=0;j<list.size();j++)
			{
				if(list.get(i)==list.get(j))
				{
					count++;
				}
			}
			if(!check.contains(list.get(i)))
			{
				System.out.println(list.get(i)+"  occurence="+count);
				check.add(list.get(i));
			}
		}
		System.out.println("\nUsing Map==>");
		HashMap<Integer, Integer> map=new LinkedHashMap<Integer, Integer>();
		list.forEach((i)->{
			if(map.containsKey(i))
				map.put(i, map.get(i)+1);
			else
				map.put(i, 1);
		});
		map.forEach((m,v)->System.out.println(m+" =="+v));
		
	}

}
