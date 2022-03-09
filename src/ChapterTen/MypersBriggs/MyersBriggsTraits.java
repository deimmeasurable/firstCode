package ChapterTen.MypersBriggs;

import java.util.ArrayList;

public class MyersBriggsTraits {
    private final ArrayList<Option> questions = new ArrayList<>();
    private static int count;
    private String[] response = new String[20];


    public void addQuestion(Option question) {
        questions.add(question);

    }

    public void addQuestions(Option... listOfQuestion) {
        for (Option question : listOfQuestion) {
            addQuestion(question);

        }

    }

    public Option renderQuestion() {
        Option question = questions.get(count);
        count++;
        return question;
    }

    public PersonalityTrait IsIntrovertOrExtrovert(String[] response) {
        int counterForI = 0;
        int counterForE = 0;
        for (int i = 0; i < questions.size(); i += 4) {
            if (response[i].equals("A")) counterForE++;
            if (response[i].equals("B")) counterForI++;
        }
        if (counterForI > counterForE)
            return PersonalityTrait.INTROVERT;
        else
            return PersonalityTrait.EXTROVERT;
    }

    public PersonalityTrait IsSensingOrIntuitive(String[] response) {
        int counterForS = 0;
        int counterForIn = 0;
        for (int i = 1; i < questions.size(); i += 4) {
            if (response[i].equals("A")) counterForS++;
            if (response[i].equals("B")) counterForIn++;
        }
        if (counterForS > counterForIn)
            return PersonalityTrait.SENSITIVE;
        else
            return PersonalityTrait.INITUITIVE;
    }

    public PersonalityTrait IsThinkingOrFeeling(String[] response) {
        int counterForT = 0;
        int counterForF = 0;
        for (int i = 2; i < questions.size(); i += 4) {
            if (response[i].equals("A")) counterForT++;
            if (response[i].equals("B")) counterForF++;
        }
        if (counterForT > counterForF)
            return PersonalityTrait.THINKING;
        else
            return PersonalityTrait.FEELING;
    }

    public PersonalityTrait IsJudgingOrPerception(String[] response) {
        int counterForJ = 0;
        int counterForP = 0;
        for (int i = 3; i < questions.size(); i += 4) {
            if (response[i].equals("A")) counterForJ++;
            if (response[i].equals("B")) counterForP++;
        }
        if (counterForP > counterForJ)
            return PersonalityTrait.JUDGING;
        else
            return PersonalityTrait.PERCEPTIVE;


    }
}

