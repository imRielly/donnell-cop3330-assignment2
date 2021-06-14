package ex40.base;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static ex39.base.App.generateRecords;
import static ex40.base.App.getRow;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getRow_jac_0() {
        List<Map<String,String>> records;
        records = generateRecords();
        int row = 0;
        String search = "jac";
        String actual = getRow(records, row, search);
        String expected = "Jacquelyn Jackson   | DBA               |\n";
        assertEquals(expected, actual);
    }

    @Test
    void getRow_blank_5() {
        List<Map<String,String>> records;
        records = generateRecords();
        int row = 5;
        String search = "";
        String actual = getRow(records, row, search);
        String expected = "Tou Xiong           | Software Engineer | 2016-10-05\n";
        assertEquals(expected, actual);
    }

}