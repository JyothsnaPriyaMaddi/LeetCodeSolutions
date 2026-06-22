package com.easy;

import java.util.Scanner;

public class MaximumNumberOfBalloons_1189 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = sc.nextLine();
		int result = maxNumberOfBalloons(text);
		System.out.println(result);
		sc.close();
	}

	public static int maxNumberOfBalloons(String text) {
		int result = 0;
		while(true) {
			if(text.contains("b")) {
				long indexOf = text.indexOf("b");
				StringBuilder sb = new StringBuilder(text);
				sb.deleteCharAt((int)indexOf);
				text = sb.toString();
				if(text.contains("a")) {
					indexOf = text.indexOf("a");
					sb = new StringBuilder(text);
					sb.deleteCharAt((int)indexOf);
					text = sb.toString();
				} else {
					break;
				}
				if(text.contains("l")) {
					indexOf = text.indexOf("l");
					sb = new StringBuilder(text);
					sb.deleteCharAt((int)indexOf);
					text = sb.toString();
				} else {
					break;
				}
				if(text.contains("l")) {
					indexOf = text.indexOf("l");
					sb = new StringBuilder(text);
					sb.deleteCharAt((int)indexOf);
					text = sb.toString();
				} else {
					break;
				}
				if(text.contains("o")) {
					indexOf = text.indexOf("o");
					sb = new StringBuilder(text);
					sb.deleteCharAt((int)indexOf);
					text = sb.toString();
				} else {
					break;
				}
				if(text.contains("o")) {
					indexOf = text.indexOf("o");
					sb = new StringBuilder(text);
					sb.deleteCharAt((int)indexOf);
					text = sb.toString();
				} else {
					break;
				}
				if(text.contains("n")) {
					indexOf = text.indexOf("n");
					sb = new StringBuilder(text);
					sb.deleteCharAt((int)indexOf);
					text = sb.toString();
				} else {
					break;
				}
				result++;
			} else {
				break;
			}
		}
		return result;
	}
}
