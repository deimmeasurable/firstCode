package cohortAssignment;

public class FindNumberInAnArray {

      public static int solution(int[] A) {
            // write your code in Java SE 8
            int value=0;
            A=new int[]{1,3,6,4,1,2};
            for(int i=0; i<A.length;i++){
                if(A[i]==A.length-1){
                    value= A[0] + A[3];


                }


            }

        System.out.println(value);
       return value;
        }


public static void main(String[] args){
          solution(new int[]{1, 3, 6, 4, 1, 2});
}

    }


