package ex30.base;

import org.junit.jupiter.api.Test;

import static ex30.base.App.generateResult;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void generateResult_3_5() {
        int c = 3;
        int r = 5;
        String expected = String.format("%4d", c*r);
        String actual = generateResult(c, r);
        assertEquals(expected,actual);
    }

    @Test
    void generateResult_1_1() {
        int c = 1;
        int r = 1;
        String expected = String.format("%4d", c*r);
        String actual = generateResult(c, r);
        assertEquals(expected,actual);
    }

    @Test
    void generateResult_12_12() {
        int c = 12;
        int r = 12;
        String expected = String.format("%4d", c*r);
        String actual = generateResult(c, r);
        assertEquals(expected,actual);
    }
}