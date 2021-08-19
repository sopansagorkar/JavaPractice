package com.test.practice.string;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		
		String s="ssssooooppppaaaannnnnnnn";
		String temp="";
		for(char ch: s.toCharArray()) {
			if(!temp.contains(String.valueOf(ch))) {
				temp+=ch;
			}
		}
		System.out.println(temp);

	}

}
