package ChapterSixteen;

import java.util.*;

public class CountDuplicateWord {

    private int frequency;

    public int checkTheOccurrenceOfDuplicateWord() {
        List<String> list1= new ArrayList<>();
        List<String> list2=new ArrayList<>();
        String[] fruit = {"mango","orange","apple"};
//        list1 = Arrays.asList(fruit);
        
        list2.add("pineapple");
        list2.add("mango");
        list2.add("waterMelon");

        Collections.addAll(list2,fruit);
        for (String totalContent:list2) {
            list1.add(totalContent);
        }
       frequency = Collections.frequency(list2,"mango");
        System.out.printf("total frequency of mango in list: %d%n",frequency);
        
return frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
