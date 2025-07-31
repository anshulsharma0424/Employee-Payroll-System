// Abstract class 'Employee' represents the common structure and behavior of all employee types.
// It helps achieve Abstraction by hiding the implementation details of salary calculation.
// Only subclasses will define how salary is calculated for each type of employee.

abstract class Employee {

    // Private instance variables to store employee id and name.
    // These fields are kept private to follow the principle of Encapsulation (data hiding).
    private int id;
    private String name;

    // Constructor to initialize 'Employee' object with id and name.
    // This will be called from subclass constructors using 'super()'.
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Public getter method to return employee id.
    // Getter provides controlled access to private field 'id'.
    public int getId() {
        return id;
    }

    // Public getter method to return employee name.
    // This also follows encapsulation — direct access is not allowed.
    public String getName() {
        return name;
    }

    // Abstract method 'calculateSalary' is declared here but implemented in subclasses.
    // This enables runtime Polymorphism: method name is same but the method behavior will differ based on the object type.
    public abstract double calculateSalary();

    // Overriding the toString() method from the Object class to provide a readable string representation of Employee.
    // This also demonstrates Polymorphism (method overriding).
    // When we print an Employee object, this method is called automatically.
    @Override
    public String toString() {
        // Note: 'calculateSalary()' here will call the version defined in the subclass (dynamic method dispatch).
        return  "Employee [id= " + id + ", name= " + name + ", salary= " + calculateSalary() + "]";
    }
}
