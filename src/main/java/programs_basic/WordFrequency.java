package programs_basic;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        // Sample input text
        String text = "This is a sample text This text is for testing word frequency Word word word";

        // Split text into words using whitespace as the delimiter
        String[] words = text.split("\\s+");

        // Use a HashMap to count the frequency of each word
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Convert the Map to a List and sort it by keys
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCount.entrySet());
        sortedList.sort(Map.Entry.comparingByKey());

        // Print the words and their frequencies in sorted order
        System.out.println("Word frequencies in sorted order:");
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

