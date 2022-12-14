package task1;

//these imports were generated by the IDE when creating the list
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question4 {

    // This method will produce a list of multiples of 2
    static void getMultiplesOf2(List<Integer> listNumbers) {
        System.out.println("The multiples of 2 are :");

        for (int i = 0; i <= listNumbers.size(); i++) {
            if (listNumbers.get(i) % 2 == 0) {
                System.out.println(listNumbers.get(i));

            }
            if (i == 150 - 71) {
                break;
            }
        }
    }

    // This method will produce a list of multiples of 3
    static void getMultiplesOf3(List<Integer> listNumbers) {
        System.out.println("\n\nThe multiples of 3 are :");

        for (int i = 0; i <= listNumbers.size(); i++) {
            if (listNumbers.get(i) % 3 == 0) {
                System.out.println(listNumbers.get(i));

            }
            if (i == 150 - 71) {
                break;
            }
        }
    }

    // This method will produce a list of multiples of 7
    static void getMultiplesOf7(List<Integer> listNumbers) {
        System.out.println("\n\nThe multiples of 7 are :");

        for (int i = 0; i <= listNumbers.size(); i++) {
            if (listNumbers.get(i) % 7 == 0) {
                System.out.println(listNumbers.get(i));

            }
            if (i == 150 - 71) {
                break;
            }
        }
    }

    // main method
    public static void main(String[] args) {

        // This list holds 71-149
        List<Integer> listNumbers = IntStream.range(71, 150).boxed().collect(Collectors.toList());

        // adding last item so that we could also iterate upto 150
        listNumbers.add(150);

        // calling my methods to print the output
        getMultiplesOf2(listNumbers);
        getMultiplesOf3(listNumbers);
        getMultiplesOf7(listNumbers);
    }
}
