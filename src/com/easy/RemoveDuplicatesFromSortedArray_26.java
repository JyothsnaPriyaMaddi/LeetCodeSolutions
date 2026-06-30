package com.easy;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray_26 {

	public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
		List<Integer> finalList = new ArrayList<Integer>();
		for(int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}
		for(int i = 0; i < nums.length; i++) {
			if(!finalList.contains(nums[i])) {
				finalList.add(nums[i]);
			}
		}
		int count = finalList.size();
	        for(int i = 0; i < count; i++) {
	        	nums[i] = finalList.get(i);
	        }
	       for(int i = 0; i<count; i++) {
	    	   System.out.print(nums[i]+" ");
	       }
			return count;
    }
}
