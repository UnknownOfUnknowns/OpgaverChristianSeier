package Christian.OPG8_10;

import Christian.OPG8_10.Complexity;

public class Question implements Complexity {
    private String question, answer;
    private int complexitylevel;

    public Question(String query, String result) {
        question = query;
        answer = result;
        complexitylevel = 1;
    }

    public void setComplexity(int level) {
        complexitylevel = level;
    }

    public int getComplexity() {
        return complexitylevel;
    }
    public String getQuestion(){
        return question;
    }
    public String getAnswer(){
        return answer;
    }
    public boolean answerCorrect(String candidateAnswer) {
        return answer.equals(candidateAnswer);
    }

    public String toString() {
        return question + "\n" + answer;
    }
}

