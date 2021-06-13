/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rielly Donnell
 */

/*
Exercise 27 - Validating Inputs
Large functions aren’t very usable or maintainable. It makes a lot of sense to break down
the logic of a program into smaller functions that do one thing each. The program can then
call these functions in sequence to perform the work.

Write a program that prompts for a first name, last name, employee ID, and ZIP code.
Ensure that the input is valid according to these rules:

The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.

Example Output
Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter the employee ID: A12-1234
The first name must be at least 2 characters long.
The last name must be at least 2 characters long.
The last name must be filled in.
The employee ID must be in the format of AA-1234.
The zipcode must be a 5 digit number.
Or

Enter the first name: John
Enter the last name: Johnson
Enter the ZIP code: 55555
Enter the employee ID: TK-4321
There were no errors found.

Constraints
Create a function for each type of validation you need to write. Then create a validateInput
function that takes in all of the input data and invokes the specific validation functions.
Use a single output statement to display the outputs.

Challenges
Use regular expressions to validate the input.
Implement this as a GUI application or web application that gives immediate feedback when the fields lose focus.
Repeat the process if the input is not valid.
 */

package ex27.base;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String fName = in.nextLine();
        System.out.print("Enter the last name: ");
        String lName = in.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zip = in.nextLine();
        System.out.print("Enter the employee ID: ");
        String eID = in.nextLine();

        String errors = validateInput(fName, lName, zip, eID);
        System.out.println(errors);
    }

    public static String validateInput(String fName, String lName, String zip, String eID) {
        String errors = "";
        if (!entered(fName)) {
            errors = errors + "The first name must be filled in.\n";
        }
        if (!twoMore(fName)) {
            errors = errors + "The first name must be at least 2 characters long.\n";
        }
        if (!entered(lName)) {
            errors = errors + "The last name must be filled in.\n";
        }
        if (!twoMore(lName)) {
            errors = errors + "The last name must be at least 2 characters long.\n";
        }
        if (!eIDFormat(eID)) {
            errors = errors + "The employee ID must be in the format of AA-1234.\n";
        }
        if (!zip(zip)) {
            errors = errors + "The zipcode must be a 5 digit number.";
        }
        if (errors.length() == 0) errors = "There are no errors.";
        return errors;
    }

    public static boolean entered(String input){
        return (input.length() > 0);
    }

    public static boolean twoMore(String input){
        return (input.length() >= 2);
    }

    public static boolean eIDFormat(String input) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]{2}+-[0-9]{4}+$" ,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static boolean zip(String input) {
        Pattern pattern = Pattern.compile("^[0-9]{5}+$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

}
