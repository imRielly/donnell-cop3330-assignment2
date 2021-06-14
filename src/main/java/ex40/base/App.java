/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rielly Donnell
 */

/*
Exercise 40 - Filtering Records
Sorting records is helpful, but sometimes you need to filter down
the results to find or display only what you’re looking for.

Given the following data set create a program that lets a user locate
all records that match the search string by comparing the search string to the first or last name field.

First Name	Last Name	Position	Separation Date
John	Johnson	Manager	2016-12-31
Tou	Xiong	Software Engineer	2016-10-05
Michaela	Michaelson	District Manager	2015-12-19
Jake	Jacobson	Programmer
Jacquelyn	Jackson	DBA
Sally	Webber	Web Developer	2015-12-18


Example Output
Enter a search string: Jac

Results:

Name                | Position          | Separation Date
--------------------|-------------------|----------------
Jacquelyn Jackson   | DBA               |
Jake Jacobson       | Programmer        |
Constraint
Store the data using a list of maps.
 */

package ex40.base;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static ex39.base.App.generateRecords;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        String search = in.nextLine();
        List<Map<String,String>> records;
        records = generateRecords();
        StringBuilder output = new StringBuilder(("""
                Name                | Position          | Separation Date
                --------------------|-------------------|----------------
                """));

        for (int i = 0; i < records.size(); i++) {
            String row = (getRow(records, i, search));
            if (row.length() > 0) output.append(row);
        }
        System.out.println(output);
    }

    public static String getRow(List<Map<String, String>> records, int i, String search) {
        Map<String, String> feed = records.get(i);
        String name = feed.get("name").toLowerCase();
        if(name.contains(search.toLowerCase())){
            return feed.get("name") + feed.get("position") + feed.get("seperationdate") + "\n";
        } else return "";
    }
}
