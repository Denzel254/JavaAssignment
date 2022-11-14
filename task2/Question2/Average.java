package Question2;

//importing Scanner
import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        // scanner object
        Scanner input = new Scanner(System.in);

        // my variables
        double java_marks, networking_marks, math_marks, average; 

        // input java marks
        System.out.println("Enter marks for Java Programming: ");
        java_marks = input.nextInt(); 
        // input networking marks
        System.out.println("Enter marks for Networking: ");
        networking_marks = input.nextInt(); 
        // input maths marks
        System.out.println("Enter marks for Maths: ");
        math_marks = input.nextInt(); 
        // output
        System.out.println("\nMarks for Java Programming is: " + java_marks);
        System.out.println("Marks for Networking: " + networking_marks);
        System.out.println("Marks for Maths: " + math_marks);
        // calculate the average
        average = (java_marks + networking_marks + math_marks) / 3;
        // output the average
        System.out.println("\nThe average is: " + average);
    }

}
