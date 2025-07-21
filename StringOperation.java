
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringOperation {
    public static void main(String[] args) {
        // to uppercase
        List<String> stringupper = Arrays.asList("hello","world","java");
        System.out.println(stringupper.stream().map(x -> x.toUpperCase()).toList());

        // to lowercase
        List<String> stringlower = Arrays.asList("DSA", "WITH","JAVA");
        System.out.println(stringlower.stream().map(x -> x.toLowerCase()).collect(Collectors.toList()));

    }
}
