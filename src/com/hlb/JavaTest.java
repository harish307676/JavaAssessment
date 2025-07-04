package com.hlb;

import java.text.SimpleDateFormat;
import java.util.*;

class JavaTest {
	// E.g. Input: Automation, Output: noitamotuA
	// Please don't use method such as s.reverse()
	public static String reverseStringWithoutUsingStringMethod(String s) {
		String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
        	reverse += s.charAt(i);
        }
        return reverse;
	}

	// Sort the integer in ASC order without using the built-in method such as
	// ArrayUtils.sort
	public static Integer[] sortIntegers(Integer[] array) {
		for (int i=0; i<array.length-1; i++) {
    		for(int j=0; j<array.length-1-i; j++) {
    			
    			if (array[j] > array[j+1]) {
    				int a = array[j];
    				array[j] = array[j+1];
        			array[j+1] = a;
    			}
    			
    		}
    		
    	}
        return array;
	}

	// Check if the given date is within the date range
	public static boolean isInDateRange(Date givenDate, Date startDate, Date endDate) {
		return givenDate != null 
        		&& startDate != null 
        		&& endDate != null 
        		&& !givenDate.before(startDate) 
        		&& !givenDate.after(endDate);
	}

	// sort the given String in ASC order without using method like Arrays.sort
	public static char[] sortStringInAscOrder(String input) {
		// return new char[] { 'A', 'a', 'a' };
    	
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

	// Given a Alphanumeric, please return a character with the lowest occurrence
	// E.g. AbcdAbc123123, the answer is d as it only occurs once
	// If there is more than 1 char with the same lowest occurrence, return the
	// first char in ASC order
	public static char lowestOccurrence(String input) {
		// return 'd';
		Map<Character, Integer> countMap = new HashMap<>();

        // Count occurrences
        for (char c : input.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        char result = 0;
        int minCount = Integer.MAX_VALUE;

        // Find lowest occurrence with ASC priority
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();

            if (count < minCount || (count == minCount && c < result)) {
                minCount = count;
                result = c;
            }
        }

        return result;

	}

	/*
	 * // Given an input, please apply the provided equations (+, -, x, /) // E.g.
	 * input: 1.5, equations: x*2, x+10/2, x*1.5-6 // Answer: 1st equation: x*2 =
	 * 1.5*2 = 3 // 2nd equation: x+10/2 = 3+10/2 = 8 // 3rd equation: x*1.5-6 =
	 * 8*1.5-6 = 6 // return 6.0 public static double solveEquations(double input,
	 * String[] equations) { return 0.0; }
	 */

	public static void main(String[] args) {
		System.out.println("Test 1: " + reverseStringWithoutUsingStringMethod("Automation"));
		
		Integer[] intArray = new Integer[] { 10, 12, 54, 1, 2, -9, 8 };
		Integer[] sortedIntegers = sortIntegers(intArray); // calling sortIntegers()
        System.out.print("Test 2: ");
        for (Integer i : intArray) {
            System.out.print(i + ", ");
        }

		System.out.println();
		
		
		try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            
            Date startDate = sdf.parse("2024-12-01 13:09:22");
            Date endDate = sdf.parse("2025-01-09 20:10:12");
            Date givenDate = sdf.parse("2025-02-02 00:11:22");
            System.out.println("Test 3: " + isInDateRange(givenDate, startDate, endDate));
        } catch (Exception e) {
            System.out.println(e);
        }
		
		
		char[] sorted = sortStringInAscOrder("testingNG311");
        System.out.print("Test 4 :");
        for (char c: sorted) {
            System.out.print(c + ", ");
        }
		System.out.println();
		
		
		System.out.println("Test 5: " + lowestOccurrence("Abc1dd23affbc1ee23u3278"));
		/*
		 * System.out.print("Test 6: ");
		 * 
		 * double calculated = solveEquations(3.4, new String[] { "x*x", "x-10/2.2",
		 * "x+4-10", "x+5*8" }); System.out.print("calculated = " + calculated);
		 */
	}
}
