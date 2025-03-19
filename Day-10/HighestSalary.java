import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class HighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("kaushal", 95000),
            new Employee("Bharat", 55000),
            new Employee("Champak", 60000),
            new Employee("uday", 70000),
            new Employee("sachin", 65000)
        );

        Employee highestPaid = employees.stream()
            .reduce(employees.get(0), (e1, e2) -> e1.salary > e2.salary ? e1 : e2);

        System.out.println("Highest Paid Employee: " + highestPaid.name + " - " + highestPaid.salary);
    }
}
