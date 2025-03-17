import java.util.*;

class Employee implements Comparable<Employee> { 
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    public String toString() {
        return id + " - " + name + " - Salary:" + salary;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Ajay", 50000));
        employees.add(new Employee(102, "Bharat", 60000));
        employees.add(new Employee(103, "Karan", 45000));
        employees.add(new Employee(103, "Kirtan", 75000));
        employees.add(new Employee(103, "Kiren", 55000));

        Collections.sort(employees);

        System.out.println("Sorted Employees by Salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Filtering without Streams
        System.out.println("\nEmployees with Salary > 50k:");
        for (Employee emp : employees) {
            if (emp.salary > 50000) {
                System.out.println(emp);
            }
        }
    }
}
