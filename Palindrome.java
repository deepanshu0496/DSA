
import java.util.Arrays;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple", "banana", "recer", "aba", "level");
        long count = list1.stream().filter(x -> new StringBuilder(x).reverse().toString().equals(x)).count();
        System.out.println(count);
    }
}
