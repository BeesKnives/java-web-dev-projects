package org.example;

public abstract class Question {
    private String question;


    public Question(String question){
        this.question = question;

    }

    public String getQuestion() {
        return question;
    }

}
