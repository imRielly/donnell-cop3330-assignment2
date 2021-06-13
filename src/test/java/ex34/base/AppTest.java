package ex34.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static ex34.base.App.*;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void printEmployees_1() {
        ArrayList<String> employees = new ArrayList<String>();
        employees.add("One Guy");
        String actual = printEmployees(employees);
        assertEquals("There are 1 employees:\nOne Guy\n", actual);
    }

    @Test
    void printEmployees_2() {
        ArrayList<String> employees = new ArrayList<String>();
        employees.add("One Guy");
        employees.add("Two Guys");
        String actual = printEmployees(employees);
        assertEquals("There are 2 employees:\nOne Guy\nTwo Guys\n", actual);
    }
}