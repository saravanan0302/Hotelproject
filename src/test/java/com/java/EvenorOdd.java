package com.java;

public class EvenorOdd {

	public static void main(String[] args) {
		int num=24,count=0,sum=0;
		if (num%2==0) {
			System.out.println("even");
		}		
		else {
			System.out.println("odd");
		}

	for (int i = 0; i <=100; i++) {
		if (i%2==0) {
			System.out.println(i);
			count++;
			sum=sum+i;
		}

	}
	System.out.println("count"+count);	
	System.out.println("sum"+sum);
	
	}
	
	
}
