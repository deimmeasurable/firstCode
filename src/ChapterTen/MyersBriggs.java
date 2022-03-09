package ChapterTen;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class MyersBriggs {
    //    private static String[] personalityTestQuestion = new String[20];
    private String[] userResponse = new String[20];
    private String message;
    private static  Scanner scanner = new Scanner(System.in);


    //    public void displayQuestions() {
    String[] personalityTestQuestions = {"Question1:\n a. expend energy, enjoy groups or b. conserve energy, enjoy one-on-one",
            "Question2:\n a. interpret literally or b. look for meaning and possibilities",
            "Question3: a. logical, thinking, questioning or\n b. empathetic, feeling, accommodating",
            "Question4:\n a. organized, orderly or\n b. flexible, adaptable", "Question5:\n a. more outgoing, think out loud or b. more reserved, think to yourself",
            "Question6:\n a. practical, realistic, experiential or b. imaginative, innovative, theoretical", "Question7:\n a. candid, straight forward, frank or\n b. tactful, kind, encouraging",
            "Question8:\n a. plan, schedule or b. unplanned, spontaneous",
            "Question9:\n a. seek many tasks, public activities, interaction with others or\n b. seek private, solitary activities with quiet to concentrate",
            "Question10:\n a. standard, usual, conventional or b. different, novel, unique",
            "Question11:\n a. firm, tend to criticize, hold the line or\n b. gentle, tend to appreciate, conciliate",
            "Question12:\n a. regulated, structured or b. easygoing, “live” and “let live”+",
            "Question13:\n a. external, communicative, express yourself or b. internal, reticent, keep to yourself",
            "Question14:\n a. focus on here-and-now or b. look to the future, global perspective, “big picture”+", "Question15:\n a. tough-minded, just or b. tender-hearted, merciful",
            "Question16:\n a. preparation, plan ahead or b. go with the flow, adapt as you go", "Question17:\n a. active, initiate or b. reflective, deliberate",
            "Question18:\n a. facts, things, “what is” or b. ideas, dreams, “what could be,” philosophical",
            "Question19:\n a. matter of fact, issue-oriented or b. sensitive, people-oriented, compassionate",
            "Question20:\n a. control, govern or b. latitude, freedom"};



    public void renderPersonalityTestQuestionForBothExtrovertAndIntroVert() {
        scanner = new Scanner(System.in);
        int counterForExtrovert = 0;
        int counterForIntrovert = 0;


        for (int i = 0; i < personalityTestQuestions.length; i += 4) {
            System.out.println(personalityTestQuestions[i]);

            displayResponseType(message);
            String response = scanner.nextLine();
            boolean isNotEqualToAOrB=!Objects.equals(response, "a") && !Objects.equals(response, "b");
            if(isNotEqualToAOrB){
                System.out.println("The is not the right input");
               response = scanner.nextLine();
            }
            boolean isUserResponseEqualToNull=userResponse[i] == null;
            if (isUserResponseEqualToNull) {
                userResponse[i] = response;
            }

            boolean isUserInputEqualToA=userResponse[i].equalsIgnoreCase("a");
            if (isUserInputEqualToA) {
                counterForExtrovert++;
                System.out.println("the value of counter for E "+counterForExtrovert);

            } else if (userResponse[i].equalsIgnoreCase("b")) {
                counterForIntrovert++;
                System.out.println("the value of counter for I"+counterForIntrovert);
            }


        }boolean isExtrovertGreaterThanIntrovert = counterForExtrovert > counterForIntrovert;
        if (isExtrovertGreaterThanIntrovert) {
            System.out.println("You are an Extrovert");
        } else if (counterForIntrovert > counterForExtrovert) {
            System.out.println("You are an Introvert");
        }

    }
    public void renderPersonalityTestQuestionForBothSensingAndIntuitive(){
        scanner = new Scanner(System.in);
        int counterForSensing = 0;
        int counterForIntuitive = 0;


        for (int i = 1; i <= personalityTestQuestions.length; i += 4) {
            System.out.println(personalityTestQuestions[i]);

            displayResponseType(message);
            String response = scanner.nextLine();
            if(!Objects.equals(response, "a") && !Objects.equals(response, "b")){
                System.out.println("The is not the right input");
                response = scanner.nextLine();
            }
            if (userResponse[i] == null) {
                userResponse[i] = response;
            }


            if (userResponse[i].equalsIgnoreCase("a")) {
                counterForSensing++;
                System.out.println("the value of counter for S "+counterForSensing);
            } else if (userResponse[i].equalsIgnoreCase("b")) {
                counterForIntuitive++;
                System.out.println("the value of counter for N"+counterForIntuitive);

            }

        }
        if (counterForSensing > counterForIntuitive) {
            System.out.println("You have the attribute of Sensing");
        } else if (counterForIntuitive > counterForSensing) {
            System.out.println("You have the attribute of Intuitive");
        }

    }
    public void renderPersonalityTestQuestionForBothThinkingAndFeeling(){
        scanner = new Scanner(System.in);
        int counterForThinking = 0;
        int counterForFeeling = 0;


        for (int i = 2; i <= personalityTestQuestions.length; i += 4) {
            System.out.println(personalityTestQuestions[i]);

            displayResponseType(message);
            String response = scanner.nextLine();
            if(!Objects.equals(response, "a") && !Objects.equals(response, "b")){
                System.out.println("The is not the right input");
                response = scanner.nextLine();
            }
            if (userResponse[i] == null) {
                userResponse[i] = response;
            }
            System.out.println(Arrays.toString(userResponse));

            if (userResponse[i].equalsIgnoreCase("a")) {
                counterForThinking++;
               System.out.println("the value of counter for T "+counterForThinking);
            } else if (userResponse[i].equalsIgnoreCase("b")) {
                counterForFeeling++;
                System.out.println("the value of counter for F"+counterForFeeling);


            }

        }
        if (counterForThinking > counterForFeeling) {
            System.out.println("Thinking");
        } else if (counterForFeeling > counterForThinking) {
            System.out.println("Feeling");
        }

    }
    public void renderPersonalityTestQuestionForBothJudgingAndPerceptive(){
        scanner = new Scanner(System.in);
        int counterForJudging = 0;
        int counterForPerceptive = 0;


        for (int i = 3; i <= personalityTestQuestions.length; i += 4) {
            System.out.println(personalityTestQuestions[i]);

            displayResponseType(message);
            String response = scanner.nextLine();
            if(!Objects.equals(response, "a") && !Objects.equals(response, "b")){
                System.out.println("The is not the right input");
                response = scanner.nextLine();
            }
            if (userResponse[i] == null) {
                userResponse[i] = response;
            }
            System.out.println(Arrays.toString(userResponse));

            if (userResponse[i].equalsIgnoreCase("a")) {
                counterForJudging++;
                System.out.println("the value of counter for J "+counterForJudging);
            } else if (userResponse[i].equalsIgnoreCase("b")) {
                counterForPerceptive++;
                System.out.println("the value of counter for P "+counterForPerceptive);


            }


        }boolean isJudgingGreaterThanPerceptive=counterForJudging > counterForPerceptive;
        if (isJudgingGreaterThanPerceptive) {
            System.out.println("Judging");
        } else if (counterForPerceptive > counterForJudging) {
            System.out.println("Perceptive");
        }



    }


    public String displayResponseType(String message) {
        message=message;
        System.out.println("enter a or b");
        return message;
    }

}

