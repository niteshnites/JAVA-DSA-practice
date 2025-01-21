package utility;

import java.util.Scanner;

public class KBCGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array of questions
        String[] questions = {
                "1. What is the capital of India?",
                "2. Who is known as the Father of the Nation in India?",
                "3. Which planet is known as the Red Planet?",
                "4. Who wrote the national anthem of India?",
                "5. What is the largest mammal on Earth?"
        };

        // Array of options
        String[][] options = {
                {"A. Delhi", "B. Mumbai", "C. Kolkata", "D. Chennai"},
                {"A. Mahatma Gandhi", "B. Jawaharlal Nehru", "C. Sardar Patel", "D. Subhas Chandra Bose"},
                {"A. Earth", "B. Mars", "C. Jupiter", "D. Saturn"},
                {"A. Rabindranath Tagore", "B. Bankim Chandra Chatterjee", "C. Sarojini Naidu", "D. Subhash Chandra Bose"},
                {"A. Elephant", "B. Blue Whale", "C. Giraffe", "D. Shark"}
        };

        // Array of correct answers
        char[] correctAnswers = {'A', 'A', 'B', 'A', 'B'};

        int prizeMoney = 0;

        System.out.println("Welcome to KBC Game!");
        System.out.println("Answer the questions correctly to win prize money.\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char answer = scanner.next().toUpperCase().charAt(0);

            // Check if the answer is correct
            if (answer == correctAnswers[i]) {
                prizeMoney += 1000; // Increment prize money
                System.out.println("Correct! You have won Rs. " + prizeMoney + "\n");
            } else {
                System.out.println("Incorrect answer. Game over!");
                System.out.println("You have won Rs. " + prizeMoney);
                break;
            }
        }

        System.out.println("Thank you for playing KBC!");
        scanner.close();
    }
}
