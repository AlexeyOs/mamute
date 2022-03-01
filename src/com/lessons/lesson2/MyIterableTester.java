package com.lessons.lesson2;

public class MyIterableTester {

	public static void main(String [] args) {

		Integer [] ints = {1, 2, 3};

		MyIterable<Integer> myList = new MyIterable<>(ints);

		for (Integer i : myList) {

			System.out.println(i);
		}
	}
}