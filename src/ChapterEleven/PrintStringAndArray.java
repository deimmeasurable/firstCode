package ChapterEleven;

import java.util.Arrays;

public class PrintStringAndArray {
    String name;
    public static void main(String[] args) {
//        sayHello("name");
    }
    public  String  sayHello(String sentence){
        String value="Hello";
        String[] word = {"name"};
//        name=name.strip();
        name=value+", "+ Arrays.toString(word) +"!";
        System.out.print(name);

        // but you need to return the correct value in order to pass the challenge
        return name; // TODO: return the correct value
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


