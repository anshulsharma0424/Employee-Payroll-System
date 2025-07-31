public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();

        // Creating employees
        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Anshul Sharma", 7000000);
        PartTimeEmployee emp2 = new PartTimeEmployee(102, "Pranav Manapure", 40, 1000);

        // Adding the employees to the payroll-system
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Employee details: ");
        payrollSystem.printEmployees();

        System.out.println("Removing Employees");
        payrollSystem.removeEmployee(102);

        System.out.println("Remaining Employee details: ");
        payrollSystem.printEmployees();
    }
}