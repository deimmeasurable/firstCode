package ChapterSixteen;

import java.util.*;

public class DuplicateElimination {
    List<String>list =new ArrayList<>();
    public List<String> collectedFirstName(String firstName){
//        List<String>list =new ArrayList<>();
        list.add(firstName);
        return list;
    }
    public int count(){
        return list.size();
    }

    public void checkThatNoDuplicateNames(String name) {
        Set<String> duplicateFirstName =new HashSet<>();
        for (int i = 0; i < list.size() ; i++) {
            if( list.get(i).toLowerCase(Locale.ROOT).contains(name)) {
              list.remove(name);
            }
        }
    }
}
