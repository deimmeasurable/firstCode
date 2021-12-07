package chapterThree;

import java.util.Scanner;

public class CarDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of the car");

        int amount = input.nextInt();
        Car firstCar = new Car("Toyota", "1975", (amount * 0.05));
        System.out.printf("the value of car model is %s%n", firstCar.getModel());
        System.out.printf("The value of year is %s%n", firstCar.getYear());
        System.out.printf("The value of price is %.2f%n", firstCar.getprice());

    System.out.println("Enter the second amount of the car");
    int amount2 = input.nextInt();
        Car secondCar = new Car("Toyota", "1975", (amount2 * 0.07));
        System.out.printf("the value of car model is %s%n", secondCar.getModel());
        System.out.printf("The value of year is %s%n", secondCar.getYear());
        System.out.printf("The value of price is %.2f%n", secondCar.getprice());
    }
    }




