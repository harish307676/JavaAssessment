package com.hlb;

public class JavaTest1 {
	
	public static String reverseStringWithoutUsingStringMethod(String s) {
		String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
        	reverse += s.charAt(i);
        }
        return reverse;
    }
	
	public static void main(String[] args) {
		 System.out.println("Test 1: " + reverseStringWithoutUsingStringMethod("Automation"));
	}

}
