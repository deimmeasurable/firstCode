package ChapterSixteen;

import java.util.*;

public class DuplicateElimination {
//    List<String>list =new ArrayList<>();
    Set<String> newSet=new HashSet<>();
    public Set<String> collectedFirstName(String firstName){
//        List<String>list =new ArrayList<>();
        newSet.add(firstName);
        return newSet;
    }
    public int count(){
        return newSet.size();
    }

//    public void checkThatNoDuplicateNames(String name) {
//        name=name.toLowerCase(Locale.ROOT);
//
//        for (int i = 0; i < newSet.size() ; i++) {
//            if( newSet.(name)) {
//              list.remove(name);
//            }
//        }
//    }
}
