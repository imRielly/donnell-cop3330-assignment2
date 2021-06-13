/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rielly Donnell
 */

/*
Exercise 34 - Employee List Removal
Sometimes you have to locate and remove an entry from a list based on some criteria.
You may have a deck of cards and need to discard one so it’s no longer in play,
or you may need to remove values from a list of valid inputs once they’ve been used.
Storing the values in an array makes this process easier.
Depending on your language, you may find it safer and more efficient
to create a new array instead of modifying the existing one.

Create a small program that contains a list of employee names.
Print out the list of names when the program runs the first time.
Prompt for an employee name and remove that specific name from the list of names.
Display the remaining employees, each on its own line.

Example Output
There are 5 employees:
John Smith
Jackie Jackson
Chris Jones
Amanda Cullen
Jeremy Goodwin

Enter an employee name to remove: Chris Jones

There are 4 employees:
John Smith
Jackie Jackson
Amanda Cullen
Jeremy Goodwin

Constraint
Use an array or list to store the names.
*/

package ex34.base;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        String output = printEmployees(employees);
        System.out.println(output);
        System.out.print("Enter an employee name to remove: ");
        String remove = in.nextLine();

        employees.removeIf(n -> (n.equals(remove)));
        output = printEmployees(employees);
        System.out.println(output);

    }

    public static String printEmployees(ArrayList<String> employees) {
        int employeeCount = employees.size();
        StringBuilder result = new StringBuilder("There are " + employeeCount + " employees:\n");
        for (String name : employees) result.append(name).append("\n");
        return result.toString();
    }
}
