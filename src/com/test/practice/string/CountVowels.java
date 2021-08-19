package com.test.practice.string;

import java.util.HashMap;
import java.util.Map;

public class CountVowels {

	
	public static void main(String[] args) {

		String str = "shashanksagorkar";
		String temp="";
		char vowelArray[]= {'a','e','i','o','u'};
		int j=0;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		 for (Map.Entry<Character,Integer> m:map.entrySet()) {
			 for (int i = 0; i < vowelArray.length; i++) {
				if(!(m.getKey().charValue()==vowelArray[i])) {
					System.out.println(m.getKey().charValue());
					
				}
			}
	        }
		System.out.println(temp);
		System.out.println(map);

	}

}
