package ex28.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void sumX_15() {
        int[] x = {1,2,3,4,5};
        int total = App.sumX(x);
        assertEquals(15, total);
    }

    @Test
    void sumX_0() {
        int[] x = {0,0,0,0,0};
        int total = App.sumX(x);
        assertEquals(0, total);
    }

    @Test
    void sumX_5000() {
        int[] x = {1000,1000,1000,1000,1000};
        int total = App.sumX(x);
        assertEquals(5000, total);
    }
}