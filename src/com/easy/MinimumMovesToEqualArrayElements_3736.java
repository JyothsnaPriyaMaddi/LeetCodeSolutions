package com.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MinimumMovesToEqualArrayElements_3736 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		System.out.println("Enter nums: ");
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}
		MinimumMovesToEqualArrayElements_3736 m = new MinimumMovesToEqualArrayElements_3736();
		System.out.println(m.minMoves(nums));
	}

	public static int minMoves(int[] nums) {
		int result = 0;
		int max = Arrays.stream(nums).max().getAsInt();
		for (int i = 0; i < nums.length; i++) {
			if (max != nums[i]) {
				while (max != nums[i]) {
					nums[i]++;
					result++;
				}
			}
		}
		return result;
	}
}
