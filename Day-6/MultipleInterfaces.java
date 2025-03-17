// Interface 1
interface A {
    void show();  
}

// Interface 2
interface B {
    void show();  
}

class C implements A, B {
    public void show() {
        System.out.println("Overriding show() method in Class C");
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();  
    }
}
