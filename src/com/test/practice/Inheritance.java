package com.test.practice;

class A {
	void m1() {
		System.out.println("In m1 A");
	}
}

class B extends A {
	void m1() {
		System.out.println("In m1 B");
	}

	void m2() {
		System.out.println("In m2 B");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		B a = new A();
		a.m2();
		
	}
}
