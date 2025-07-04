package com.hlb;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaTest3 {
	
	// Check if the given date is within the date range
    public static boolean isInDateRange(Date givenDate, Date startDate, Date endDate) {
        return givenDate != null 
        		&& startDate != null 
        		&& endDate != null 
        		&& !givenDate.before(startDate) 
        		&& !givenDate.after(endDate);
    }

	public static void main(String[] args) {
		try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            
            Date startDate = sdf.parse("2024-12-01 13:09:22");
            Date endDate = sdf.parse("2025-01-09 20:10:12");
            Date givenDate = sdf.parse("2025-02-02 00:11:22");
            System.out.println("Test 3: " + isInDateRange(givenDate, startDate, endDate));
        } catch (Exception e) {
            System.out.println(e);
        }

	}

}
