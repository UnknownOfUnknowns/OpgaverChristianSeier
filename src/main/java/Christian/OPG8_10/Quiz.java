package Christian.OPG8_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    ArrayList<Question> questions = new ArrayList<>();

    public Quiz() {

    }

    public void questionsadd(Question question){
        questions.add(question);
    }
    public void giveQuiz (){
        int point = 0;
        for(int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(i).getQuestion());

            Scanner scan = new Scanner(System.in);
            String answer = scan.next();
            if(questions.get(i).answerCorrect(answer)){
                point += 1;
            }
            System.out.println("point efter denne runde " + point);
        }
        System.out.println("spilleren har: " + point + " Point" + " ud af " + questions.size() + " spørgsmål");

        }
    }

