//Imagine a Storage Box that can hold different types of items. Instead of creating separate boxes for Integer, String, or Double, we use generics.

// Generic Storage Box
class Storage<T> {  // <T> is a type parameter
    private T item;

    public void add(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

public class GenericExample {
    public static void main(String[] args) {
        Storage<String> stringBox = new Storage<>();
        stringBox.add("Laptop");
        System.out.println("Stored: " + stringBox.get());

        Storage<Integer> intBox = new Storage<>();
        intBox.add(100);
        System.out.println("Stored: " + intBox.get());
    }
}
