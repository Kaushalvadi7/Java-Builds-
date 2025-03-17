import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number for you want to start");
        int startnum = scanner.nextInt();
        System.out.println("Enter the number you want to end");
        int endnum = scanner.nextInt();


        for (int i = startnum; i <= endnum; i++) {
            System.out.println(i);
        }
    }
}
