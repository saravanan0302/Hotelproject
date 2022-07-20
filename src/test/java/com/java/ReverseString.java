package com.java;

public class ReverseString {

	public static void main(String[] args) {
		String s = "malayalam";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char at = s.charAt(i);
			rev = rev + at;
		}
		System.out.println(rev);
		if (s.equals(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}

	}

}
