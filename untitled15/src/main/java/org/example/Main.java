package org.example;

package org.example;

import java.util.Scanner;

class FutureSimpleTest {
    private static final String[] questions = {
            "1. Will you come to the party?",
            "2. What time will the train arrive?",
            "3. Who will be the next president?",
            "4. Where will you spend your vacation?",
            "5. How many books will you read this year?"
    };

    private static final String[] options = {
            "a. Yes, I will.",
            "b. No, I won't.",
            "c. Maybe.",
            "d. I'm not sure."
    };

    private static final String[] answers = {
            "a", "b", "c", "d", "a"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Future Simple Test!");
        System.out.println("Please answer the following questions (a, b, c, d), or enter 'q' to quit.");

        int totalQuestions = questions.length;
        int correctAnswers = 0;
        int currentQuestion = 0;

        while (currentQuestion < totalQuestions) {
            System.out.println("\n" + questions[currentQuestion]);
            for (String option : options) {
                System.out.println(option);
            }

            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            if (!input.matches("[a-d]")) {
                System.out.println("Invalid option! Please enter a valid option (a, b, c, d).");
                continue;
            }

            if (input.equalsIgnoreCase(answers[currentQuestion])) {
                correctAnswers++;
            }

            currentQuestion++;
        }

        double score = (double) correctAnswers / totalQuestions * 100;
        System.out.println("\nTest completed!");
        System.out.println("Your score: " + score + "%");

        // Admin view of correct answers
        System.out.println("\nAdmin view:");
        System.out.println("Enter the password to view the correct answers:");
        String password = scanner.nextLine();

        if (password.equals("1111")) {
            System.out.println("Correct answers:");
            for (int i = 0; i < totalQuestions; i++) {
                System.out.println(questions[i]);
                System.out.println("Correct answer: " + options[getIndex(answers[i])]);
                System.out.println();
            }
        } else {
            System.out.println("Incorrect password. Access denied.");
        }
    }

    private static int getIndex(String answer) {
        switch (answer) {
            case "a":
                return 0;
            case "b":
                return 1;
            case "c":
                return 2;
            case "d":
                return 3;
            default:
                return -1;
        }
    }

    System.out.println("Welcome to the Future Simple Test!");
}