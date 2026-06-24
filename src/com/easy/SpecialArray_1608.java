package com.easy;

import java.util.Scanner;

public class SpecialArray_1608 {
	

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        System.out.println("Enter array: ");
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int i = SpecialArray_1608.specialArray(arr);
        System.out.println(i);
    }
    public static int specialArray(int[] nums) {
        int x = 0;
        int temp = 0;
        for(int i = 0; i < nums.length; i++) {
            temp = 0;
            x++;
            for(int j = 0; j < nums.length; j++) {
                if (nums[j] >= x) {
                    temp++;
                }
            }
            if(temp == x) {
                return x;
            }
        }
        return -1;
    }
}
