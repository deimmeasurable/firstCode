package selfPractise;

import java.util.Scanner;

public class StudentGrade {
    private static Scanner scan =new Scanner(System.in);

    public static  void StudentName(String name){
        System.out.println("enter your name");
        name =scan.nextLine();


    }
    public static void StudentRate(){
        int Score = 0;
      int  gradeCounter=0;
      int  gradeA=0;
      int gradeB=0;
      int gradeC=0;
      int gradeD=0;
      int gradeE=0;
      int total=0;
      int totalStudent;

        do {
            System.out.println("Enter studentName");
            String name=scan.nextLine();
            System.out.println("Enter a score");
            int score = Integer.valueOf(scan.nextInt());
            scan.nextLine();

          if (score >= 90) {
              System.out.println("The studentGrade is" + "A");
              gradeA++;
          }
          else if (score >= 80 && score < 90) {

              System.out.println("The studentGrade is" + "B");
            gradeB++;

          }
          else if (score >= 70 && score < 80) {

              System.out.println("the StudentGrade is" + "c");
              gradeC++;
          }
          else if (score >= 60 && score < 70) {

              System.out.println("the StudentGrade is" + "D");
              gradeD++;

          }
          else if(score>= 50 && score < 60) {
              System.out.println("The studentGrade is" + "E");
              gradeE++;
          }
          gradeCounter++;
      }
      while (gradeCounter < 5);
        System.out.println("the total student for gradeA is  " +gradeA);
        System.out.println("the total student for gradeB is  "+gradeB);
        System.out.println("the total student for gradeC is  "+gradeC);
        System.out.println("the total student for gradeD is  "+gradeD);
        System.out.println("the total student for gradeE is  "+gradeE);

    }
    public static void display(){
        StudentRate();
    }
}
