package j_p1_baosic;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Hacker_javaDateAndTime {
	

	    public static String findDay(int month, int day, int year) {
	        // Create a LocalDate instance
	        LocalDate date = LocalDate.of(year, month, day);
	        // Get the day of the week and return it in uppercase
	        DayOfWeek dayOfWeek = date.getDayOfWeek();
	        return dayOfWeek.toString();
	    }

	    public static void main(String[] args) {
	        // Hardcoded date: 26 12 2024
	        int month = 1;
	        int day = 1;
	        int year = 1;

	        String result = findDay(month, day, year);
	        System.out.println(result); // Output: THURSDAY
	    }
	}

