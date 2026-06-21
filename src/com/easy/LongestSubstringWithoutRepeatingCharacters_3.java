package com.easy;

public class LongestSubstringWithoutRepeatingCharacters_3 {

	public int lengthOfLongestSubstring(String s) {
        int length = 0;
		String s2 = "";
		String s4 = "";
		for(int i = 0; i < s.length(); i++) {
			s2 = "";
			for(int j = i; j < s.length(); j++) {
				String s3 = Character.toString(s.charAt(j));
				if(!s2.contains(s3)) {
					s2 = s2.concat(s3);
				} else {
					break;
				}
			}
			if(s4.length() < s2.length()) {
				s4 = s2;
			}
		}
		length = s4.length();
		return length;
    }
}
