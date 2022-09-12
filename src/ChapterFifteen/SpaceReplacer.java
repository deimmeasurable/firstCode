package ChapterFifteen;

public class SpaceReplacer {

    public static String replaceString(String word){
       return  word.strip().replaceAll(" ", "%");
    }

}
