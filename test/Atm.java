import bankApp.Account;

import java.util.Scanner;

public class Atm {
    public static Account demoAccount;
    private static int amount;
    private static int withdrawal;

    public static void main(String[] args) {userPrompt();
    }

    private static void userPrompt() {
        String prompt = """
                press 1 To create  Account
                Press 2 To Exit
                """;
        System.out.println(prompt);
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();

        if (user == 1){
            System.out.println();
            createAccount();
            accountMenu();
        }
        System.exit(0);
    }

    private static void createAccount() {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the your name");
        String accountName = input.nextLine();
        System.out.println("Enter account Pin");
        String userPin = input.nextLine();
        demoAccount= new Account("accountName","userPin");
    }

    private static void accountMenu() {
       do {
           String prompt2 = """
                  
                   press 1 to Deposit 
                   press 2 to withdraw
                   press 3 to check balance
                   press 4 to go back
                   press 5 to exit
                                  
                   """;

           System.out.println(prompt2);
           System.out.println("Enter a number");
           Scanner input = new Scanner(System.in);
           int userInput = input.nextInt();

           if (userInput == 1) {
               System.out.println("Enter Deposit Amount");
//            int deposit = amount;
               int amount = input.nextInt();
               demoAccount.deposit(amount);
               System.out.println("Your deposit was successful");
               System.out.println("enter your pin");
               String userPin = input.nextLine();
               System.out.println(demoAccount.getbalance(userPin));

           } else if (userInput == 2) {
               System.out.println("Enter Amount to withdraw: ");
               int amount = input.nextInt();
               input.nextLine();
               System.out.println("Enter Account Pin");
               String pin = input.nextLine();
               //           int amount = input.nextInt();
//               String pin = input.nextLine();
               demoAccount.withdrawal(amount, pin);

           } else if (userInput == 3) {
//               input.nextInt();
               input.nextLine();
               System.out.println("Enter Account Pin to check balance: ");
               String pin = input.nextLine();
               int balance = demoAccount.getbalance(pin);
               System.out.println(balance);

           } else if (userInput == 4) {
               userPrompt();
           } else
               System.out.println(0);
       }while(true);
}
}




