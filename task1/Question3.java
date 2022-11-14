package task1;

//Sannner import
import java.util.Scanner;

public class Question3 {

    //main method
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        int numToTest;

        System.out.println("Enter a number to check its divisibility test :");
        numToTest = input.nextInt();// get user input

        // calling the divisibility test methods
        divTestFor0(numToTest);
        divTestFor1(numToTest);
        divTestFor2(numToTest);
        divTestFor3(numToTest);
        divTestFor4(numToTest);
        divTestFor5(numToTest);
        divTestFor6(numToTest);
        divTestFor7(numToTest);
        divTestFor8(numToTest);
        divTestFor9(numToTest);
    }

    // A list of my methods to check divisibility test.

    //this method tests divisibility by 0
    static void divTestFor0(int num) {
        System.out.println(num + " cannot be divisible by 0.");
    }

    //this method tests divisibility by 1
    static void divTestFor1(int num) {
        System.out.println(num + " is divisible by 1. Any number divided by 1 will give the number itself");
    }

    //this method tests divisibility by 2
    static void divTestFor2(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is divisible by 2. All even number are divisible by 2.");
        } else {
            System.out.println(num + " is not divisible by 2. All odd number are not divisible by 2.");
        }
    }

    //this method tests divisibility by 3
    static void divTestFor3(int num) {
        if ((num % 3) == 0) {
            System.out.println(num + " is divisible by 3");
        } else {
            System.out.println(num + " is not divisible by 3");
        }
    }

    //this method tests divisibility by 4
    static void divTestFor4(int num) {
        if ((num % 4) == 0) {
            System.out.println(num + " is divisible by 4");
        } else {
            System.out.println(num + " is not divisible by 4");
        }
    }

    //this method tests divisibility by 5
    static void divTestFor5(int num) {
        if ((num % 5) == 0) {
            System.out.println(num + " is divisible by 5");
        } else {
            System.out.println(num + " is not divisible by 5");
        }
    }

    //this method tests divisibility by 6
    static void divTestFor6(int num) {
        if ((num % 6) == 0) {
            System.out.println(num + " is divisible by 6");
        } else {
            System.out.println(num + " is not divisible by 6");
        }
    }

    //this method tests divisibility by 7
    static void divTestFor7(int num) {
        if ((num % 7) == 0) {
            System.out.println(num + " is divisible by 7");
        } else {
            System.out.println(num + " is not divisible by 7");
        }
    }

    //this method tests divisibility by 8
    static void divTestFor8(int num) {
        if ((num % 8) == 0) {
            System.out.println(num + " is divisible by 8");
        } else {
            System.out.println(num + " is not divisible by 8");
        }
    }

    //this method tests divisibility by 9
    static void divTestFor9(int num) {
        if ((num % 9) == 0) {
            System.out.println(num + " is divisible by 9");
        } else {
            System.out.println(num + " is not divisible by 9");
        }
    }
}