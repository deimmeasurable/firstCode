package ChapterFifteen;

public class ReversingAString {

    public static void main(String[] args) {
        String word = "GROOM";
        reservingAString(word);
    }
    public static void reservingAString(String word){
        word=word.toLowerCase();
        StringBuilder collect = new StringBuilder();
        for(int i=word.length()-1; i>=0; i--){
            collect.append(word.charAt(i));

        }
        System.out.println(collect);

    }
}