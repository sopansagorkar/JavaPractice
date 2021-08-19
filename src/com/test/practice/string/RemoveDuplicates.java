package com.test.practice.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String a[]) {
		
		String array[]= {"Sopan","Purva","Saavee","Shiva","Sopan","Purva"};
		removeDuplicates(array);
		for(int i=0;i<array.length;i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i].equals(array[j])) {
					//System.out.println(array[i]);
				}
				
			}
		}
		
		Set<String> duplicateSet=new HashSet<>();
		for(String s:array) {
			if(duplicateSet.add(s)==false) {
				//System.out.println(s);
			}
		}
	}
	
	public static void removeDuplicates(String a[]) {
		Map<String, Integer> countWords=new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if(countWords.containsKey(a[i])) {
				countWords.put(a[i], countWords.get(a[i])+1);
			}
			else {
				countWords.put(a[i], 1);
			}
			if(countWords.get(a[i])>1) {
				countWords.remove(a[i]);
			}
		}
		
		System.out.println(countWords.keySet());
		
	}
}
