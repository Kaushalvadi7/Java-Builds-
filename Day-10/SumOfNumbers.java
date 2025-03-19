import java.util.*;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 20, 30, 41, 53, 77, 75, 34);

        int sum = numbers.stream().reduce(0, Integer::sum);

        System.out.println("Sum of Numbers: " + sum);
    }
}
