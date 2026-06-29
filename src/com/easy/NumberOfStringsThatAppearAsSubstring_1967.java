package com.easy;

import java.util.Scanner;

public class NumberOfStringsThatAppearAsSubstring_1967 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		System.out.println("Enter patterns: ");
		String[] patterns = new String[size];
		sc.nextLine();
		for(int i = 0; i < size; i++) {
			patterns[i] = sc.nextLine();
		}
		System.out.println("Enter word: ");
		String word = sc.nextLine();
		int result = numOfStrings(patterns, word);
		System.out.println(result);
	}

	public static int numOfStrings(String[] patterns, String word) {
		int count = 0;
		for(int i = 0; i < patterns.length; i++) {
			if(word.contains(patterns[i])) {
				count++;
			}
		}
		return count;
	}
}
