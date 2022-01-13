package selfPractise;

public class SumOfSeries {
    public static void main(String[] args) {
        seriesOf1To100();
    }

    public static  void seriesOf1To100(){
        long number;
        int total=0;

        System.out.println("n" + "\tsum");

        for ( number = 1; number <=100 ; number++) {
            total+=number;

            System.out.println(number +"\t"+total);

        }
    }
}
