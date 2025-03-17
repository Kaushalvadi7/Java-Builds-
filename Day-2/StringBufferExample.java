public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // 1. Append
        sb.append(" World");
        System.out.println("After Append: " + sb);

        // 2. Insert
        sb.insert(6, "Java ");
        System.out.println("After Insert: " + sb);

        // 3. Replace
        sb.replace(6, 10, "C++");
        System.out.println("After Replace: " + sb);

        // 4. Delete
        sb.delete(6, 10);
        System.out.println("After Delete: " + sb);

        // 5. Reverse
        sb.reverse();
        System.out.println("After Reverse: " + sb);
    }
}
