package ex35.base;

import org.junit.jupiter.api.Test;

import static ex35.base.App.*;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getWinner_0() {
        int winner = getWinner(1);
        assertTrue(winner >= 0 && winner < 1);
    }

    @Test
    void getWinner_10() {
        int winner = getWinner(10);
        assertTrue(winner >= 0 && winner < 10);
    }

    @Test
    void getWinner_100() {
        int winner = getWinner(100);
        assertTrue(winner >= 0 && winner < 100);
    }

    @Test
    void getWinner_1000() {
        int winner = getWinner(1000);
        assertTrue(winner >= 0 && winner < 1000);
    }
}