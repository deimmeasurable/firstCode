package selfPractise;

import java.util.Scanner;

public class Tax_Calculator {
//    private static int earning;

    public static void main(String[] args) {
        setEarning();
    }

    public static double taxRatioForEarningBelow30000(int earning) {
        double tax=0.15;
        int usersTax = (int) (earning*tax);
        return usersTax;
    }
    public static double taxRatioForEarningAbove30000(int earning){
        double tax = 0.2;
        int userTax =(int)(earning*0.2);
        return userTax;
    }
   public static void setEarning(){
        int userOnesEarning =0;
       int userTwoEarning =0;
       int userThreeEarning =0;
       Scanner scan =  new Scanner(System.in);
       int total=0;
       int counter =1;

        while (counter<=3){
            System.out.println("enter your earning");
            //users response
            int userInput=scan.nextInt();

            //user enters -1
            if (userInput == -1){
                System.exit(1);
            }

            if (counter==1){
                userOnesEarning =userInput;
            }

            if (counter==2){
                userTwoEarning =userInput;
            }

            if (counter==3){
                userThreeEarning =userInput;
            }
//

            counter++;
        }
        if(userOnesEarning<=30000){
            double usersTax = taxRatioForEarningBelow30000(userOnesEarning);
            System.out.println("first users tax on " + userOnesEarning + " is " + usersTax);
            total= (int) (total+usersTax);

        }else{
           double usersTax= taxRatioForEarningAbove30000(userOnesEarning);
            System.out.println("first users tax on " + userOnesEarning + " is " + usersTax);
            total=(int) (total+usersTax);
        }
       if(userTwoEarning<=30000){
           double usersTax= taxRatioForEarningBelow30000(userTwoEarning);
           System.out.println("Second users tax on " + userTwoEarning + " is " + usersTax);
           total=(int)(total+usersTax);

       }else {
           double usersTax = taxRatioForEarningAbove30000(userTwoEarning);
           System.out.println("Second users tax on " + userTwoEarning + " is " + usersTax);
           total=(int) (total+usersTax);

       }
       if(userThreeEarning<=30000){
           double usersTax =taxRatioForEarningBelow30000(userThreeEarning);
           System.out.println("Third users tax on " + userThreeEarning + " is " + usersTax);
           total=(int) (total+usersTax);

       }else {
           double usersTax = taxRatioForEarningAbove30000(userThreeEarning);
           System.out.println("Third users tax on " + userThreeEarning + " is " + usersTax);
           total=(int)(total+usersTax);

       }
       System.out.println("the total tax is "+total);
        }
//       System.out.printf("the total citizen earning is %d :", total);
  }
//
//
//
//    }