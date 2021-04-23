package com.maxtrain.greg;

import java.util.ArrayList;
import java.util.HashMap;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello Java World!");
		
		int i = 0;
		var n = 1;
		Integer m = null;
		
		boolean b = true;
		Boolean nb = null;
		
		String s = "Greg";
		
		int[] ints = new int[] { 1, 2, 3, 4, 5 };
		
		// Equivalent to List<int>
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(1);
		
		// Equivalent to Dictionary<int, string>
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "First string");
		
		// foreach()
		var sum = 0;
		for(var idx : ints) {
			sum += idx;
		}
		System.out.println("sum is " + sum);
		
		// for(;;)
		var sum1 = 0;
		for(var idx = 0; idx <= 10; idx++) {
			sum1 += idx;
		}
		System.out.println("sum of numbers 1 to 10 is " + sum1);
		
	}

}
