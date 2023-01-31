package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<>();

    private ArrayList<Question> getQuestion() {
        return questions;
    }

    public static void takeTest(ArrayList<Question> questions) {
        int score = 0;
        Scanner userInput = new Scanner(System.in);

        for(Question question : questions) {
            System.out.println(question.getPrompt());
            String theirAnswer = userInput.nextLine();
            if (question.type.equals("multi") || question.type.equals("tf")) {
                if (theirAnswer.equals(question.answer)) {
                    score++;
                    System.out.println("Correct!\n");
                } else {
                    System.out.println("Incorrect\n");
                }
            } else if (question.type.equals("checkbox")) {
                // I want to walk through their answer, and check that each letter is contained in question.answer
                // If a letter is not, sout incorrect & break
                // If all are contained sout correct & score++;
                System.out.println("Not yet working");
                for (int i=0; i<theirAnswer.length(); i++) {
                    theirAnswer.toCharArray();
                }
            }
        }
        System.out.println("You got "+ score + " out of " + questions.size() + " correct.");
    }
}
