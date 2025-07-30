import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitAndReverseStream {
    public static void main(String[] args) {
        String sentence = "Java is Powerful";

        List<String> reversedWords = Arrays.stream(sentence.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.toList());

        System.out.println(reversedWords); // [avaJ, si, lufrewoP]

        // Optionally, join back to form a reversed sentence
        String finalOutput = String.join(" ", reversedWords);
        System.out.println(finalOutput); // avaJ si lufrewoP

        // List<String> list1 = Arrays.stream(sentence.split(" ")).map(x -> new StringBuilder(x).reverse().toString()).collect(Collectors.toList());
        // System.out.println(list1);
    }
}
