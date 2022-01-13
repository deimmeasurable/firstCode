package selfPractise;

import java.util.Locale;
import java.util.Scanner;

public class XmasQuestion {
    public static void main(String[] args) {
        String q1="When is christmas celebrated?\noptions:\n A.25th December \n B.30th December";
        String q2="The traditional christmas tree originated?\noptions:\n A.Italy\n B.Germany";
        String q3="Name the first US president who decorated the christmas tree at the White House?\noptions:\n A.Barrack Obama \n B.Franklin Pierce";
        String q4="What does the red colour of christmas symbolize?\nA.Blood of Jesus.\n B. Suffering of Jesus christ";
        String q5="What does the green color of Christmas signify?\nA.Continuity of life \n B. Continuity of nature.";
        String q6="People buy Artificial Christmas trees more than real ones?\noptions\n A.False \n B. True";
        String q7="What is frankincense?\n options:\nA. plant resin with healing properties.\n B.A shinning star";
        String q8=" Which ornament is present on the tip of elves' shoes?\nOption:\n A. Stars\n B. Bells";
        String q9="When is Christmas celebrated in Russia?\nOption:\n A.December\n B.January";
        String q10="Which famous scientist was born on 25 December?\n Option:\n A.Sir Isaac Newton\n B.Galileo Galilei";


        Question [] questions={
                new Question(q1,"A"),
                new Question(q2,"B"),
                new Question(q3,"B"),
                new Question(q4,"B"),
                new Question(q5,"A"),
                new Question(q6,"B"),
                new Question(q7,"A"),
                new Question(q8,"B"),
                new Question(q9,"B"),
                new Question(q10,"A"),

        };
        attemptQuiz(questions);
    }
    public static void attemptQuiz(Question [] questions){
        int rating =0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < questions.length-5; i++) {
            System.out.println(questions[i].prompt);
           int random=  (int) (Math.random()*9) + 1;
            System.out.println("enter your answer");
            String answer = scan.nextLine().toUpperCase();
            if(answer.equals(questions[i].answer)){
                rating++;
            }

        }
        System.out.println("your performance rating"+rating+"/"+(questions.length-5));
    }
}
