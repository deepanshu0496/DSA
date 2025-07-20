
import java.util.List;
import java.util.stream.Stream;

public class PrintNumber {
    public static void main(String[] args) {
        // printing the number
        List<Integer> list = Stream.iterate(1, x -> x+1).limit(20).toList();
        System.out.println(list);
    }
}
