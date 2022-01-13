package chapterSeven;

public class SevenSegmentDisplay {
    public static void main(String[] args) {
//        System.out.println(segmentArray[0].length);
        String myInput = "11100001";
        computeShape(myInput);
    }



    private static String[][] segmentArray = new String[11][4];


    public static boolean is_on(String input){
        return input.endsWith("1");
    }

    private static boolean shouldFill(String input, int index){
        if (index >= input.length() || index < 0){
            throw new IllegalArgumentException("Index cannot be less than Zero, equal or greater than input length");
        }
        String value = input.substring(index, index + 1);
        return value.equals("1");
    }

    public static void fillHorizontalSegments(boolean shouldFill, String segment){
        if((segment.length() > 1) || (!segment.equals("A") && !segment.equals("G") && !segment.equals("D"))){
            throw new IllegalArgumentException("Can only process segments A, D or G");
        }
        int startIndex = 0;
        int endIndex = 0;
        switch (segment){
            case "A":
                startIndex = 0;
                endIndex = 1;
                break;
            case "G":
                startIndex = 5;
                endIndex = 6;
                break;
            case "D":
                startIndex = 10;
                endIndex = 11;
                break;
        }

        if (shouldFill){
            for(int row = startIndex; row < endIndex; row++){
                for(int column = 0; column < segmentArray[row].length; column++){
                    segmentArray[row][column] = "#";
                }
            }
        }
    }

    public static void fillRightVerticalSegment(boolean shouldFill, String segment){
        if((segment.length() > 1) || (!segment.equals("B") && !segment.equals("C"))){
            throw new IllegalArgumentException("Can only process segments B or C");
        }
        
        int startIndex = segment.equals("B") ? 1 : 6;
        int endIndex = segment.equals("B") ? 5 : 10;
        
        if(shouldFill){
            for(int row = startIndex; row <= endIndex; row++){
                for(int column = segmentArray[row].length - 1; column < segmentArray[row].length; column++){
                    segmentArray[row][column] = "#";
                }
            }
        }
    }

    public static void fillLeftVerticalSegment(boolean shouldFill, String segment){
        if((segment.length() > 1) || (!segment.equals("E") && !segment.equals("F"))){
            throw new IllegalArgumentException("Can only process segments E or F");
        }

        int startIndex = segment.equals("E") ? 1 : 6;
        int endIndex = segment.equals("E") ? 5 : 10;

        if(shouldFill){
            for(int row = startIndex; row <= endIndex; row++){
                for(int column = 0; column < 1; column++){
                    segmentArray[row][column] = "#";
                }
            }
        }

    }

    public static void computeShape(String input){
        boolean on = is_on(input);
        if(on){
            System.out.println("Yes we are on");
            fillHorizontalSegments(shouldFill(input, 0), "A");
            fillRightVerticalSegment(shouldFill(input, 1), "B");
            fillRightVerticalSegment(shouldFill(input, 2), "C");
            fillHorizontalSegments(shouldFill(input, 3), "D");
            fillLeftVerticalSegment(shouldFill(input, 4), "E");
            fillLeftVerticalSegment(shouldFill(input, 5), "F");
            fillHorizontalSegments(shouldFill(input, 6), "G");
            displayShape();
        }else {
            System.out.println("Display is off.....");
        }

    }


    public static void displayShape(){
        for(int i = 0; i < segmentArray.length; i++){
            for(int j = 0; j < segmentArray[i].length; j++){
                if (segmentArray[i][j] != null) {
                    System.out.print(segmentArray[i][j]);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }




//    public static String displayA(){
//
//        String[][] arrayA=new String[][]{{"1","1","1","1","1"},{"1","1","1","1"}};
//
//        arrayA= new String[][]{{"#","#","#","#","#"},{"#","#","#","#"}};
//        for (int row = 0; row <arrayA.length ; row++) {
//            for (int column = 0; column < arrayA[row].length; column++) {
//                String userInput = null;
//               if (userInput == "1111"){
//                    return displayA();
//                }
//                System.out.print(arrayA[row][column]);
//
//
//            }
//            System.out.println(" ");
//
//
//        }
//        System.out.println(" ");
//        return "";
//    }
}
