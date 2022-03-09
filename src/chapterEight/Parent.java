package chapterEight;

public class Parent {
    private String name;
    private Child hisChild;

    public Parent(String name, Child hisChild) {
        this.name = name;
        this.hisChild = hisChild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child getHisChild() {
        return hisChild;
    }

    public void setHisChild(Child hisChild) {
        this.hisChild = hisChild;
    }
}
