// FullTimeEmployee class is a child of the abstract Employee class.
// It represents an employee who gets a fixed monthly salary.
// This class uses Inheritance to get common properties and behavior from Employee.

public class FullTimeEmployee extends Employee {  // Inheritance: extends Employee

    // Specific field for full-time employees — their monthly fixed salary.
    private double monthlySalary;

    // Constructor for FullTimeEmployee class.
    // It takes id, name, and monthly salary as input.
    public FullTimeEmployee(int id, String name, double monthlySalary) {
        // 'super' is used to call the constructor of the parent (Employee) class.
        // Since 'id' and 'name' are declared in the parent class, we use super() to initialize them properly.
        super(id, name);

        // Now, we initialize the unique field for this subclass: monthly salary.
        this.monthlySalary = monthlySalary;
    }

    // Implementation of the abstract method 'calculateSalary()' from Employee class.
    // This is where we define how salary is calculated for a full-time employee.
    // For full-time employees, salary is simply the fixed monthly salary.
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
