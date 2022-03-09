package ChapterTen.MypersBriggs;

public enum PersonalityTrait {
    EXTROVERT("E"),
    INTROVERT("I"),
    SENSITIVE ("S"),
    PERCEPTIVE ("P"),
    THINKING("T"),
    JUDGING ("J"),
    INITUITIVE("I"),
    FEELING("F");

    private String trait;

    PersonalityTrait(String trait) {
        this.trait=trait;
    }
    public String getTrait(){
        return trait;
    }

}
