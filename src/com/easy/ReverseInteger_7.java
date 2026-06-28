package com.easy;

public class ReverseInteger_7 {
	public int reverse(int x) {
		long reversed = 0;
		while (x != 0) {
			int remainder = x % 10;
			reversed = reversed * 10 + remainder;
			if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
				return 0;
			}
			x /= 10;
		}
		return (int) reversed;
	}
}
