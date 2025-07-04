package com.hlb;

import java.util.HashMap;
import java.util.Map;

public class JavaTest5 {
	
	// Given a Alphanumeric, please return a character with the lowest occurrence
    // E.g. AbcdAbc123123, the answer is d as it only occurs once
    // If there is more than 1 char with the same lowest occurrence, return the first char in ASC order
	// Given an Alphanumeric string, return the character with the lowest occurrence
    public static char lowestOccurrence(String input) {
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

	public static void main(String[] args) {
		
		System.out.println("Test 5: " + lowestOccurrence("Abc1dd23affbc1ee23u3278"));
	}

}
