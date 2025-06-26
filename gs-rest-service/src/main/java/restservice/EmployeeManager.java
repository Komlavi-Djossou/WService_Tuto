package restservice;
import java.util.Arrays;


public class EmployeeManager {
    public static Employees getEmployees() {
        Employees employees = new Employees();
        employees.setEmployeeList(Arrays.asList(
                new Employee(1, "John", "Doe", "john.doe@example.com", "Software Engineer"),
                new Employee(2, "Jane", "Smith", "jane.smith@example.com", "Product Manager"),
                new Employee(3, "Alice", "Brown", "alice.brown@example.com", "QA Analyst")
            ));
            return employees;
        }
}

