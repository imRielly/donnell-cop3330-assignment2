package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void passwordValidator_Password123_2() {
        String password = "Password123";
        assertEquals(2,App.passwordValidator(password));
    }

    @Test
    void passwordValidator_Password123s_3() {
        String password = "Password123!";
        assertEquals(3,App.passwordValidator(password));
    }

    @Test
    void hasLetter_123abc_true() {
        boolean hasLetter = App.hasLetter("123abc");

        assertTrue(hasLetter);
    }

    @Test
    void hasLetter_123_false() {
        boolean hasLetter = App.hasLetter("123");

        assertFalse(hasLetter);
    }

    @Test
    void hasNumber_123_true() {
        boolean hasNumber = App.hasNumber("123");
        assertTrue(hasNumber);
    }

    @Test
    void hasNumber_abc_false() {
        boolean hasNumber = App.hasNumber("abc");
        assertFalse(hasNumber);
    }

    @Test
    void has8_true() {
        boolean has8 = App.has8("12345678");
        assertTrue(has8);
    }

    @Test
    void has8_false() {
        boolean has8 = App.has8("1234");
        assertFalse(has8);
    }

    @Test
    void hasSymbol_true() {
        boolean hasSymbol = App.hasSymbol("abc!@#$%^&*()");
        assertTrue(hasSymbol);
    }

    @Test
    void hasSymbol_false() {
        boolean hasSymbol = App.hasSymbol("abc123");
        assertFalse(hasSymbol);
    }

    @Test
    void getOutput_Password123s_3() {
        String password = "Password123!";
        int str = 3;
        String output = App.getOutput(password, str);
        assertEquals("The password 'Password123!' is a very strong password.",output);
    }

    @Test
    void getOutput_123_0() {
        String password = "123";
        int str = 0;
        String output = App.getOutput(password, str);
        assertEquals("The password '123' is a very weak password.",output);
    }
}