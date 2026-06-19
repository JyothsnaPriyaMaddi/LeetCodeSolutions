package com.easy;

import java.util.Scanner;

public class TwoSum_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		System.out.println("Enter nums: ");
		int[] nums = new int[size];
		for(int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("Enter target: ");
		int target = sc.nextInt();
		TwoSum_1 t = new TwoSum_1();
		int[] twoSum = t.twoSum(nums, target);
		for(int i = 0; i < twoSum.length; i++) {
			System.out.println(twoSum[i]);
		}
	}

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
					break;
				}
			}
		}
		return result;
	}
}
