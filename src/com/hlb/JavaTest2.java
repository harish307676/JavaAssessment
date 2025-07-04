package com.hlb;

public class JavaTest2 {
	
	// Sort the integer in ASC order without using the built-in method such as ArrayUtils.sort
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

	public static void main(String[] args) {
		Integer[] intArray = new Integer[] { 10, 12, 54, 1, 2, -9, 8 };
		Integer[] sortedIntegers = sortIntegers(intArray); // calling sortIntegers()
        System.out.print("Test 2: ");
        for (Integer i : intArray) {
            System.out.print(i + ", ");
        }

	}

}
