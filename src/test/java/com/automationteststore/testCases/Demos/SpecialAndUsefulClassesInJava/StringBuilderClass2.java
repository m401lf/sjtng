package com.automationteststore.testCases.Demos.SpecialAndUsefulClassesInJava;

public class StringBuilderClass2 {

	public static void main(String[] args) {
		
		/*
		 * Some useful methods from StringBuilder 
		 * insert, replace, delete, reverse
		 */
		StringBuilder sb1 = new StringBuilder("Learning is fun");
		
		sb1.insert(9, "Java ");
		
		System.out.println(sb1);
		
		sb1.replace(9, 13, "Everything");
		
		System.out.println(sb1);
		
		sb1.deleteCharAt(0);
		
		System.out.println(sb1);
		
		sb1.delete(2, 10);
		
		System.out.println(sb1);
		
		sb1.reverse();
		
		System.out.println(sb1);
		
		
		
	}

}
