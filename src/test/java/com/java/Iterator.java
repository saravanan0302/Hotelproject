package com.java;

import java.util.ListIterator;
import java.util.Vector;

public class Iterator {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(70);
		ListIterator<Integer> elements = v.listIterator();
		while (elements.hasNext()) {
			Integer next = (Integer) elements.next();
			System.out.println(next);
			if (next == 50) {
				elements.remove();
			}
		}
		for (Integer x : v) {
			System.out.println(x);
		}
		System.out.println("reverse" + "\n");
		while (elements.hasPrevious()) {
			Integer next = (Integer) elements.previous();
			System.out.println(next);
		}
	}
}
