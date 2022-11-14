package task1;

import java.util.Scanner; //importing Scanner

public class Question2 {

    // main function. This is the program starting point
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // my Scanner object

        // my variables
        double unit1, unit2, unit3, unit4, unit5, average;

        System.out.println("Enter marks for the following to get average :");

        // inputting the five units
        // input unit 1
        System.out.println("\nUnit 1 : ");
        unit1 = input.nextDouble();

        // input unit 2
        System.out.println("Unit 2 : ");
        unit2 = input.nextDouble();

        // input unit 3
        System.out.println("Unit 3 : ");
        unit3 = input.nextDouble();

        // input unit 4
        System.out.println("Unit 4 : ");
        unit4 = input.nextDouble();

        // input unit 5
        System.out.println("Unit 5 : ");
        unit5 = input.nextDouble();

        // get rounded average mark
        average = getAverage(unit1, unit2, unit3, unit4, unit5);
        System.out.println("\nYour average mark : " + average);// Dispaly output
    }

    // a static method that calculates the average
    static double getAverage(double unit1, double unit2, double unit3, double unit4, double unit5) {

        // get the average
        var myAverage = (unit1 + unit2 + unit3 + unit4 + unit5) / 5;

        // round the average
        var roundAverage = Math.round(myAverage * 100.0) / 100.0;
        return roundAverage;
    }
}