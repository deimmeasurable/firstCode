package selfPractise;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10) {
            System.out.println("enter grade");
            int grade = scan.nextInt();
            total += grade;
            gradeCounter++;
        }
        double average = total/10;

        System.out.println(total);
        System.out.println(average);
    }
}
