package com.automationteststore.testCases.Demos.Set_And_List.LISTs_in_Java;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		
		/*
		 * HashMap provides the basic implementation of Map interface
		 * It stores data in Key and Value pairs
		 * We can access a value using the corresponding key
		 * Methods: put, get, containsKey, remove, clear, keySet, values, entrySet
		 */
		
		var map = new HashMap<Integer,String>();
		
		map.put(1, "Jan");
		map.put(0, "Feb");
		map.put(3, "Mar");
		map.put(4, "Apr");
		map.put(5, "May");
		
		System.out.println(map.get(2));
		
		System.out.println(map.containsKey(3));
		
		map.put(4, "Dec");
		
		//map.remove(4);
		
		//map.remove(5, "May1");
		
		//map.clear();
		
		var set1 = map.keySet();
		
		var set2 = map.values();
		
		var set3 = map.entrySet();
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	
		System.out.println(map);
		

	}
}
