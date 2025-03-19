import java.util.*;
import java.util.stream.*;

public class TerminalExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evenSquares = numbers.stream()
        .filter(n -> n % 2 == 0) // Intermediate
        .map(n -> n * n)         // Intermediate
        .collect(Collectors.toList()); // Terminal

        System.out.println(evenSquares);
    }
}
