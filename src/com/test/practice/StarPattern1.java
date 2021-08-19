package com.test.practice;

public class StarPattern1 {

	public static void main(String[] args) {

		for (int i = 0; i < 8; i++) {
			// System.out.println("*");
			for (int j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println("");

		}
		System.out.println();
		System.out.println();

		for (int i = 8; i >= 0; i--) {
			// System.out.println("*");
			for (int j = 0; j < i; j++) {
				System.out.print(" *");
			}
			System.out.println("");

		}
		System.out.println();
		System.out.println();

	}

}
