package selfPractise;

import java.util.Scanner;

public class CreditLimitCalculator {
    private static int balance = 20000;
    private static int charge;
    private static int credit;
    private int accountNumber;


    private int totalCredit;
    private static int allowedCreditLimit = 15000;

    public static String displayOption() {
        Scanner scan = new Scanner(System.in);
        String prompt = """
                press 1 for account number
                press 2 to exit
                """;
        System.out.println(prompt);
        System.out.println("enter a number");
        int number = scan.nextInt();
        if (number == 1) {
            System.out.println();
            accountNumber();


        }

        return null;
    }

    public static void accountNumber() {
        Scanner input = new Scanner(System.in);
        String prompt2 = """
                press 1 balance at the beginning of the month
                press 2 for total of all items charge by the customer
                 press 3 for total of all credit applied to the customer's account 
                 press 4 for credit limit allowed
                 press 5 to check new balance
                """;
        System.out.println("welcome our dear esteem customer");
        System.out.println("enter accountNumber");
        input.nextLine();
        System.out.println(prompt2);
        System.out.println("enter a number");
        int number = input.nextInt();
        if (number == 1) {
            System.out.println();
            balanceAtTheBeginning();

        }else
        if (number == 2) {
            System.out.println();
            totalItemCharge();

        }else
        if (number == 3) {
            System.out.println();
            totalCreditApplied();


        }else
        if (number == 4) {
            System.out.println();
            creditLimitAllowed(0);


        }

    }

    private static void balanceAtTheBeginning() {
        System.out.println("this is your account balance section");
        balance = 20000;
        System.out.println(balance);
        totalItemCharge();

    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    public static void totalItemCharge() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter total item charge");
        int charges = input.nextInt();

        balance -= charges;

        System.out.println("the new value of balance is" + balance);
        totalCreditApplied();

    }


    public static void totalCreditApplied() {
        Scanner input = new Scanner(System.in);
        System.out.println("customer Total credit applied ");




    }


    private static void creditLimitAllowed(int newbalance) {
        int balance=18000;
        newbalance=
        allowedCreditLimit -= 18000;
       // System.out.println("the value of the new balance is"+newbalance);
if (balance > allowedCreditLimit){
    System.out.println("customer have exceed\n"+newbalance);
}if(newbalance<=allowedCreditLimit){
    System.out.println("customer still within the range of creditlimit"+newbalance);
}else {
            System.out.println(newbalance);
        }


    }
        public static void displays () {
            displayOption();
            accountNumber();
            balanceAtTheBeginning();
            totalItemCharge();
            totalCreditApplied();
            creditLimitAllowed(0);
        }


        public static void main(String[] args){
            creditLimitAllowed(0);
        }


    }







