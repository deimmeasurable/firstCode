package cohortAssignment;

import java.util.Locale;

public class FindDuplicateValue {
    public static void main(String[] args) {
        getDuplicateValue();
    }
    public static void getDuplicateValue() {
        int count = 0;
       String value = "InterrLoop p";
        value=value.toLowerCase(Locale.ROOT);
        char[] values =value.toCharArray();
        StringBuilder collectValue = new StringBuilder();
        for (int i=0; i  <value.length(); i++) {

            for (int j = i+1; j < value.length(); j++) {
                count++;
                if (values[i]==values[j] ) {
                    collectValue.append(values[j]);
                    System.out.println(collectValue);

//
                   break;
                }

            }


        }

    }
}
