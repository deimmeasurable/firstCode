package selfPractise;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
    private int heads;
    private int tails;

private static final SecureRandom randomNumber=new SecureRandom();

    public void userTossACoin(){
        int toss = 0;
        int total=0;
        for (int i = 0; i < 2; i++) {
            toss=(int)(Math.random()*2)+1;

        }
        if(toss==1){
            System.out.println("head");
          heads++;
            System.out.println(heads);
        }
        if(toss==2){
            System.out.println("tail");
            tails++;
            System.out.println(tails);
        }

        System.out.println("the total head of a coin is"+heads);
        System.out.println("the total head of a coin is "+tails);
    }

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    CoinTossing coin=new CoinTossing();
    System.out.println("Press 1 to toss coin or 2 to end program");
    int userInput = scan.nextInt();
    while(userInput==1) {
        coin.userTossACoin();
        System.out.println("Press 1 to toss coin or 2 to end program");
        userInput = scan.nextInt();
    }
    if (userInput == 2) System.exit(0);
}

    }


