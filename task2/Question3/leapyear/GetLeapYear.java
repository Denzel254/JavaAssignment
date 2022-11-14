package Question3.leapyear;

import java.util.Scanner;

public class GetLeapYear {


    // the main method
    public static void main(String[] args) {
        // calling the static method
        getLeapYear();
    }

    // this method will check if it is a leap year or not
    static void getLeapYear() {

        int year;
        // scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year :");
        year = input.nextInt(); // input year

        
        // is year leap or not
        if ((year % 4) == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

}
