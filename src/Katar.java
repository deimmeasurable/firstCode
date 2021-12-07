public class Katar {
    private String accountName;
    public static String gradeScore(int score) {

        String grade = "";

        if (score >= 90)
            if (score == 100)
                grade = "A";

        if (score >= 80)
            if (score < 90)
                grade = "B";


        if (score >= 70)
            if (score < 80)
                grade = "C";


        if (score >= 60)
            if (score < 70)
                grade = "D";

        if (score >= 50)
            if (score < 60)
                grade = "E";

        if (score >= 30)
            if (score < 40)
                grade = "F";

        if (score > 100)
            grade = "no score";

        if (score == 0)
            grade = "no grade";


        return grade;
    }

    public void setstudentName(String name) {
        String studentName = name;
    }

    public String getstudentName(){
        return getstudentName();

    }
}







