// PartTimeEmployee is a subclass of the abstract class Employee.
// It represents an employee who is paid based on the number of hours worked and their hourly rate.
// This class also demonstrates Inheritance and Polymorphism.

public class PartTimeEmployee extends Employee {

    // Fields specific to part-time employees
    private int hoursWorked;    // Total number of hours the employee has worked
    private double hourlyRate;  // Payment rate per hour

    // Constructor for PartTimeEmployee
    // It initializes the common properties using the parent class constructor (via 'super'),
    // and the specific properties directly.
    public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        // Call to parent class constructor to set 'id' and 'name'
        super(id, name);

        // Set subclass-specific values
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Overriding the abstract method 'calculateSalary' from the Employee class
    // Here, salary is calculated based on hours worked multiplied by hourly rate
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
