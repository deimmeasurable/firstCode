package selfPractise;

import java.util.Scanner;

public class Gas_Millage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int millage = 0;
        int gallonsPerTrip = 0;
        float TotalMilesPerGallon = 0;
        float millagePerTrip;
        int counter = 0;


//        System.out.println("enter a miles or -1 to quit");
//        millage = scan.nextInt();


        while ((millage != -1) && (gallonsPerTrip != -1)) {

            System.out.println("enter a miles or -1 to quit");

            millage = scan.nextInt();


            System.out.println("enter a gallons or -1 to quit");

            gallonsPerTrip = scan.nextInt();


            millagePerTrip = (float) (millage * 1.0 / gallonsPerTrip);

            System.out.printf("the value of mile per trip is %d is %.2f\n", counter, millagePerTrip);

            TotalMilesPerGallon += millagePerTrip;
            counter++;


            }
            System.out.printf("the total mile for each trip is %.2f \n", TotalMilesPerGallon);
        }
    }

