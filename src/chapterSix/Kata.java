package chapterSix;

public class Kata {
    public char calculateGradeFor(int score) {
        if(score >= 90) return 'A';
        if(score>= 80) return 'B';
        if(score>= 70) return 'C';
        if(score>= 60) return 'D';

        return 'F';
    }
    public int calculateCopyFor(int copyNumber) {
        if (copyNumber <=4) return copyNumber * 2000;

        if(copyNumber <=9) return copyNumber * 1800;

        if(copyNumber<= 29) return  copyNumber*1600;
        if(copyNumber <= 49) return copyNumber*1500;
        if(copyNumber <= 99) return copyNumber*1300;
        if(copyNumber <= 199) return copyNumber*1200;
        if(copyNumber <= 499) return copyNumber*1100;
        if(copyNumber >500) return copyNumber*1000;


        return 0;
    }
}
