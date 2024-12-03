package java_8;

/*
Java 8 introduced a new Date and Time API (java.time package),
which addresses the issues with the older Date and Calendar classes.
The new API is immutable, thread-safe, and easier to use
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Today's Date: " + date);  // Current date

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);  // Custom formatted date
    }
}
