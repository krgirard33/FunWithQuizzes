package org.example;

import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args) {
        String q1 = "A class, Greeting, extends another class, Message. By convention, how would we represent the relationship between these classes in a diagram?" +
                "(a) two boxes with an arrow pointing from Greeting to Message\n(b) two boxes with an arrow pointing from Message to Greeting\n(c) two boxes with Greeting positioned inside of Message\ntwo boxes with Greeting positioned directly beneath Message";
        String q2 = "Which of the following is NOT a term for one class that extends another:" +
                "(a) subclass\n(b) derived class\n(c) extension class\n(d) child class";

        Question question1 = new Question("multi",q1,"a");
        Question question2 = new Question("multi",q2,"c");



    }
}
