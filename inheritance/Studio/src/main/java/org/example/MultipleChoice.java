package org.example;

public class MultipleChoice extends Question { //answer1 is the true one
    String trueAnswer;
    String falseAnswer1;
    String falseAnswer2;
    String falseAnswer3;


    public MultipleChoice(String question, String trueAnswer, String falseAnswer1, String falseAnswer2, String falseAnswer3){
        super(question);
        this.trueAnswer = trueAnswer;
        this.falseAnswer1 = falseAnswer1;
        this.falseAnswer2 = falseAnswer2;
        this.falseAnswer3 = falseAnswer3;
    }


    


}

// 4 choices, make 4 instances of question