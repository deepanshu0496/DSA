import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        // Get prime numbers from 2 to 100
        List<Integer> primeNumbers = IntStream.rangeClosed(2, 100)
                .filter(PrimeNumber::isPrime)
                .boxed() //.boxed(): Converts IntStream to Stream<Integer> so you can collect to a List<Integer>.
                .collect(Collectors.toList());

        System.out.println(primeNumbers);

        // another approach
        List<Integer> primeNumbers1 = IntStream.rangeClosed(2, 100)
                .filter(n -> {
                    if (n <= 1) return false;
                    return IntStream.rangeClosed(2, (int) Math.sqrt(n))
                            .allMatch(divisor -> n % divisor != 0);
                })
                .boxed()
                .collect(Collectors.toList());

        System.out.println(primeNumbers1);

        // if we have list of arrays 
        List<Integer> number = Arrays.asList(1, 2, 3, 45, 32, 57, 78, 95, 49 ,7);
        List<Integer> primeNumber2 = number.stream().filter(n -> n > 1 && IntStream.rangeClosed(2,(int) Math.sqrt(n)).allMatch(div -> n % div != 0)).collect(Collectors.toList());
        System.out.println(primeNumber2);

    }

    //isPrime(): Returns true if the number has no divisors other than 1 and itself.
    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(number)) //IntStream.rangeClosed(2, 100): Generates numbers from 2 to 100.
                .allMatch(n -> number % n != 0);
    }
}
