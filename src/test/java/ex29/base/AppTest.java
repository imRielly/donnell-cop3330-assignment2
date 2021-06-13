package ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void calculateYears_4_18() {
        App app = new App();
        double rate = 4;
        int years = app.calculateYears(rate);
        assertEquals(18,years);
    }

    @Test
    void calculateYears_1_72() {
        App app = new App();
        double rate = 1;
        int years = app.calculateYears(rate);
        assertEquals(72,years);
    }
}