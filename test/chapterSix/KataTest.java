package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void AGradeCanBeCalculatedTest() {
        Kata grade = new Kata();
        char result = grade.calculateGradeFor(98);
        assertEquals('A', result);
    }

    @Test
    public void bGradeCanBeCalculatedTest() {
        Kata grade = new Kata();
        char result = grade.calculateGradeFor(89);
        assertEquals('B', result);
    }

    @Test
    public void cGradeCanBeCalculatedTest() {
        Kata grade = new Kata();
        char myResult = grade.calculateGradeFor(79);
        assertEquals('C', myResult);
    }

    @Test
    public void dGradeCanBeCalculatedTest() {
        Kata grade = new Kata();
        char result = grade.calculateGradeFor(65);
        assertEquals('D', result);
    }

    @Test
    public void fGradeCanBeCalculatedTest() {
        Kata grade = new Kata();
        char result = grade.calculateGradeFor(40);
        assertEquals('F', result);
    }

    @Test
    public void for4CalculateCopy() {
        Kata value = new Kata();
        int copyNumber = 3;
        int result = value.calculateCopyFor(copyNumber);
        assertEquals(copyNumber * 2000, result);
    }

    @Test
    public void for9CalculateCopy() {
        Kata value = new Kata();
        int copyNumber = 8;
        int price = value.calculateCopyFor(copyNumber);
        assertEquals(copyNumber * 1800, price);
    }

    @Test
    public void for29CalculateCopy() {
        Kata value = new Kata();
        int copyNumber = 20;
        int price = value.calculateCopyFor(copyNumber);
        assertEquals(copyNumber * 1600, price);
    }

    @Test
    public void for49CalculateCopy() {
        Kata value = new Kata();
        int copyNumber = 48;
        int price = value.calculateCopyFor(copyNumber);
        assertEquals(copyNumber * 1500, price);
    }

    @Test
    public void for99CalculateCopy() {
        Kata value = new Kata();
        int copyNumber = 89;
        int price = value.calculateCopyFor(copyNumber);
        assertEquals(copyNumber * 1300, price);

    }

    @Test
    public void for199CalculateCopy() {
        Kata value = new Kata();
        int copyNumber = 100;
        int price = value.calculateCopyFor(copyNumber);
        assertEquals(copyNumber * 1200, price);
    }

    @Test
    public void for499CalculateCopy() {
        Kata value = new Kata();
        int copyNumber = 300;
        int price = value.calculateCopyFor(copyNumber);
        assertEquals(copyNumber * 1100, price);
    }

    @Test
    public void for500CalculateCopy() {
        Kata value = new Kata();
        int copyNumber = 520;
        int price = value.calculateCopyFor(copyNumber);
        assertEquals(copyNumber * 1000, price);
    }
}