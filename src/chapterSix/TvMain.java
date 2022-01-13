package chapterSix;

import java.util.Scanner;

public class TvMain {
    private int channel;
    private int volume;
    private int colour;

    public static void main(String[] args) {
        userInput();
    }


    private static void userInput() {
        String prompt = """
                press 1 to on the Tv(inifix)
                press 2 to turn of the tv
                                
                """;
        System.out.println(prompt);
        System.out.println("enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number == 1) {
            System.out.println();
            turnOnTheTV();
        }
        if (number == 2) {
            System.out.println();
            turnOffTheTv();

        }
        System.exit(0);
    }

    private static void turnOffTheTv() {
        Scanner input = new Scanner(System.in);
        System.out.println("Your Tv is off");
    }


    private static void turnOnTheTV() {
        Scanner input = new Scanner(System.in);
        System.out.println("The Tv is on");
        String prompt2 = """
                press 1 To select  channel
                press 2 To select volume 
                press 3 To select brightness 
                """;
        System.out.println(prompt2);
        System.out.println("");
        System.out.println("Enter a number");
        Scanner userPress = new Scanner(System.in);
        int number = userPress.nextInt();
        if (number == 1) {
            System.out.println();
            clickChannel();


        }if(number ==2){
            System.out.println();
            selectVolume();
        }else if (number==3){
            System.out.println();
            setBrightness(1);
        }

    }

    private static int setBrightness(int userinput) {
        for (int brightness=1;brightness<=15;brightness++){
            System.out.println(brightness);
            if(userinput > -1 && userinput<=15);
            return userinput;
        }
        return 15;
    }

    private static int selectVolume() {
        Scanner input = new Scanner(System.in);
        System.out.println("volume display on screen");
        String setVolume = """
                press 1 to increase Volume 
                press 2 to decrease Volume
                """;
        System.out.println(setVolume);
        System.out.println("");
        System.out.println("Enter a number");
        Scanner userChoice = new Scanner(System.in);
        int number = userChoice.nextInt();
        if (number ==1){
            System.out.println();
            increaseVolume();
        }else if (number ==2){
            int volume=0;
            if(volume > -1){
                return volume;
            }

        }
        return number;
    }

    private static int increaseVolume() {
        int volume=0;
        if (volume > -1 && volume<=20) {
            return volume;
        }

        return 20;
    }

    private static int clickChannel() {
        Scanner input = new Scanner(System.in);
        System.out.println("Channel is display");
        String increaseChannel = """
                press 1 To change channels
                press 2 To select Av
                """;
        System.out.println(increaseChannel);
        Scanner userSelect = new Scanner(System.in);
        System.out.println("enter a number");
        int selection = userSelect.nextInt();
        if (selection == 1){
            System.out.println();

        for (selection = 1; selection <= 30; selection++) {

            System.out.println(selection);
            if(selection > -1 && selection <= 30);
            return selection;
        }

    }else if (selection ==2){
            System.out.println();
            SelectToAv();
        }

        return selection;
    }

    private static void SelectToAv() {
        Scanner input = new Scanner(System.in);
        System.out.println("Av is display");
    }


}


