public class Array {
    public static void main(String[] args) {
////        int[] value = new int[10];
////        value = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
////        System.out.println(value[0]);
////        for(int number=0; number< value.length;++number){
////            System.out.println(value[number]);
////        }
        String[] namesOfFriend = new String[5];
        namesOfFriend = new String[]{"Ade", "Shola", "dayo", "tope", "yinka"};
        System.out.println(namesOfFriend[0]);
        for (int name = 0; name < namesOfFriend.length; ++name) {
            System.out.println(namesOfFriend[name]);
        }
    }

}

