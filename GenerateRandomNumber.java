import java.util.stream.Stream;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        Stream<Integer> randomNumber = Stream.generate(() -> (int)(Math.random() * 10)).limit(5);
        randomNumber.forEach(System.out::println);

        Stream.generate(() -> (int)(Math.random() * 100)) // it will generate the random number till 100
       .limit(5)
       .filter(x -> x > 50) // it will generate the value above than 50
       .map(x -> x * 2)  // it double the value 
       .forEach(System.out::println);

    }
}
