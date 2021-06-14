/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rielly Donnell
 */

/*
Exercise 37 - Password Generator
Coming up with a password that meets specific requirements is something your computer can do.
And it will give you practice using random number generators in conjunction with a list of known values.

Create a program that generates a secure password.
Prompt the user for the minimum length, the number of special characters, and the number of numbers.
Then generate a password for the user using those inputs.

Example Output
What's the minimum length? 8
How many special characters? 2
How many numbers? 2
Your password is aurn2$1s#

Constraints
Use lists to store the characters you’ll use to generate the passwords.
Ensure that the generated password is random.
Ensure that there are at least as many letters are there are special characters and number.
 */

package ex37.base;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int len = in.nextInt();
        in.nextLine();
        System.out.print("How many special characters? ");
        int symbols = in.nextInt();
        in.nextLine();
        System.out.print("How many numbers? ");
        int numbers = in.nextInt();
        in.nextLine();

        String password = generatePassword(len, symbols, numbers);
        String output = String.format("Your password is %s", password);
        System.out.println(output);

    }

    public static String generatePassword(int len, int symbols, int numbers) {
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0","!","@","#","$","%","^","&","*","(",")","-"};
        ArrayList<String> password = new ArrayList<String>();
        boolean metLen = false;
        boolean metSymbols = false;
        boolean metNumbers = false;
        int addedSymbols = 0;
        int addedNumbers = 0;
        int random;
        do {
            if (metSymbols) {
                random = (int) (Math.random() * (37-1))+1;
            } else {
                random = (int) (Math.random() * (alphabet.length-1)) + 1;
            }
            password.add(alphabet[random]);
            if (random >= 36) {
                addedSymbols++;
            }
            if (addedSymbols == 2) {
                metSymbols = true;
            }
            if (password.size() >= len) {
                metLen = true;
            }
            if (random >= 26 && random < 36) {
                addedNumbers++;
            }
            if (addedNumbers == 2) {
                metNumbers = true;
            }
        } while(!metLen || !metSymbols || !metNumbers);

        StringBuilder result = new StringBuilder();
        for (String c : password) {
            result.append(c);
        }

        return result.toString();
    }
}
