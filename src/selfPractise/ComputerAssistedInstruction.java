package selfPractise;

import java.util.Scanner;

public class ComputerAssistedInstruction {
    public static void main(String[] args) {


        ComputerAssistedInstruction computer = new ComputerAssistedInstruction();

        computer.display();
    }
    public void createToIntegerForStudent() {
       Scanner input = new Scanner(System.in);
      int randomNumber1 = (int) (Math.random() * 12 + 1);
        int randomNumber2 = (int) (Math.random() * 12 + 1);
       System.out.println(randomNumber1 + " times " + randomNumber2);
int total=0;
       int value = 0;
      while (total !=-1 ) {
          System.out.println("Enter the total value");
          total = input.nextInt();

          randomNumber1 = (int) (Math.random() * 12 + 1);
          randomNumber2 = (int) (Math.random() * 12 + 1);
          System.out.println(randomNumber1 + " times " + randomNumber2);

            if (randomNumber1 * randomNumber2 == total) {
               total = randomNumber1 * randomNumber2;
               System.out.println("very good");
                input.nextLine();
                allowUserToAttempt(value);
           }
            else {
                System.out.println("no. please try again");
           }

       }

   }
        public  int  promptUser(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
        }
        public  void allowUserToAttempt(int number) {
            System.out.println("Enter 1 to start  or 2 to quit");
            number = promptUser();

            switch (number) {
                case 1 -> {
                    System.out.println("");
                    createToIntegerForStudent();
                    break;
                }


                case 2 -> {
                    System.exit(0);
                    break;
                }
            }

        }
            public void display(){
        allowUserToAttempt(0);
        createToIntegerForStudent();

            }
        }
//        public void generateRandomNumber(){
//            Scanner input = new Scanner(System.in);
//            int randomNumber1 = (int) (Math.random() * 12 + 1);
//            int randomNumber2 = (int) (Math.random() * 12 + 1);
//            System.out.println(randomNumber1 + " times " + randomNumber2);
//
//        }



