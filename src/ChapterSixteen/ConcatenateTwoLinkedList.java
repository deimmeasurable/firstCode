package ChapterSixteen;

import java.util.LinkedList;

public class ConcatenateTwoLinkedList {
    private String totalList;

    LinkedList<String> list = new LinkedList<>();
    public String getTotalList() {
        return totalList;
    }

    public void setTotalList(String totalList) {
        this.totalList = totalList;
    }

    public String canConcateTwoLinkList() {
//        String[] word = {"girl", "boy", "woman", "man" };

        list.add("lady");
        list.add(0, "tree");
        list.add("goat");



        LinkedList<String> list2 = new LinkedList<>(list);
        list2.add("girls");
        list2.add("boy");


        System.out.println(list2);

        totalList= String.valueOf(list2).trim();
        return totalList;
    }


}