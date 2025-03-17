import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
            HashMap<Integer, String> map = new HashMap<>();
    
            //add
            map.put(1, "John");
            map.put(2, "Raj");
            map.put(3, "Michael");
            map.put(4, "Sara");
    
        
            System.out.println("HashMap Elements: " + map);
    
            // Accessing a value
            System.out.println("Value for key 2: " + map.get(2));

            // Checking if a key exists
            System.out.println("Contains key 3? " + map.containsKey(3));

            // Checking if a value exists
            System.out.println("Contains value Raj? " + map.containsValue("Raj"));

            // Removing a key-value pair
            map.remove(4);
            System.out.println("HashMap after removal: " + map);
    }
}
