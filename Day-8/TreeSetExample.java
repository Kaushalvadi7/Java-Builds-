import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(20);


        System.out.println("TreeSet Elements: " + treeSet);

        System.out.println("First Element: " + treeSet.first());
        System.out.println("Last Element: " + treeSet.last());
        
        
        // Remove
        treeSet.remove(30);
        System.out.println("TreeSet after removal: " + treeSet);
        
        treeSet.clear();
        System.out.println("TreeSet After clear: " + treeSet);
    }
}
