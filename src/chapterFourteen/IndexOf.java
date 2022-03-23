package chapterFourteen;

import java.util.Locale;
import java.util.Scanner;

public class IndexOf {

    private String string;

    public IndexOf(String string) {
        this.string = string;
    }
    public  int  _getTheIndexValueOfTheWord(char word ){
        int positionOfIndex=0;
        StringBuilder value = new StringBuilder();
        for (int i = 0; i < string.length()-1; i++) {
            if(string.charAt(i)==word){
                System.out.println(i);
                value.append(i);
               return i;


            }

        }
        return positionOfIndex;

    }
    public int createACountMethodInString(char character){
        int count=0;
        for (int i = 0; i <string.length() ; i++) {
            if(string.charAt(i)==character){
                count++;
            }


        }
        return count;
    }
    public int getLastIndexOfWord(char character){
     int   indexOfLastValue= -1;
        for (int i = 0; i <string.length() ; i++) {
            if(string.charAt(i)==character){
                indexOfLastValue=i;
            }
        }
        return indexOfLastValue;
    }
    public void capitaliseEveryFirstWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scanner.nextLine();

//        String word=" ";
        StringBuilder text = new StringBuilder();
        for (int i = 0; i <word.length() ; i++) {
            if(word.charAt(i)==' ') {
                String.valueOf(word.charAt(0)).equals(word.toUpperCase(Locale.ROOT));

            }
        }
        System.out.print(text);
        text.append(word);
//        return text;
    }

    public static void main(String[] args) {
        IndexOf indexValue = new IndexOf("helen");
//        indexValue._getTheIndexValueOfTheWord('e');
//        System.out.println(indexValue.getLastIndexOfWord('n'));
//        System.out.println(indexValue.createACountMethodInString('e'));
//        System.out.println("".matches("[A-Za-z]*"));
//        System.out.println("".replaceFirst("//d","eight"));
         indexValue.capitaliseEveryFirstWord();
    }

}
