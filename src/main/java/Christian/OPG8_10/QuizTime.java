package Christian.OPG8_10;

public class QuizTime {

    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        Question question = new Question("Hvor mange pletter har dalmatinere?", "101", 1);
        quiz.questionsadd(question);
        quiz.questionsadd(new Question("Hvad hedder aben hvis efternavn er pedal?", "Peter", 2));

        quiz.giveQuiz(1,5);
    }
}
