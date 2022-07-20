package com.java;

public class ReverseTheNumber {
	public static void main(String[] args) {
	int num=9779242,rev=0,rem=0,temp=num,count=0,sum=0;
while (num>0) {
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;
	count++;
	sum=sum+rem;
	
}
System.out.println("sum="+sum);
System.out.println("Reverse="+rev);
System.out.println("count="+count);
	if (temp==rev) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("it is not palindrome");
	}
	}

}
