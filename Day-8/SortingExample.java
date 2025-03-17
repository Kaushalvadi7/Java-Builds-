import java.util.TreeSet;

public class SortingExample {
    public static void main(String[] args) {
        TreeSet<String> items = new TreeSet<>();

        items.add("Apple");
        items.add("apple");
        items.add("Banana");
        items.add("123");
        items.add("!Special");

        System.out.println("Sorted Items: " + items);
    }
}
