package selfPractise;

import java.util.Scanner;

public class ParkingCharge {
    public static void main(String[] args) {
        ParkingCharge charge = new ParkingCharge();
        charge.calculateCharges();
      //  System.out.println("The total garageCharges is %d " +total);
    }

    public void calculateCharges() {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        double garageCharge = 0.00;
        double total = 0;
        double extraCharge = 0.50;
        double maximum = 10.00;
        int hour;
        while (true) {
            System.out.println("Enter an hour");
            hour = input.nextInt();


            // whenHourIsMoreThan24(hour);
            if (hour > 0 && hour <= 3) {
                garageCharge = 2.00;
                System.out.println(garageCharge);


            } else if (hour > 3 && hour <= 23) {
                garageCharge = (hour - 3) * extraCharge;
                System.out.println(garageCharge);

            }
            if (hour == 24) {
                garageCharge = maximum;
                System.out.println(garageCharge);
            }

            total += garageCharge;
            counter++;

            System.out.printf("The total garageCharges is  %2f", total);
        }
    }

    private void whenHourIsMoreThan24(int hour) {
        boolean validateHour = hour == -1 || hour > 24;
        if (validateHour) {
            throw new IllegalArgumentException("hour is not valid");
        }
    }

}

