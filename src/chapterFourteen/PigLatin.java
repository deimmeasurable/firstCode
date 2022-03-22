package chapterFourteen;

public class PigLatin {

    public String createPiglatinWord(String word) {
      StringBuilder result = new StringBuilder(word);
      Character character = result.charAt(0);
      result.insert(result.length(),character);
      result.append("ay");
      return result.substring(1);
    }
}
