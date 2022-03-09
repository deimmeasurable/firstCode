package chapterSeven;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class ArcheryGame {
    private static final SecureRandom randomNumber=new SecureRandom();
    private static int [][] scores=new int[4][3];
   private  static int firstPlayer;
   private  static int secondPlayer;
    private static int thirdPlayer;
    private  static int forthPlayer;

    public static void playSportGame(){

        for (int i = 0; i <scores.length ; i++) {
            int score = 1 + randomNumber.nextInt(10);


            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = randomNumber.nextInt(10);

                firstPlayer = scores[0][j];
                secondPlayer = scores[1][j];
                thirdPlayer = scores[2][j];
                forthPlayer = scores[3][j];
            }
        }
            boolean isFirstNumberIsTheHighest=firstPlayer > secondPlayer && firstPlayer > thirdPlayer && firstPlayer > forthPlayer;
            if(isFirstNumberIsTheHighest) {
                System.out.println("the firstPlayer as the highest value ");

            }
            boolean isSecondPlayerTheHighest=secondPlayer > firstPlayer && secondPlayer > thirdPlayer && secondPlayer > forthPlayer;
            if(isSecondPlayerTheHighest){
                System.out.println("The secondPlayer as the highest value");

            }
            boolean isThirdPlayerTheHighest=thirdPlayer > firstPlayer && thirdPlayer > secondPlayer && thirdPlayer > forthPlayer;
            if(isThirdPlayerTheHighest){
                System.out.println("The thirdPlayer as the highest value");
            }
            boolean isForthPlayerTheHighest=forthPlayer > firstPlayer && forthPlayer > secondPlayer && firstPlayer > thirdPlayer;
            if(isForthPlayerTheHighest){
                System.out.println("The forthPlayer as the highest value");
            }



    }

    public static void main(String[] args) {
        //System.out.println("firstChanceScore"+"\t"+"secondChanceScore"+"\t"+"thirdChanceScore");
        playSportGame();
        System.out.println("firthPlayer scores:"+ Arrays.toString(scores[0]));
        System.out.println("secondPlayer scores:" + Arrays.toString(scores[1]));
        System.out.println("thirdPlayer scores:" + Arrays.toString(scores[2]));
        System.out.println("forthPlayer scores:"+ Arrays.toString(scores[3]));

    }

}
