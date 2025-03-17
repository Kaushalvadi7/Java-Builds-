class Student {
    String name;
    int age;

    // Normal constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student original) {
        this.name = original.name;
        this.age = original.age;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("karan", 20);
        Student s2 = new Student(s1); // Creates a new object with the same values

        s2.name = "shyam"; // Changes only s2, not s1

        System.out.println("Original Student: " + s1.name + ", " + s1.age);
        System.out.println("Copied Student: " + s2.name + ", " + s2.age);
    }
}
