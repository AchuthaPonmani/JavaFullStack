package TASK2;



public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.age = 18;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating objects using both constructors

        Person person1 = new Person("John",20);

        // Displaying details of both persons
        System.out.println("Person 1:");
        person1.display();

    }
}



