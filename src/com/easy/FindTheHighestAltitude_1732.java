package com.easy;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheHighestAltitude_1732 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		System.out.println("Enter nums: ");
		int[] gain = new int[size];
		for (int i = 0; i < size; i++) {
			gain[i] = sc.nextInt();
		}

		FindTheHighestAltitude_1732 f = new FindTheHighestAltitude_1732();
		int i = f.largestAltitude(gain);
		System.out.println(i);
	}

	public int largestAltitude(int[] gain) {
		int[] gain2 = new int[gain.length + 1];
		gain2[0] = 0;
		int gain3 = gain2[0];
		for(int i = 0; i < gain.length; i++) {
			gain2[i+1] = gain3 + gain[i];
			gain3 = gain2[i+1];
		}
		return Arrays.stream(gain2).max().getAsInt();
	}
}
