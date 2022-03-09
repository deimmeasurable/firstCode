package ChapterTen;

public class MyersBriggsPersonality {
    private String[] questions = new String[20];
    private String user;


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        user = ("funke");

        this.user = user;
    }

    public boolean asAUser() {
        return true;
    }

    public void canAttemptQuestion() {
    }

    public String[] canDisplayQuestionToUser( String[] questionaire) {
        if(getUser().equals("funke")){
            for (int i = 0; i < questions.length; i++) {
                questions[i] =questionaire[i];


            }
        }
        return questions;
    }

}
