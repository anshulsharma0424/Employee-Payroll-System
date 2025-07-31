import java.util.ArrayList;
import java.util.Iterator;

public class PayrollSystem {

    private ArrayList<Employee> employees;  // Stores employee objects

    public PayrollSystem() {
        employees = new ArrayList<>();
    }

    // Adds a new employee to the list
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Removes an employee by ID (fixed: now uses Iterator to avoid ConcurrentModificationException)
    public void removeEmployee(int id) {
        Iterator<Employee> iterator = employees.iterator();
        boolean removed = false;

        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                iterator.remove();
                removed = true;
                System.out.println("Employee with ID " + id + " removed.");
                break;
            }
        }

        if (!removed) {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    // Prints details of all employees
    public void printEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee); // Calls overridden toString()
            }
        }
    }
}
