package com.greatjaime.my_leetcode;

public class ReverseString {
	public static String reverseString(String s) {
		int sLength = s.length();
        char[] result = new char[sLength];
        for(int i = sLength-1; i >= 0;i -- ) {
        	result[sLength-i-1] = s.charAt(i);
        }
        return new String(result);
    }
	
	public static void main(String[] args) {
		System.out.println("hello".length());
		System.out.println(reverseString("Hello World!"));
	}
}
