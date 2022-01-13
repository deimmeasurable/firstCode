package selfPractise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GlobalWarningQuiz {

    //private String[] quiz;
    private String[] correctAnswer = {"B", "B", "C", "C", "A", "A", "A"};
    private static int rightAnswer=0;

    private String[] quiz = {"question1:Increased Global temps. are caused by what?options:A.Natural Disastures B.Humans C.Animals", "question2:Which box in the experiment was warmer?Options: A.Polluted Box B.Non-Polluted Box", "question3:Can Global Warming Help People?options: A.Yes B.No C.All of the Above"
            , "question4:What causes Global Warming?options: A.Green House Gasses  B.People C.All of the above", "question5:Which Arctic  animal is the most endangered from Global Warming?Options: A.Sea lions B.Polar Bears C.Walrus D.Narwhals", "Question6:What can we do to help stop GW?options: A.Stop using so much energy B.Pollute C.Nothing",
            "Question7:What will happen if GW contiues?options:A.People will age faster B.Nothing C.Sea level will continue to rise"};


    String[] userInput = new String[7];


    public void renderQuiz() {

        for (int i = 0; i < quiz.length-5; i++) {
            System.out.println(quiz[i]);
            int random=  (int) (Math.random()*6) + 1;
            String response = collectResponse("Enter your option: ");
            userInput[i] = response;
        }
        accessUserResponse();
        System.out.println(getRightAnswer());
        System.out.println(Arrays.toString(userInput));
    }

    private String collectResponse(String message) {
        Scanner input = new Scanner(System.in);
        return input.nextLine();


    }

    private void accessUserResponse() {
        for (int i = 0; i < 7; i++) {
            if (userInput[i].equals(correctAnswer[i])) {
                rightAnswer++;

            }
        }
    }
    public int getRightAnswer(){
        return rightAnswer;
    }
    public void userPerformance(){
        if(rightAnswer==5 || rightAnswer > 5){
            System.out.println("excellent");
        }
        if(rightAnswer==4){
            System.out.println("Very good");
        }
        if(rightAnswer==3 ||rightAnswer < 3){
            System.out.println("Time to brush up on your Knowledge of global warning ");

        }
    }
}

