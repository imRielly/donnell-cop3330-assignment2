package ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void alphabetize_cba_returns_abc() {

        String testString = "cba";
        String alphaTest = App.alphabetize(testString);

        assertEquals("abc",alphaTest);
    }

    @Test
    void alphabetize_brick_returns_bcikr() {

        String testString = "brick";
        String alphaTest = App.alphabetize(testString);

        assertEquals("bcikr",alphaTest);
    }

    @Test
    void isSameLength_123_abc() {

        boolean lenTest = App.isSameLength("123","abc");

        assertTrue(lenTest);
    }

    @Test
    void isSameLength_123_abcd() {

        boolean lenTest = App.isSameLength("123","abcd");

        assertFalse(lenTest);
    }

    @Test
    void isAnagram_gus_ugs() {

        boolean anagramTest = App.isAnagram("gus","gus");

        assertTrue(anagramTest);
    }

    @Test
    void isAnagram_gift_life() {

        boolean anagramTest = App.isAnagram("gift","life");

        assertFalse(anagramTest);
    }

    @Test
    void generateOutput_true() {

        String output = App.generateOutput(true, true, "fact", "caft");
        String expected = "\"fact\" and \"caft\" are anagrams.";

        assertEquals(output, expected);
    }

    @Test
    void generateOutput_false() {

        String output = App.generateOutput(false, true, "abc", "abcd");
        String expected = "\"abc\" and \"abcd\" are not anagrams.";

        assertEquals(output, expected);
    }
}