// Parent class
class Bird {
    void sound() {
        System.out.println("Birds make sounds");
    }
}

// Child class
class Sparrow extends Bird {
    @Override
    void sound() {
        System.out.println("Sparrow chirps");
    }
}

// Child class
class Owl extends Bird {
    @Override
    void sound() {
        System.out.println("Owl hoots");
    }
}

// Main class
public class MethodOverriding {
    public static void main(String[] args) {
        Bird myBird = new Sparrow();
        myBird.sound();  

        myBird = new Owl();
        myBird.sound();  
       }
}
