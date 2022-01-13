package chapterSeven;


public class OmissionOfNumber {
    int[] numbers = {1,2,3,4,5};

    public int total(){
        int result =0;
        for(int value: numbers){
            result =result + value;

        }
        return result;
    }
    public int maxOneLess(){
        int maximum =numbers[0];
        for (int i =0; i< numbers.length; i++){
            if (numbers[i] > maximum);
            maximum = numbers[i];
            }
        return maximum;
        }
        public int minOneLess(){
        int min = numbers[0];
        for (int i=0; i< numbers.length; i++){
            if(numbers[1] < min);
            min = numbers[i];
        }
        return min;
    }

    public static void main(String[] args) {
        OmissionOfNumber scores = new OmissionOfNumber();

        int maximum = scores.maxOneLess();
        int minimum = scores.minOneLess();
        int total = scores.total();

        if ( maximum<total){
            maximum = total;
            System.out.println("the value of the maximum is:"+maximum);
        }
        if (minimum>total){
            minimum = total - minimum;
        }
        minimum = total - minimum;
        System.out.println("the value of minimum is:"+minimum);

    }
}

