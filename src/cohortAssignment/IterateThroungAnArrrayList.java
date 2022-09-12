package cohortAssignment;

import java.util.ArrayList;

public class IterateThroungAnArrrayList {
    public static void main(String[] args) {
        ArrayList<String> value = new ArrayList<>();
        String word="ferdinand";
        word=word.toUpperCase();
        value.add(word);
        for(String collect :value){
            System.out.println(collect);
        }

        }
    }

