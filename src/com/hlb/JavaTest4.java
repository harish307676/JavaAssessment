package com.hlb;

public class JavaTest4 {
	
	// sort the given String in ASC order without using method like Arrays.sort
    public static char[] sortStringInAscOrder(String input) {
        //return new char[] { 'A', 'a', 'a' };
    	
    	char[] chars = input.toCharArray();
    	
    	for (int i = 0; i < chars.length - 1; i++) {
    		int count = i;
    		for (int j = i+1; j<chars.length; j++) {
    			if (chars[j] < chars[count]) {
    				count = j;
    			}
    		}
    		char b = chars[i];
    		chars[i] = chars[count];
    		chars[count] = b;
    		
    	}
    	return chars;
    }

	public static void main(String[] args) {
		char[] sorted = sortStringInAscOrder("testingNG311");
        System.out.print("Test 4 :");
        for (char c: sorted) {
            System.out.print(c + ", ");
        }
	}

}
