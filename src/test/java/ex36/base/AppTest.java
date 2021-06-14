package ex36.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static ex36.base.App.*;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void printAvg_defaults(){
        var ints = new ArrayList<Integer>();
        ints.add(100);
        ints.add(200);
        ints.add(1000);
        ints.add(300);
        String actual = printAvg(ints);
        assertEquals("The average is 400.0", actual);
    }

    @Test
    void printAvg_0(){
        var ints = new ArrayList<Integer>();
        ints.add(0);
        ints.add(0);
        ints.add(0);
        ints.add(0);
        String actual = printAvg(ints);
        assertEquals("The average is 0.0", actual);
    }

    @Test
    void printMin_defaults(){
        var ints = new ArrayList<Integer>();
        ints.add(100);
        ints.add(200);
        ints.add(1000);
        ints.add(300);
        String actual = printMin(ints);
        assertEquals("The minimum is 100", actual);
    }

    @Test
    void printMin_0(){
        var ints = new ArrayList<Integer>();
        ints.add(0);
        ints.add(0);
        ints.add(0);
        ints.add(0);
        String actual = printMin(ints);
        assertEquals("The minimum is 0", actual);
    }

    @Test
    void printMax_defaults(){
        var ints = new ArrayList<Integer>();
        ints.add(100);
        ints.add(200);
        ints.add(1000);
        ints.add(300);
        String actual = printMax(ints);
        assertEquals("The maximum is 1000", actual);
    }

    @Test
    void printMax_0(){
        var ints = new ArrayList<Integer>();
        ints.add(0);
        ints.add(0);
        ints.add(0);
        ints.add(0);
        String actual = printMax(ints);
        assertEquals("The maximum is 0", actual);
    }

    @Test
    void printStd_defaults(){
        var ints = new ArrayList<Integer>();
        ints.add(100);
        ints.add(200);
        ints.add(1000);
        ints.add(300);
        String actual = printStd(ints);
        assertEquals("The standard deviation is 353.55", actual);
    }

    @Test
    void printStd_0(){
        var ints = new ArrayList<Integer>();
        ints.add(0);
        ints.add(0);
        ints.add(0);
        ints.add(0);
        String actual = printStd(ints);
        assertEquals("The standard deviation is 0.00", actual);
    }
}