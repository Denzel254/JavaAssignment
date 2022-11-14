package task1;

//Scanner import
import java.util.Scanner;

public class Question1 {

    // main method
    public static void main(String[] args) {

        // creating the Scanner object
        Scanner input = new Scanner(System.in);

        // My variables
        String surname, numberType;
        int age, numOfLetters;


        // input name
        System.out.println("Enter your surname :");
        surname = input.nextLine();


        // input age
        System.out.println("Enter your age :");
        age = input.nextInt();

        // get number of characters in surname
        numOfLetters = surname.length();


        // Check if even or odd
        if (age % 2 == 0) {
            // age is even
            numberType = "even";
        } else {
            // age is odd
            numberType = "odd";
        }

        
        // output
        System.out.println("Your surname has : " + numOfLetters + " characters");
        System.out.println("Your age is an " + numberType + " number.");
    }
}