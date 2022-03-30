package ChapterSeventeen;

import java.security.SecureRandom;

public class CollectRandomNumber {

    public static void main(String[] args) {
        CollectRandomNumber collectRandomNumber = new CollectRandomNumber();
        collectRandomNumber.collectValueOfRandomNumber();
    }
    public void collectValueOfRandomNumber() {


        SecureRandom secureRandom = new SecureRandom();
        int total = secureRandom.ints(100,1,25)
                .sum();
        System.out.println(total);
    }
}