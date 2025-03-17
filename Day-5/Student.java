class Student {
    String name;
    int age;

    // Constructor with no parameters
    Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with one parameter
    Student(String name) {
        this.name = name;
        this.age = 18;  // Default age
    }
    // Constructor with two parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();               // Calls the no-arg constructor
        Student s2 = new Student("Ajay");        // Calls the constructor with one argument
        Student s3 = new Student("jay", 22);      // Calls the constructor with two arguments
        s1.display();
        s2.display();
        s3.display();
    }
}
