package com.test.practice;

public class MaxMinNumber {

	public static void main(String[] args) {
		MaxMinNumbers();
		SecondMaxMin();

	}

	public static void SecondMaxMin() {
		int arr[] = { 23, 43, 12, 19, 10, 52, 78, 25, 99, 2, 1, 3, 0 };
		int max = arr[0];
		int secondmax = arr[0];
		int min = arr[0];
		int secondmin = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondmax = max;
				max = arr[i];
			} else if (arr[i] > secondmax) {
				secondmax = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				secondmin = min;
				min = arr[i];
			} else if (arr[i] < secondmin) {
				secondmin = arr[i];
			}
		}
		System.out.println("\nSecond maximum number is: " + secondmax);
		System.out.println("\nSecond minimum number is: " + secondmin);
	}

	public static void MaxMinNumbers() {
		int max = 0, min = 0;
		int num[] = { 23, 43, 12, 19, 10, 52, 78, 25, 99, 2, 1, 3, 0 };
		max = num[0];
		min = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			} else if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("\nMax number is " + max);
		System.out.println("\nMin number is " + min);
	}

}
