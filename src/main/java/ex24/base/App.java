/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rielly Donnell
 */

package ex24.base;

/*
Exercise 24 - Anagram Checker
Using functions to abstract the logic away from the rest of your code makes it easier to read
and easier to maintain.

Create a program that compares two strings and determines if the two strings are anagrams.
The program should prompt for both input strings and display the output as shown in the example that follows.

Example Output
Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.

Constraints
Implement the program using a function called isAnagram, which takes in two words as its arguments
and returns true or false. Invoke this function from your main program.
Check that both words are the same length.

Challenge
Complete this program without using built-in language features. Use selection or repetition logic instead and develop your own algorithm.

 */

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        String sOne = prompt("first");
        String sTwo = prompt("second");

        String sOneAlpha = alphabetize(sOne);
        String sTwoAlpha = alphabetize(sTwo);

        boolean isSameLength = isSameLength(sOne, sTwo);
        boolean isAnagram = isAnagram(sOneAlpha, sTwoAlpha);

        String output = generateOutput(isSameLength, isAnagram, sOne, sTwo);

        System.out.println(output);
    }

    private static String prompt(String prompt){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the " + prompt + " string: ");
        return in.nextLine();
    }

    public static boolean isSameLength(String sOne, String sTwo){
        return sOne.length() == sTwo.length();
    }

    public static String alphabetize(String str){
        char[] array = str.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

    public static boolean isAnagram(String sOne, String sTwo){
        return sOne.equals(sTwo);
    }

    public static String generateOutput(boolean isSameLength, boolean isAnagram, String sOne, String sTwo){
        if (isSameLength && isAnagram)
            return "\"" + sOne + "\" and \"" + sTwo + "\" are anagrams.";
        else return "\"" + sOne + "\" and \"" + sTwo + "\" are not anagrams.";
    }

}
