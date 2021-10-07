package mainlib;

import java.io.Serializable;
import java.util.ArrayList;

public class Answer implements Serializable {
    private final ArrayList<String> answer;
    AnswerType answerType;

    public Answer(ArrayList<String> answer, AnswerType answerType) {
        this.answer = answer;
        this.answerType = answerType;
    }

    public ArrayList<String> getAnswer() {
        return answer;
    }

    public void setAnswerStatus(AnswerType answerType) {
        this.answerType = answerType;
    }

    public AnswerType getAnswerType() {
        return answerType;
    }

    public void printAnswer() {
        answer.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Answer {" +
                "answer=" + answer +
                '}';
    }
}
