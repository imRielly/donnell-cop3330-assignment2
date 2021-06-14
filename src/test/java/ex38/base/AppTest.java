package ex38.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static ex38.base.App.filterEvenNumbers;
import static ex38.base.App.generateOutput;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void generateOutput_2468() {
        var list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        String actual = generateOutput(list);
        assertEquals("The even numbers are 2 4 6 8.", actual);
    }

    @Test
    void generateOutput_2222() {
        var list = new ArrayList<Integer>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        String actual = generateOutput(list);
        assertEquals("The even numbers are 2 2 2 2.", actual);
    }

    @Test
    void filterEvenNumbers_123456789() {
        String[] list = {"1","2","3","4","5","6","7","8","9"};
        ArrayList<Integer> actual = filterEvenNumbers(list);
        Integer[] expected = {2,4,6,8};
        Integer[] actualArray = actual.toArray(new Integer[0]);
        assertArrayEquals(expected, actualArray);
    }

    @Test
    void filterEvenNumbers_111222333() {
        String[] list = {"1","1","1","2","2","2","3","3","3"};
        ArrayList<Integer> actual = filterEvenNumbers(list);
        Integer[] expected = {2,2,2};
        Integer[] actualArray = actual.toArray(new Integer[0]);
        assertArrayEquals(expected, actualArray);
    }
}