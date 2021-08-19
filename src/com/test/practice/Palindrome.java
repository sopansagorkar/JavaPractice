package com.test.practice;

public class Palindrome {

	public static void main(String[] args) {

		StringPalindrome();
		NumberPalindrome();

	}

	public static void NumberPalindrome() {
		int rev = 12321;
		int temp, r;
		int sum = 0;
		temp = rev;
		while (rev > 0) {
			r = rev % 10;
			sum = (sum * 10) + r;
			rev = rev / 10;
		}
		if (temp == sum) {
			System.out.println("Given number is Palindrome");
		} else {
			System.out.println("Given number is not Palindrome");
		}
	}

	public static void StringPalindrome() {
		String s = "madam";
		String temp = "";

		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt((s.length() - 1) - i)) {
				temp = temp + s.charAt(i);
			}
		}
		if (temp.equals(s)) {
			System.out.println("Given String is Palindrome");
		} else {
			System.out.println("Given String is not Palindrome");
		}
	}

}
