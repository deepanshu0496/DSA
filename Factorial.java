import java.math.BigInteger;
import java.util.List;
import java.util.stream.Stream;

public class Factorial {
    public static void main(String[] args) {
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(10).toList();
        
        // Compute and print factorials for each number in the list
        list.forEach(n -> {
            BigInteger fact = factorial(n);
            System.out.println(n + "! = " + fact);
        });
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}