package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void correlateRelationshipWithIndirectInheritance(){
        Employee dele = new Employee("VI","shomolu","080674598","dele@gmail.com");
        dele.canTrainPeople();
    }
    @Test
    public void checkIfTheSubclassCanCallAMethodFromTheSuperClass(){
        Employee  tolu = new Employee("dele","maryland","08345678","goat.com");
        tolu.canTrainPeople();
        assertEquals("dele",tolu.getName());
    }

}