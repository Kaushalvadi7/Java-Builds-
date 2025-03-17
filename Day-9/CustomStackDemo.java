import java.util.ArrayList;

class CustomStack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        if (!stack.isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return null; // Stack is empty
    }

    public void display() {
        System.out.println(stack);
    }
}

public class CustomStackDemo {
    public static void main(String[] args) {
        CustomStack<String> stack = new CustomStack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        stack.display();
        stack.pop();
        stack.display();
    }
}

