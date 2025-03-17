import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Kaushal");
        names.add("kashish");
        names.add("karan");

        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            String name = itr.next();
            if (name.equals("karan")) {
                itr.remove();  
            }
        }

        System.out.println(names);  
    }
}
