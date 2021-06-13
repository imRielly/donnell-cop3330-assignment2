/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rielly Donnell
 */

/*
Exercise 25 - Password Strength Indicator
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.

Example Output
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.

Constraints
Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate
to determine the password strength. Do not have the function return a string—you may need to support multiple languages
in the future.
Use a single output statement.

Challenge
Create a GUI application or web application that displays graphical feedback as well as text feedback in real time.
As someone enters a password, determine its strength and display the result
 */

package ex25.base;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {
        System.out.print("Password: ");
        Scanner in = new Scanner(System.in);
        String password = in.nextLine();
        int passwordStrength = passwordValidator(password);

        String output = getOutput(password, passwordStrength);

        System.out.println(output);
    }

    public static int passwordValidator(String password) {
        //has letter
        boolean hasLetter = hasLetter(password);
        //has number
        boolean hasNumber = hasNumber(password);
        //has 8 characters
        boolean has8 = has8(password);
        //has symbol
        boolean hasSymbol = hasSymbol(password);

        if (hasSymbol && has8 && hasLetter && hasNumber) {
            return 3;
        } else if (hasNumber && hasLetter && has8) {
            return 2;
        } else if (hasNumber && hasLetter) {
            return 1;
        } else return 0;
    }

    public static boolean hasLetter(String password){
        Pattern regex = Pattern.compile(".[a-z]");
        Matcher pword = regex.matcher(password);
        return pword.find();
    }

    public static boolean hasNumber(String password){
        Pattern regex = Pattern.compile(".[0-9]");
        Matcher pword = regex.matcher(password);
        return pword.find();
    }

    public static boolean has8(String password){
        return password.length() >= 8;
    }

    public static boolean hasSymbol(String password){
        Pattern regex = Pattern.compile(".[^a-z0-9]");
        Matcher pword = regex.matcher(password);
        return pword.find();
    }

    public static String getOutput(String password, int passwordStrength) {
        return switch (passwordStrength) {
            case 3 -> String.format("The password '%s' is a very strong password.", password);
            case 2 -> String.format("The password '%s' is a strong password.", password);
            case 1 -> String.format("The password '%s' is a weak password.", password);
            default -> String.format("The password '%s' is a very weak password.", password);
        };
    }

}
