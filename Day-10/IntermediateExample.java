import java.util.*;
import java.util.stream.*;

public class IntermediateExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Stream<Integer> evenNumbers = numbers.stream()
        .filter(n -> n % 2 == 0) 
        .map(n -> n * n);
        System.out.println("Intermediate operations won't execute until a terminal operation is applied.");
        System.out.println(evenNumbers);

        
    }
}
