package selfPractise;

import chapterSeven.Array;

import java.util.Arrays;

public class SevenDigitNumber {
    public static void main(String[] args) {
        String[][] SevenDigitNumber = {{"1", "2", "3", "4", "5"}, {"1", "2", "3", "4"}};
        //     displayNumberFor0(SevenDigitNumber);
        // displayNumberFor1(SevenDigitNumber);
        // displayNumberFor2(SevenDigitNumber);
        //displayNumberFor3(SevenDigitNumber);
        // displayNumberFor4(SevenDigitNumber);
        //displayNumberFor5(SevenDigitNumber);
        displayNumberFor6(SevenDigitNumber);
        displayNumberFor7(SevenDigitNumber);
    }


    public static void displayNumberFor0(String[][] SevenDigitNumber) {
        //prompt the user to 8 digits (zeros and one only, and should always end with '1')
        // if the user typed "11111101" the display should return the below (0)

        SevenDigitNumber = new String[][]{{" # ", " # ", " # ", " # "},
                                          {" # ", "   ", "   ", " # "},
                                          {" # ", "   ", "   ", " # "},
                                          {" # ", "   ", "   ", " # "},
                                          {" # ", " # ", " # ", " # "}};
        for (int row = 0; row < SevenDigitNumber.length; row++) {
            for (int column = 0; column < SevenDigitNumber[row].length; column++) {
                System.out.print(SevenDigitNumber[row][column]);

            }
            System.out.println("  ");
        }
        System.out.println("  ");

    }

    public static void displayNumberFor1(String[][] SevenDigitNumber) {
        //prompt the user to 8 digits (zeros and one only, and should always end with '1')
        // if the user typed "11111101" the display should return the below (0)

        SevenDigitNumber = new String[][]{{" ", " ", " ", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"}};
        for (int row = 0; row < SevenDigitNumber.length; row++) {
            for (int column = 0; column < SevenDigitNumber[row].length; column++) {
                System.out.print(SevenDigitNumber[row][column]);

            }
            System.out.println("  ");
        }
        System.out.println("  ");

    }

    public static void displayNumberFor2(String[][] SevenDigitNumber) {
        //prompt the user to 8 digits (zeros and one only, and should always end with '1')
        // if the user typed "11111101" the display should return the below (0)

        SevenDigitNumber = new String[][]{{"#", " # ", " # ", " #"},
                {" ", "   ", "   ", " #"},
                {"#", " # ", " # ", " #"},
                {"#", "   ", "   ", "  "},
                {"#", " # ", " # ", " #"}};
        for (int row = 0; row < SevenDigitNumber.length; row++) {
            for (int column = 0; column < SevenDigitNumber[row].length; column++) {
                System.out.print(SevenDigitNumber[row][column]);

            }
            System.out.println("  ");
        }
        System.out.println("  ");
    }

    public static void displayNumberFor3(String[][] SevenDigitNumber) {
        //prompt the user to 8 digits (zeros and one only, and should always end with '1')
        // if the user typed "11111101" the display should return the below (0)

        SevenDigitNumber = new String[][]{{"#", " # ", " # ", " #"},
                {" ", "   ", "   ", " #"},
                {"#", " # ", " # ", " #"},
                {" ", "   ", "   ", " #"},
                {"#", " # ", " # ", " #"}};
        for (int row = 0; row < SevenDigitNumber.length; row++) {
            for (int column = 0; column < SevenDigitNumber[row].length; column++) {
                System.out.print(SevenDigitNumber[row][column]);

            }
            System.out.println("  ");
        }
        System.out.println("  ");
    }

    public static void displayNumberFor4(String[][] SevenDigitNumber) {
        //prompt the user to 8 digits (zeros and one only, and should always end with '1')
        // if the user typed "11111101" the display should return the below (0)

        SevenDigitNumber = new String[][]{{"# ", "   ", " # ", "  "},
                {"# ", "   ", " # ", "  "},
                {"# ", " # ", " # ", " #"},
                {"  ", "   ", " # ", "  "},
                {"  ", "   ", " # ", "  "}};
        for (int row = 0; row < SevenDigitNumber.length; row++) {
            for (int column = 0; column < SevenDigitNumber[row].length; column++) {
                System.out.print(SevenDigitNumber[row][column]);

            }
            System.out.println("  ");
        }
        System.out.println("  ");
    }

    public static void displayNumberFor5(String[][] SevenDigitNumber) {
        //prompt the user to 8 digits (zeros and one only, and should always end with '1')
        // if the user typed "11111101" the display should return the below (0)

        SevenDigitNumber = new String[][]{{"#", " # ", " # ", " #"},
                {"# ", "   ", "   ", "  "},
                {"#", " # ", " # ", " #"},
                {" ", "   ", "   ", " #"},
                {"#", " # ", " # ", " #"}};
        for (int row = 0; row < SevenDigitNumber.length; row++) {
            for (int column = 0; column < SevenDigitNumber[row].length; column++) {
                System.out.print(SevenDigitNumber[row][column]);

            }
            System.out.println("  ");
        }
        System.out.println("  ");
    }

    public static void displayNumberFor6(String[][] SevenDigitNumber) {
        //prompt the user to 8 digits (zeros and one only, and should always end with '1')
        // if the user typed "11111101" the display should return the below (0)

        SevenDigitNumber = new String[][]{{"#", " # ", " # ", " #"},
                {"# ", "   ", "   ", "  "},
                {"#", " # ", " # ", " #"},
                {"#", "   ", "   ", " #"},
                {"#", " # ", " # ", " #"}};
        for (int row = 0; row < SevenDigitNumber.length; row++) {
            for (int column = 0; column < SevenDigitNumber[row].length; column++) {
                System.out.print(SevenDigitNumber[row][column]);

            }
            System.out.println("  ");
        }
        System.out.println("  ");
    }

    public static void displayNumberFor7(String[][] SevenDigitNumber) {
        //prompt the user to 8 digits (zeros and one only, and should always end with '1')
        // if the user typed "11111101" the display should return the below (0)

        SevenDigitNumber = new String[][]{{"#", " # ", " # ", "  #"},
                                          {" ", "   ", "   ", "  #"},
                                          {" ", "  ", "  ", "    #"},
                                          {" ", "   ", "   ", "  #"},
                                          {" ", "   ", "   ", "  #"}};
        for (int row = 0; row < SevenDigitNumber.length; row++) {
            for (int column = 0; column < SevenDigitNumber[row].length; column++) {
                System.out.print(SevenDigitNumber[row][column]);

            }
            System.out.println("  ");
        }
        System.out.println("  ");
    }
}