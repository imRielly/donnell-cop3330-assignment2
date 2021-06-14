/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rielly Donnell
 */

/*
Exercise 38 - Filtering Values
Sometimes input you collect will need to be filtered down. Data structures and loops can make this process easier.

Create a program that prompts for a list of numbers, separated by spaces.
Have the program print out a new list containing only the even numbers.

Example Output
Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
The even numbers are 2 4 6 8.

Constraints
Convert the input to an array.
Many languages can easily convert strings to arrays with a built-in function that splits apart
a string based on a specified delimiter.
Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
Use a function called filterEvenNumbers to encapsulate the logic for this.
The function takes in the old array and returns the new array.
 */

package ex38.base;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = in.nextLine();
        String[] original = input.split(" ");

        ArrayList<Integer> newArray = filterEvenNumbers(original);
        String output = generateOutput(newArray);
        System.out.println(output);
    }

    public static String generateOutput(ArrayList<Integer> newArray) {
        StringBuilder result = new StringBuilder("The even numbers are");
        for (Integer integer : newArray) result.append(" ").append(integer);
        result.append(".");
        return result.toString();
    }

    public static ArrayList<Integer> filterEvenNumbers(String[] original) {
        var even = new ArrayList<Integer>();
        for (String s : original) {
            try {
                if (Integer.parseInt(s) % 2 == 0) {
                    even.add(Integer.parseInt(s));
                }
            }catch(NumberFormatException e){
            }
        }
        return even;
    }
}
