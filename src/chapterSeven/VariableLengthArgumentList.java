package chapterSeven;

public class VariableLengthArgumentList {
    public static void main(String[] args) {
        calculateAverageNumberOfSeries();
    }

    public static void calculateAverageNumberOfSeries() {
        int[] numberSeries = {1, 2, 3, 4, 5, 6, 7};
        int sum=0;
        double average=0.0;

        for (int i = 0; i <numberSeries.length ; i++) {
            sum += numberSeries[i];
             average= sum  / numberSeries.length;
        }
        System.out.println("The average value is: "+average);
        System.out.println("The  sum numberSeries is: "+sum);
    }
}