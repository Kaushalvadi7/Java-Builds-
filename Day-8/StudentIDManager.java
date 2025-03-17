import java.util.HashSet;

public class StudentIDManager {
    public static void main(String[] args) {
        HashSet<Integer> studentIDs = new HashSet<>();

        studentIDs.add(101);
        studentIDs.add(102);
        studentIDs.add(103);
        studentIDs.add(104);
        studentIDs.add(101);  // Duplicate entry ignored
        System.out.println("Student IDs: " + studentIDs);

        studentIDs.remove(104);
        System.out.println("Student IDs after remove: " + studentIDs);
        
        System.out.println("Contains 101 Id?:" + studentIDs.contains(101));

        studentIDs.clear();
        System.out.println("Student IDs after clear: " + studentIDs);

    }
}
