package com.java;

public class ConsonantsAndvowels {
	public static void main(String[] args) {
		String s="welcome";
	    String con="",vow="";
	    int conCount=0,vowCount=0;
	    for (int i = 0; i < s.length(); i++) {
			char at = s.charAt(i);
		if (at=='a'||at=='e'||at=='i'||at=='o'||at=='u'||at=='A'||at=='E'||at=='I'||at=='O'||at=='U') {
			con=con+at;
			conCount++;
		}
		else {
			vow=vow+at;
			vowCount++;
		}
	    }
	    System.out.println(con);
	    System.out.println(vow);
	    System.out.println(conCount);
	    System.out.println(vowCount);
	}

}
