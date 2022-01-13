package selfPractise;

import java.util.Scanner;

public class ParkingCharge {
    public static void main(String[] args) {
        ParkingCharge charge=new ParkingCharge();
        charge.calculateCharges();
    }

    public  void calculateCharges(){
        Scanner input = new Scanner(System.in);
        int counter=1;
        double garageCharge=0.00;
        int total=0;
        double extraCharge=0.50;
        double maximum=10.00;
        int hour;
        while (true){
            System.out.println("Enter an hour");
            hour= input.nextInt();

            if(hour==-1 || hour>24){
                break;
            }

            if(hour>0 && hour<=3){
                 garageCharge=2.00;
                System.out.println(garageCharge);
            }else if (hour>3&&hour<=23){
                 garageCharge=(hour-3)* extraCharge;
                System.out.println(garageCharge);

            }
            if(hour==24){
                  garageCharge=maximum;
                System.out.println(garageCharge);
            }

            total+=garageCharge;
            counter++;
        }
        System.out.println("The total garageCharges is "+total);
    }
    }

