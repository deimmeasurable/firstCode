package ChapterFifteen;

public class MovingAllZeroToTheEndOfArray {
    public static void main(String[] args) {
        int [] value= {0,0,0,5,6,7,8};
        int lengthOaarray =value.length;
        moveTheZerovalueToTheEndOfArray(value,lengthOaarray);
        for(int i=0;i<lengthOaarray;i++){
            System.out.println(value[i]+" ");
        }
    }

    public static void moveTheZerovalueToTheEndOfArray(int [] value, int number){
        int count=0;
        for(int i = 0; i < number; i++){
            if(value[i]!=0){
                value[count++]=value[i];

                while(count<number){
                    value[count++]=0;

                }
            }
        }
    }
}
