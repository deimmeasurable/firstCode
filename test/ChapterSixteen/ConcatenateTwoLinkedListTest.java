package ChapterSixteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenateTwoLinkedListTest {
    ConcatenateTwoLinkedList concatenateTwoLinkedList;

    @BeforeEach
    void setUp() {
      concatenateTwoLinkedList =new ConcatenateTwoLinkedList();
    }
    @Test
    void testThatTheConcatenateTwoListIsNotNull(){
        assertNotNull(concatenateTwoLinkedList);
    }
    @Test
    void testThatLinkedListCanConCatenate(){
        //given
        ConcatenateTwoLinkedList concateTwoLink= new ConcatenateTwoLinkedList();
        //when
        concateTwoLink.canConcateTwoLinkList();
        //assert
        assertEquals("[tree, lady, goat, girls, boy]",concateTwoLink.getTotalList());

    }
}