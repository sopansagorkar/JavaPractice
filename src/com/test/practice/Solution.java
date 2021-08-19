package com.test.practice;

public class Solution {

	public static void main(String[] args) {
	int A[]= {4, 5, 6, 15, 12, 9, 3};
	Solution s=new Solution();
	System.out.println(s.solution(A));

}

public int solution(int[] A) {
    int sum=0;
    int temp=0;
    for (int i = 0; i < A.length; i++) {
		if (A[i] == 6) {
			for (int j = i; A[j] != 9; j++) {
				A[j] = 0;
				temp = j;
			}
			A[temp + 1] = 0;
		} else
			sum += A[i];
	}
    return sum ;
}
}
