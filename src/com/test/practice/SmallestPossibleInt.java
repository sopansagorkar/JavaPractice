package com.test.practice;

import java.util.HashSet;
import java.util.Set;

public class SmallestPossibleInt {

	public static void main(String a[]) {
		int b[] = {1,2,3,4,5,6,7,8};
		SmallestPossibleInt s = new SmallestPossibleInt();
		System.out.println("****************" + s.solution(b));
	}

	public int solution(int[] A) {
		int N = A.length;
		Set<Integer> set = new HashSet<>();
		for (int a : A) {
			if (a > 0) {
				set.add(a);
			}
		}
		for (int i = 1; i <= N + 1; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}
		return N;
	}

}
