package ex32.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void generateWinner_1_1to10() {
        App app = new App();
        int winner = app.generateWinner(1);
        assertTrue(winner > 0 && winner <= 10);
    }

    @Test
    void generateWinner_2_1to100() {
        App app = new App();
        int winner = app.generateWinner(2);
        assertTrue(winner > 0 && winner <= 100);
    }

    @Test
    void generateWinner_3_1to1000() {
        App app = new App();
        int winner = app.generateWinner(3);
        assertTrue(winner > 0 && winner <= 1000);
    }
}