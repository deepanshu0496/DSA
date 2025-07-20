
import java.util.Arrays;
import java.util.List;

public class Even_Odd{
    public static void main(String[] args) {
     
        // to find even of a list
        List<Integer> even = Arrays.asList(1,2,4,3,66,43,21,44);
        System.out.println("Even number = " + even.stream().filter(x -> x % 2 == 0).toList());
        System.out.println("Odd number = " + even.stream().filter(x -> x % 2 != 0).toList());
        
    }
}