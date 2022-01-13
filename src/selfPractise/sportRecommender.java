package selfPractise;

import java.util.Scanner;

public class sportRecommender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weather;

        System.out.println("Enter a number of weather");
        weather = input.nextInt();




            if(weather==20 ||weather ==30){
        System.out.println("It's lovely weather for sport today");

    }
            if(weather ==10||weather==40) {
        System.out.println("It's reasonable weather for sport today");
    }
            else {
                System.out.println("Please exercise with care today, watch out for the weather!");
    }

}
    }

