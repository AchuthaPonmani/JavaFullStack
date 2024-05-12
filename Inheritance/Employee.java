package Inheritance;



    public class Employee extends Person {
        private int employeeID;
        private double salary;

        // Constructor for Employee class using super keyword
        public Employee(String name, int age, int employeeID, double salary) {
            super(name, age);
            this.employeeID = employeeID;
            this.salary = salary;
        }

        // Getter methods for employeeID and salary
        public int getEmployeeID() {
            return employeeID;
        }

        public double getSalary() {
            return salary;
        }

        // Main method for testing
        public static void main(String[] args) {
            // Creating an Employee object
            Employee employee = new Employee("John", 30, 1001, 50000.0);

            // Displaying employee details
            System.out.println("Employee Details:");
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Employee ID: " + employee.getEmployeeID());
            System.out.println("Salary: $" + employee.getSalary());
        }
    }

