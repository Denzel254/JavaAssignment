package Question4;

public class MergeSentence {

    // non static method
    void combineSentences(String sentence_one, String sentence_two) {
        // prints the output to the console
        System.out.println(sentence_one + sentence_two);
        // returns void
    }

    // This is a static method
    static String getSentenceTwo() {
        return " internet services.";
    }

    // main method
    public static void main(String[] args) {

        String sentence_one, sentence_two;

        // calling a static method
        sentence_one = "Google offers best";
        sentence_two = getSentenceTwo();

        // using non-static method
        MergeSentence objectThisClass = new MergeSentence();
        objectThisClass.combineSentences(sentence_one, sentence_two);
    }
}