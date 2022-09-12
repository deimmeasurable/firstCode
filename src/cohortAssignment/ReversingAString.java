package cohortAssignment;

public class ReversingAString {
    public static void main(String[] args) {
        String word = "Cohort_nine";
        String [ ] actualValue = word.split("//+");

StringBuilder value = new StringBuilder();
        for(int i = 0; i <= actualValue.length-1; i++){
            value.append(actualValue[i]);
            value.reverse();

        }
       System.out.print(value);
    }

}
