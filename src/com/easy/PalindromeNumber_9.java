package com.easy;

public class PalindromeNumber_9 {

	public boolean isPalindrome(int x) {
        boolean result = false;
		String x2 = Integer.toString(x);
		int x3 = x;
		int remainder = 0;
		int count = 0;
		String reverse = "";

		while (x3 != 0) {
			remainder = x3 % 10;
			count++;
			x3 = x3 / 10;
		}
		if (x == 0) {
			count = 1;
			result = true;
			return result;
		} else {
			while (count != 0) {
				reverse = reverse + x2.charAt(count-1);
				count--;
			}
			if (reverse.equals(x2)) {
				result = true;
			} else {
				result = false;
			}
		}
		return result;
    }
}
