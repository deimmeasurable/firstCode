package chapterSeven;

import java.security.SecureRandom;

public class DiceRolling {

    private static final SecureRandom input = new SecureRandom();

    public static void rollingOfTwoDiceOnce() {
        int mostFrequent;
       int [] frequent= new int[6];
        int [] rollingDice =new int[360_000_000];
        for (int number = 0; number < rollingDice.length; number++) {

            int dice1 = 1 + input.nextInt(6);
            int dice2 = 1 + input.nextInt(6);

            int sum = dice1 + dice2;
          ++frequent[rollingDice[number]];
            System.out.printf("number"+"\t"+"sum:");
        }
    }
}