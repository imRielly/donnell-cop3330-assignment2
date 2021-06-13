/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rielly Donnell
 */

/*
Exercise 31 - Karvonen Heart Rate
When you loop, you can control how much you increment the counter; you don’t always have to increment by one.

When getting into a fitness program, you may want to figure out your target heart rate so you don’t overexert yourself.
The Karvonen heart rate formula is one method you can use to determine your rate.
Create a program that prompts for your age and your resting heart rate.
Use the Karvonen formula to determine the target heart rate based on a range of intensities
from 55% to 95%. Generate a table with the results as shown in the example output.

The formula is

TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR

Example Output
Resting Pulse: 65        Age: 22

Intensity    | Rate
-------------|--------
55%          | 138 bpm
60%          | 145 bpm
65%          | 151 bpm
:               :        (extra lines omitted)
85%          | 178 bpm
90%          | 185 bpm
95%          | 191 bpm

Constraints
Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid inputs.
Display the results in a tabular format.

Challenge
Implement this as a GUI program that allows the user to use a slider control for the intensity,
and update the interface in real time as the slider moves.
 */

package ex31.base;

import java.util.Scanner;

import static java.lang.Math.ceil;
import static java.lang.Math.round;

public class App {
    public static void main(String[] args) {
        double restingPulse = enterPulse();
        double age = enterAge();
        String showInput = String.format("Resting Pulse: %s \t\tAge: %s\n", (int) restingPulse, (int) age);
        System.out.println(showInput);
        String output = generateOutput(restingPulse, age);
        System.out.println(output);
    }

    public static double enterPulse() {
        Scanner in = new Scanner(System.in);
        double rate = 0.0;
        boolean fail;
        do {
            System.out.print("Please enter your resting pulse: ");
            String input = in.nextLine();
            try {
                rate = Double.parseDouble(input);
                if (rate > 0) {
                    fail = false;
                } else {
                    System.out.println("Sorry. That is not a valid input.");
                    fail = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Sorry. That is not a valid input.");
                fail = true;
            }
        } while (fail);
        return rate;
    }

    public static double enterAge() {
        Scanner in = new Scanner(System.in);
        double rate = 0.0;
        boolean fail;
        do {
            System.out.print("Please enter your age: ");
            String input = in.nextLine();
            try {
                rate = Double.parseDouble(input);
                if (rate > 0) {
                    fail = false;
                } else {
                    System.out.println("Sorry. That is not a valid input.");
                    fail = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Sorry. That is not a valid input.");
                fail = true;
            }
        } while (fail);
        return rate;
    }

    public static String generateOutput(double resting, double age) {
        StringBuilder output = new StringBuilder("Intensity    | Rate\n-------------|--------\n");
        int bpm;
        for (int i = 55; i <= 95; i += 5) {
            bpm = calculateBPM(i, age, resting);
            output.append(i +"%          | " + bpm +" bpm\n");
        }
        return output.toString();
    }

    public static int calculateBPM(int i, double age, double resting){
        return (int) Math.round((((220.0 - age) - resting) * (i/100.0)) + resting);
    }
}