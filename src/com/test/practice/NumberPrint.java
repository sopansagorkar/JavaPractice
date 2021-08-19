package com.test.practice;

public class NumberPrint {

	public static void main(String[] args) {
		//printNum();
		printNumber(0);

	}
	
	public static void printNum() {
		String s1="";
		String s2="1234567890";
		
		for(int i=s1.length();i<=(s2.length()*s2.length());i++) {
			System.out.println(i);
		}
	}
	
	public static void printNumber(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printNumber(num);
		}
	}

}
