package com.test.practice;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 12349;
		int temp = 0;
		while (number > 0) {
			temp = (temp * 10) + (number % 10);
			number = number / 10;
		}
		System.out.println(temp);

	}

}
