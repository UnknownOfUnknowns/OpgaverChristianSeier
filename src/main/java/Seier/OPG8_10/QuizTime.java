package Seier.OPG8_10;

public class QuizTime {

    public static void main(String[] args) {
        Quiz quiz1 = new Quiz();

        Question question = new Question ("Hans Andersen havde en", "bondegård", 1);
        quiz1.questionsadd(question);
        quiz1.questionsadd(new Question("Hvad hedder aben hvis efternavn er pedal?", "Peter", 2));

        quiz1.giveQuiz(2);



    }

}
