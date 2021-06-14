/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rielly Donnell
 */

/*
Exercise 35 - Picking a Winner
Arrays don’t have to be hard-coded. You can take user input and store it in an array and then work with it.

Create a program that picks a winner for a contest or prize drawing.
Prompt for names of contestants until the user leaves the entry blank.
Then randomly select a winner.

Example Output
Enter a name: Homer
Enter a name: Bart
Enter a name: Maggie
Enter a name: Lisa
Enter a name: Moe
Enter a name:
The winner is... Maggie.

Constraints
Use a loop to capture user input into an array.
Use a random number generator to pluck a value from the array.
Don’t include a blank entry in the array.
Some languages require that you define the length of the array ahead of time.
You may need to find another data structure, like an ArrayList.
 */

package ex35.base;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<String> contestants = getContestants();
        int winner = getWinner(contestants.size());
        String output = String.format("The winner is... %s.", contestants.get(winner));
        System.out.println(output);
    }

    public static int getWinner(int size) {
        return (int) ((Math.random() * (size)) + 1)-1;
    }

    private static ArrayList<String> getContestants() {
        Scanner in = new Scanner(System.in);
        var input = new ArrayList<String>();
        String name;
        do{
            System.out.print("Enter a name: ");
            name = in.nextLine();
            if(!name.equals("")){
                input.add(name);
            }
        } while(!name.equals(""));
        return input;
    }
}
