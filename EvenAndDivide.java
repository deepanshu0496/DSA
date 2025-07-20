
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenAndDivide {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,33,22,34,43,44,67,98,100,0,1,2,0);
        List<Integer> filtereList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()); // it will return even number
        System.out.println(filtereList);
        List<Integer> mappedList = filtereList.stream().map(x -> x / 2).collect(Collectors.toList()); // it will divide the even number
        System.out.println(mappedList);

        // new way for both
        System.out.println(list.stream().filter(x -> x % 2 ==0).map(x -> x / 2).collect(Collectors.toList()));

        // to remove duplicate element use distinct
        System.out.println(list.stream().filter(x -> x % 2 ==0).map(x -> x / 2).distinct().collect(Collectors.toList()));

        // to make it sorted 
        System.out.println(list.stream().filter(x -> x % 2 ==0).map(x -> x / 2).distinct().sorted().collect(Collectors.toList()));

        // sorted in descending
        System.out.println(list.stream().filter(x -> x % 2 ==0).map(x -> x / 2).distinct().sorted((a ,b)-> b-a).collect(Collectors.toList()));

        // if i want two element only then use limit
        System.out.println(list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).distinct().sorted().limit(2).collect(Collectors.toList()));

        // if i want  to skip a value then use skip
        System.out.println(list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).distinct().sorted().limit(4).skip(1).collect(Collectors.toList()));

        // using iterator
        Integer integer = Stream.iterate(1, x -> x+1).limit(100).max((a,b)-> a - b).get(); // return the max value 
        System.out.println(integer);

        Integer integer1 = Stream.iterate(1, x -> x+1).limit(100).peek(System.out :: println).max((a,b)-> b - a).get(); // return the min value 
        System.out.println(integer1);

    }
}
