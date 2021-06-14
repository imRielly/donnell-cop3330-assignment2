/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rielly Donnell
 */


/*
Exercise 39 - Sorting Records
When you’re looking at results, you’ll want to be able to sort them so you
can find what you’re looking for quickly or do some quick visual comparisons.

Given the following data set, create a program that sorts all employees by
last name and prints them to the screen in a tabular format.

First Name	Last Name	Position	Separation Date
John	Johnson	Manager	2016-12-31
Tou	Xiong	Software Engineer	2016-10-05
Michaela	Michaelson	District Manager	2015-12-19
Jake	Jacobson	Programmer
Jacquelyn	Jackson	DBA
Sally	Webber	Web Developer	2015-12-18


Example Output
Name                | Position          | Separation Date
--------------------|-------------------|----------------
Jacquelyn Jackson   | DBA               |
Jake Jacobson       | Programmer        |
John Johnson        | Manager           | 2016-12-31
Michaela Michaelson | District Manager  | 2015-12-19
Sally Weber         | Web Developer     | 2015-12-18
Tou Xiong           | Software Engineer | 2016-10-05
Constraint
Store the data using a list of maps.
 */

package ex39.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        List<Map<String,String>> records;
        records = generateRecords();
        StringBuilder output = new StringBuilder(("""
                Name                | Position          | Separation Date
                --------------------|-------------------|----------------
                """));
        for (int i = 0; i < records.size(); i++) {
            output.append(getRow(records, i));
        }
        //output += records.get(0).toString();
        System.out.println(output);
    }

    public static String getRow(List<Map<String, String>> records, int i) {
        Map<String, String> feed = records.get(i);
        return feed.get("name") + feed.get("position") + feed.get("seperationdate") + "\n";
    }

    public static List<Map<String, String>> generateRecords() {
        List<Map<String, String>> records = new ArrayList<>();
        Map<String, String> record1 = new HashMap<>();
        record1.put("name","Jacquelyn Jackson   |");
        record1.put("position"," DBA               |");
        record1.put("seperationdate","");
        records.add(record1);
        Map<String, String> record2 = new HashMap<>();
        record2.put("name","Jake Jacobson       |");
        record2.put("position"," Programmer        |");
        record2.put("seperationdate","");
        records.add(record2);
        Map<String, String> record3 = new HashMap<>();
        record3.put("name","John Johnson        |");
        record3.put("position"," Manager           |");
        record3.put("seperationdate"," 2016-12-31");
        records.add(record3);
        Map<String, String> record4 = new HashMap<>();
        record4.put("name","Michaela Michaelson |");
        record4.put("position"," District Manager  |");
        record4.put("seperationdate"," 2015-12-19");
        records.add(record4);
        Map<String, String> record5 = new HashMap<>();
        record5.put("name","Sally Weber         |");
        record5.put("position"," Web Developer     |");
        record5.put("seperationdate"," 2015-12-18");
        records.add(record5);
        Map<String, String> record6 = new HashMap<>();
        record6.put("name","Tou Xiong           |");
        record6.put("position"," Software Engineer |");
        record6.put("seperationdate"," 2016-10-05");
        records.add(record6);
        return records;
    }
}
