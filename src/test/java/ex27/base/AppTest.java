package ex27.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void validateInput_noErrors() {
        App app = new App();
        String output = app.validateInput("Rielly", "Donnell", "34736", "TK-4321");
        assertEquals("There are no errors.", output);
    }

    @Test
    void validateInput_allErrors() {
        App app = new App();
        String output = app.validateInput("", "", "1234567", "12345");
        assertEquals("The first name must be filled in.\nThe first name must be at least 2 characters long.\nThe last name must be filled in.\nThe last name must be at least 2 characters long.\nThe employee ID must be in the format of AA-1234.\nThe zipcode must be a 5 digit number.", output);
    }

    @Test
    void entered_JoeMomma_true() {
        App app = new App();
        String input = "Joe Momma";
        assertTrue(app.entered(input));
    }

    @Test
    void entered_false() {
        App app = new App();
        String input = "";
        assertFalse(app.entered(input));
    }

    @Test
    void twoMore_12_true() {
        App app = new App();
        String input = "12";
        assertTrue(app.twoMore(input));
    }

    @Test
    void twoMore_1_false() {
        App app = new App();
        String input = "1";
        assertFalse(app.twoMore(input));
    }

    @Test
    void eIDFormat_TK1234_true() {
        App app = new App();
        String input = "TK-1234";
        assertTrue(app.eIDFormat(input));
    }

    @Test
    void eIDFormat_TK1234_false() {
        App app = new App();
        String input = "TK1234";
        assertFalse(app.eIDFormat(input));
    }

    @Test
    void zip_12345_true() {
        App app = new App();
        String input = "12345";
        assertTrue(app.zip(input));
    }

    @Test
    void zip_123456_false() {
        App app = new App();
        String input = "123456";
        assertFalse(app.zip(input));
    }

    @Test
    void zip_1234A_false() {
        App app = new App();
        String input = "1234A";
        assertFalse(app.zip(input));
    }
}