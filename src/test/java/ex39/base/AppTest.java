package ex39.base;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static ex39.base.App.*;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getRow_0() {
        int row = 0;
        List<Map<String,String>> records;
        records = generateRecords();
        String actual = getRow(records, row);
        String expected = "Jacquelyn Jackson   | DBA               |\n";
        assertEquals(expected,actual);
    }

    @Test
    void getRow_1() {
        int row = 1;
        List<Map<String,String>> records;
        records = generateRecords();
        String actual = getRow(records, row);
        String expected = "Jake Jacobson       | Programmer        |\n";
        assertEquals(expected,actual);
    }

    @Test
    void getRow_5() {
        int row = 5;
        List<Map<String,String>> records;
        records = generateRecords();
        String actual = getRow(records, row);
        String expected = "Tou Xiong           | Software Engineer | 2016-10-05\n";
        assertEquals(expected,actual);
    }

}