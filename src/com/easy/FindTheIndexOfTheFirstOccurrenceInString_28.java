package com.easy;

public class FindTheIndexOfTheFirstOccurrenceInString_28 {
	public int strStr(String haystack, String needle) {
		int result = Integer.MIN_VALUE;
		if (haystack.contains(needle)) {
			result = haystack.indexOf(needle);
		} else {
			result = -1;
		}
		return result;
	}
}
