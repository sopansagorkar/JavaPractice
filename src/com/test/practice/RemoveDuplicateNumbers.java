package com.test.practice;

public class RemoveDuplicateNumbers {
	public static void main(String[] args) {
		int a[] = { 10, 10, 20, 30, 30, 40, 10, 40 };
		int b[] = new int[a.length];
		int j = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (!(a[i] == a[i + 1])) {
				b[j++] = a[i];
			}
		}
		b[j++] = a[a.length - 1];
		for (int i=0; i<j; i++){  
            a[i] = b[i];  
        } 
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
