import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    // Option 1: Make the comparator a static nested class
    static class LengthComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return s1.length() - s2.length();
        }
    }

    // Option 2: Use a lambda expression (Java 8+)
    static Comparator<String> lengthComparator = (s1, s2) -> s1.length() - s2.length();

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "mango", "kiwi", "pear");

        // Using the static nested class
        strings.sort(new LengthComparator());
        System.out.println("Sorted with nested class: " + strings);

        // Using the lambda comparator
        strings.sort(lengthComparator);
        System.out.println("Sorted with lambda: " + strings);

        // Using Comparator.comparingInt (most concise)
        strings.sort(Comparator.comparingInt(String::length));
        System.out.println("Sorted with method reference: " + strings);
    }
}