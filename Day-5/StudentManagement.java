class Student {
    String name;
    int rollNumber;
    double marks;

    // Constructor (used to initialize an object)
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        // Creating objects (instances of Student class)
        Student student1 = new Student("karan", 101, 89.5);
        Student student2 = new Student("kartik", 102, 95.0);
        Student student3 = new Student("kaushal", 103, 80.5);
        Student student4 = new Student("kashish", 104, 90.0);



        student1.displayStudentInfo();
        System.out.println("----------------");
        student2.displayStudentInfo();
        System.out.println("----------------");
        student3.displayStudentInfo();
        System.out.println("----------------");
        student4.displayStudentInfo();

    }
}
