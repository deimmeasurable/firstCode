package cohortAssignment;

import java.util.Locale;

public class ReverseAStringWithoutInbuitFunction {
    public static void main(String[] args) {
        String letter ="gongothan";
        String collectValue="";
        for (int i=letter.length() - 1; i >= 0;i--) {
            collectValue = String.valueOf(letter.charAt(i));

            System.out.print(collectValue.toUpperCase(Locale.ROOT));
        }
    }
}
