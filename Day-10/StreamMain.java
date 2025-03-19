
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
public static void main(String[] args) {
    
    List<Integer> list = List.of(2,3,34,54,11,51,77,7,93,1,5);

    List<Integer> list2 = new ArrayList<>();
    list2.add(5);
    list2.add(56);
    list2.add(52);
    list2.add(51);
    list2.add(57);
    list2.add(2);
    list2.add(1);
    list2.add(7);
    list2.add(70);

    //without Stream
    System.out.println("Filter Even Number without Stream");
    List<Integer> EvenList = new ArrayList<>();

    for (Integer i : list) {
        if(i% 2 == 0){
            EvenList.add(i);
        }
    }
    System.out.println("Original List:" + list);
    System.out.println("EvenList:"+ EvenList);
    System.out.println(" ");

    System.out.println("Filter Even Number using Stream");
    List<Integer> Evenlist = list.stream().filter(i->i%2 ==0).collect(Collectors.toList());

    System.out.println("EvenList:" + Evenlist);
    System.out.println(" ");

    System.out.println("Filter Number Greater then 50 using Stream");
    List<Integer> newlist = list2.stream().filter(i-> i>50).collect(Collectors.toList());
    System.out.println("Original List2:" + list2);
    System.out.println("OutputList:" + newlist); 
}
}