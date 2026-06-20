package com.easy;

import java.util.Scanner;

public class PerfectNumber_507 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = sc.nextInt();
		boolean result = PerfectNumber_507.checkPerfectNumber(num);
		System.out.println(result);
		sc.close();
	}
	
	public static boolean checkPerfectNumber(int num) {
		int sum = 0;
		for(int  i = 1; i < num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		if(num == sum) {
			return true;
		}
		return false;
	}
}
