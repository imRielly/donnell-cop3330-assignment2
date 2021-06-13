/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rielly Donnell
 */

/*
Exercise 33 - Magic 8 Ball
Arrays are great for storing possible responses from a program. If you combine that with a random number generator,
you can pick a random entry from this list, which works great for games.

Create a Magic 8 Ball game that prompts for a question
and then displays either "Yes," "No," "Maybe," or "Ask again later."

Example Output
What's your question?
> Will I be rich and famous?

Ask again later.

Constraint
The value should be chosen randomly using a pseudo random number generator.
Store the possible choices in a list and select one at random.

Challenges
Implement this as a GUI application.
If available, use native device libraries to allow you to “shake” the 8 ball.
 */

package ex33.base;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What's your question?\n> ");
        in.nextLine();
        int random = random();
        String answer = getAnswer(random);
        System.out.println(answer);
    }

    public static String getAnswer(int random) {
        return switch (random) {
            case 1 -> "Yes";
            case 2 -> "No";
            case 3 -> "Maybe";
            case 4 -> "Ask again later.";
            default -> null;
        };
    }

    public static int random(){
        return (int) (Math.random() * (5-1)) + 1;
    }
}
