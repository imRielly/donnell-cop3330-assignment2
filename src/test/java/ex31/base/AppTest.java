package ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void calculateBPM_138() {
        App app = new App();
        int actual = app.calculateBPM(55,22,65);
        assertEquals(138, actual);
    }

    @Test
    void calculateBPM_0() {
        App app = new App();
        int actual = app.calculateBPM(1,1,1);
        assertEquals(3, actual);
    }
}