package chapterEight;

public class Family {
    private Parent name;
    private int numberOfChildren;

    public Family(Parent name, int numberOfChildren) {
        this.name = name;
        this.numberOfChildren = numberOfChildren;
    }

    public Parent getName() {
        return name;
    }

    public void setName(Parent name) {
        this.name = name;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }
}
