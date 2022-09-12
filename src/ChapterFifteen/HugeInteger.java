package ChapterFifteen;

public class HugeInteger {
    private String collect;

//    public int getCollect() {
//        return collect;
//    }
//
//    public void setCollect(int collect) {
//        this.collect = collect;
//    }

//    public static void main(String[] args) {
//
//    }

        public int isEqualto (int[] array, String number){
            String[] value =number.trim().split("//+");
            int count=0;
StringBuilder balance = new StringBuilder();
            for (int i = 0; i < array.length; i++) {
             if(!value[i].equals(String.valueOf(array.length))){
                      balance.append(value[i]);
                        count++;


                }
            }
            return count;
        }
    }
