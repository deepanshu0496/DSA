import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringOperation {
    public static void main(String[] args) {
        // 🔹 To Uppercase
        List<String> stringUpper = Arrays.asList("hello", "world", "java");
        System.out.println("Uppercase: " + stringUpper.stream()
                .map(String::toUpperCase)
                .toList());

        // 🔹 To Lowercase
        List<String> stringLower = Arrays.asList("DSA", "WITH", "JAVA");
        System.out.println("Lowercase: " + stringLower.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList()));

        // 🔹 Find character at index 1
        List<String> findChar = Arrays.asList("hello");
        System.out.println("Character at index 1: " + findChar.stream()
                .map(x -> x.charAt(1))
                .toList());

        // 🔹 Find length of word
        System.out.println("Length of each word: " + findChar.stream()
                .map(String::length)
                .toList());

        // 🔹 String compare
        List<String> word1 = Arrays.asList("java");
        List<String> word2 = Arrays.asList("hii");

        boolean areEqual = word1.get(0).equals(word2.get(0));
        System.out.println("Are \"" + word1.get(0) + "\" and \"" + word2.get(0) + "\" equal? " + areEqual);

        // string concate
        String concate = Stream.concat(word1.stream(), word2.stream()).collect(Collectors.joining(" "));
        System.out.println(concate);

        // string concate of alphabet
        List<String> alphabet = Arrays.asList("H", "e", "l", "l", "o");
        String word = alphabet.stream().collect(Collectors.joining());
        System.out.println(word);

        
    }
}
