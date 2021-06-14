/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rielly Donnell
 */

/*
Exercise 36 - Computing Statistics
Statistics is important in our field. When measuring response times or rendering times,
it’s helpful to collect data so you can easily spot abnormalities.
For example, the standard deviation helps you determine which values are outliers
and which values are within normal ranges.

Write a program that prompts for response times from a website in milliseconds.
It should keep asking for values until the user enters “done.”

The program should print the average time (mean), the minimum time, the maximum time,
and the population standard deviation.

Example Output
Enter a number: 100
Enter a number: 200
Enter a number: 1000
Enter a number: 300
Enter a number: done
Numbers: 100, 200, 1000, 300
The average is 400.0
The minimum is 100
The maximum is 1000
The standard deviation is 353.55

Constraints
Use functions called average, max, min, and std, which take in a list of numbers and return the results.
Use loops and arrays to perform the input and mathematical operations.
Be sure to exclude the "done" entry from the inputs.
Be sure to properly ignore any invalid inputs.
Keep the input separate from the processing and the output.
 */

package ex36.base;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var times = promptInt();
        String pTimes = printTimes(times);
        System.out.println(pTimes);
        String pAvg = printAvg(times);
        String pMin = printMin(times);
        String pMax = printMax(times);
        String pStd = printStd(times);

        String output = String.format("%s\n%s\n%s\n%s", pAvg, pMin, pMax, pStd);
        System.out.println(output);
    }

    public static String printAvg(ArrayList<Integer> times) {
        double avg;
        if (times.size() > 0){
            avg = times.stream().mapToDouble(d -> d).average().orElse(0.0);
        }else {avg = 0.0;}
        return "The average is " + avg;
    }

    public static String printMin(ArrayList<Integer> times) {
        double min;
        if (times.size() > 0){
            min = times.stream().mapToDouble(d -> d).min().orElse(0.0);
        }else {min = 0.0;}
        return "The minimum is " + (int) min;
    }

    public static String printMax(ArrayList<Integer> times) {
        double max;
        if (times.size() > 0){
            max = times.stream().mapToDouble(d -> d).max().orElse(0.0);
        }else {max = 0.0;}
        return "The maximum is " + (int) max;
    }

    public static String printStd(ArrayList<Integer> times) {
        double std;
        if (times.size() > 0){
            double sum = 0.0;
            double stdTmp = 0.0;
            int len = times.size();

            for(double num : times) {
                sum += num;
            }

            double mean = sum/len;

            for(double num: times) {
                stdTmp += Math.pow(num - mean, 2);
            }

            std = Math.sqrt(stdTmp/len);
        }else {std = 0.0;}
        return "The standard deviation is " + String.format("%.2f", std);
    }

    private static String printTimes(ArrayList<Integer> times) {
        StringBuilder results = new StringBuilder("Numbers: ");
        for (Integer time : times) results.append(time).append(", ");
        results.deleteCharAt(results.length() -1);
        results.deleteCharAt(results.length() -1);
        return results.toString();
    }

    public static ArrayList<Integer> promptInt(){
        Scanner in = new Scanner(System.in);
        var results = new ArrayList<Integer>();
        String input;
        boolean fail;
        do{
            System.out.print("Enter a number: ");
            input = in.nextLine();
            try {
                int isInt = Integer.parseInt(input);
                if(isInt > 0) {
                    fail = true;
                    results.add(isInt);

                } else {
                    System.out.println("Invalid. Must be greater than 0.");
                    fail = true;
                }
            }
            catch (NumberFormatException e) {
                if(input.equalsIgnoreCase("done")){
                    fail = false;
                } else {
                    System.out.println("Invalid. Must enter a number or done.");
                    fail = true;
                }
            }
        }while(fail);
        return results;
    }
}
