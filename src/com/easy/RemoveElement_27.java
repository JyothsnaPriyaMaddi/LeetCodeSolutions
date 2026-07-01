package com.easy;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement_27 {

	public int removeElement(int[] nums, int val) {
		List<Integer> newArray = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				newArray.add(nums[i]);
			}
		}
		int count = newArray.size();
		for (int i = 0; i < count; i++) {
			nums[i] = newArray.get(i);
		}
		return count;
	}
}
