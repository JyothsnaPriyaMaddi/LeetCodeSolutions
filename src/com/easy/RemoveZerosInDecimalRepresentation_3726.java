package com.easy;

import java.util.Scanner;

public class RemoveZerosInDecimalRepresentation_3726 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		long n = sc.nextLong();
		long removeZeros = RemoveZerosInDecimalRepresentation_3726.removeZeros(n);
		System.out.println(removeZeros);
		sc.close();
	}

	public static long removeZeros(long n) {
		String s = Long.toString(n);
		String s2 = "";
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '0') {
				continue;
			} else {
				s2 += s.charAt(i);
			}
		}
		long valueOf = Long.valueOf(s2);
		return valueOf;
	}
}
