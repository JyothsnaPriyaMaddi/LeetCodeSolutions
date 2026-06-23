package com.easy;

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays_4 {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			list.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			list.add(nums2[i]);
		}
		list.sort((a, b) -> a.compareTo(b));
		if (list.size() % 2 == 0) {
			int quotient = list.size() / 2;
			int q1 = list.get(quotient);
			int q2 = list.get(quotient - 1);
			median = (double) (q1 + q2) / 2;
		} else {
			int quotient = list.size() / 2;
			if (list.size() < quotient) {
				median = (double)(list.get(0));
			} else {
				median = list.get(quotient);
			}
		}
		return median;
    }
}
