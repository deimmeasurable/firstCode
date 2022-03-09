package ChapterTen.MypersBriggs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyersBriggsTraitsTest {
    MyersBriggsTraits traits;

    @BeforeEach
    public void Setup() {
        traits = new MyersBriggsTraits();
    }


    @Test
    public void userIsAnIntrovertOrExtrovert() {
        PersonalityTrait personalityTrait = traits.IsIntrovertOrExtrovert(new String[]{"B", "B", "A", "B", "B", "A", "B", "B", "B", "B",
                "B", "A", "B", "B", "B", "A", "B", "A", "A", "B"});
        assertEquals(PersonalityTrait.EXTROVERT, personalityTrait);
    }

    @Test
    public void userIsSensingOrIntuitive() {
        PersonalityTrait personalityTrait = traits.IsSensingOrIntuitive(new String[]{"B", "A", "A", "B", "B", "A", "B", "B", "B", "A",
                "B", "A", "B", "A", "B", "A", "B", "A", "A", "B"});
        assertEquals(PersonalityTrait.SENSITIVE, personalityTrait);

    }

    @Test
    public void userIsThinkingOrFeeling() {
        PersonalityTrait personalityTrait = traits.IsThinkingOrFeeling(new String[]{"B", "A", "A", "B", "B", "A", "B", "B", "B", "A",
                "B", "A", "B", "A", "B", "A", "B", "A", "A", "B"});
        assertEquals(PersonalityTrait.FEELING, personalityTrait);
    }
    @Test
    public  void userIsJudgingOrPerception(){
        PersonalityTrait personalityTrait = traits.IsJudgingOrPerception(new String[]{"B", "A", "A", "B",
                "A", "A", "B", "A",
                "A", "A", "A", "A",
                "A", "A", "A", "A",
                "A", "A", "A", "A"});
        assertEquals(PersonalityTrait.PERCEPTIVE, personalityTrait);
    }

    }
