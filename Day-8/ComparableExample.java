import java.util.*;

class Employee implements Comparable<Employee> {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee e) {
        return Integer.compare(this.age, e.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>();

        employees.add(new Employee("Karan", 22));
        employees.add(new Employee("Raj", 20));
        employees.add(new Employee("Chetan", 25));

        for (Employee e : employees) {
            System.out.println(e.name + " - " + e.age);
        }
    }
}
