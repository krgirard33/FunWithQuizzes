package org.example;

public class Question {
    String type;
    String prompt;
    String answer;


    public Question(String type, String prompt, String answer) {
        this.type = type;
        this.prompt = prompt;
        this.answer = answer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
