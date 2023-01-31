package org.example;

import java.util.ArrayList;

public class Checkbox extends Question {
    private final ArrayList<String> answerArray = new ArrayList<>();
    public Checkbox(String type, String prompt, String answer, ArrayList<String> answerArray) {
        super(type, prompt, answer);
        //this.answerArray = answerArray;
    }
}
