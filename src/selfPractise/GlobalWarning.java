package selfPractise;

public class GlobalWarning {
    public static void main(String[] args) {
        GlobalWarningQuiz quiz= new GlobalWarningQuiz();
        quiz.renderQuiz();
        System.out.println("you got " + quiz.getRightAnswer() + " correct");
        quiz.userPerformance();
    }
}
