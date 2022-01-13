package selfPractise;

import java.util.Scanner;

public class FairTax {
    public static void main(String[] args) {
        collectExpense();
    }

    public static void collectExpense(){
        Scanner input=new Scanner(System.in);
        int expense;
        int totalExpense=0;
        double tax=0.3;
        int taxPayable=0;
        System.out.println("Enter expense for housing");
        expense= input.nextInt();

        System.out.println("Enter expense for food");
        expense= input.nextInt();

        System.out.println("Enter expense for clothing");
        expense= input.nextInt();

        System.out.println("Enter expense for transportation");
        expense= input.nextInt();

        System.out.println("Enter expense for education");
        expense= input.nextInt();

        System.out.println("Enter expense for healthcare");
        expense= input.nextInt();

        System.out.println("Enter expense for vacation");
        expense= input.nextInt();

        totalExpense+=expense;

        taxPayable=(int) (expense/tax);
        System.out.println("The taxpayable for "+totalExpense+" is "+taxPayable);

}
}