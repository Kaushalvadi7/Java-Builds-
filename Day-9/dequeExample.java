import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class dequeExample {
    public static void main(String[] args){

        Queue<String> list = new LinkedList<>();

        list.add("kaushal");
        list.add("karan");
        list.add("kitan");
        list.add("kurnal");
        list.add("kashish");

        System.out.println("List:" + list);
        System.out.println(list.peek());  

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        list.remove("karan");

        System.out.println(list);
    }
}
    

