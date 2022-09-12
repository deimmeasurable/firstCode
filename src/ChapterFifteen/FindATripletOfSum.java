package ChapterFifteen;

public class FindATripletOfSum {
    public static void main(String[] args) {
        int number[]={1,4,45,6,10,8};
        int sum=24;
        int arry_size=number.length;

        findingTheTripletOfSum(number,arry_size,sum);
    }
        public static boolean  findingTheTripletOfSum(int [] number,int arry_size,int sum ){
            for(int i=0; i<arry_size-2;i++){

                for(int j=i+1;j<arry_size-1; j++){
                    for(int k=j+1;k<arry_size;k++){
                        if(number[i]+ number[j] +number[k]==sum){
                            System.out.println(number[i]);
                            System.out.println(number[j]);
                            System.out.println(number[k]);
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }


