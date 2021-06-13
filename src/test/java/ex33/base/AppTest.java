package ex33.base;

import org.junit.jupiter.api.Test;

import static ex33.base.App.*;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void random_run1() {
        int random = random();
        assertTrue(random > 0 && random < 5);
    }

    @Test
    void random_run2() {
        int random = random();
        assertTrue(random > 0 && random < 5);
    }

    @Test
    void random_run3() {
        int random = random();
        assertTrue(random > 0 && random < 5);
    }

    @Test
    void getAnswer_1() {
        String answer = getAnswer(1);
        assertEquals("Yes", answer);
    }

    @Test
    void getAnswer_2() {
        String answer = getAnswer(2);
        assertEquals("No", answer);
    }

    @Test
    void getAnswer_3() {
        String answer = getAnswer(3);
        assertEquals("Maybe", answer);
    }

    @Test
    void getAnswer_4() {
        String answer = getAnswer(4);
        assertEquals("Ask again later.", answer);
    }
}