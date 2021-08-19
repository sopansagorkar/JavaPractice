package com.test.practice;

public class SumArray {

	public static int a[]= {12,13,41,32,87,9,65,18};
	public static void main(String[] args) {
		//sumAllNumbers();
		sumOfOddAndEvenNumbers();
	}
	public static void sumAllNumbers() {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println(sum);
	}
	
	public static void sumOfOddAndEvenNumbers() {
		int sum1=0,sum2=0;
		for (int i : a) {
			if(i%2==0) {
				sum1+=i;
			}
			else {
				sum2+=i;
			}
		}
		System.out.println("Sum of Even numbers: " +sum1);
		System.out.println("Sum of Odd numbers: " +sum2);
	}

}
