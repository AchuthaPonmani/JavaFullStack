package Exception;

public class Student {

        private int rollNo;
        private String name;
        private int age;
        private String course;

        // Parameterized constructor with exception handling
        public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
            // Check if age is within the range 15 to 21
            if (age < 15 || age > 21) {
                throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
            }

            // Check if name contains numbers or special symbols
            if (!isValidName(name)) {
                throw new NameNotValidException("Name contains numbers or special symbols.");
            }

            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
            this.course = course;
        }

        // Method to check if name is valid
        private boolean isValidName(String name) {
            return name.matches("[a-zA-Z\\s]+"); // Only letters and spaces allowed
        }

        // Getter methods for rollNo, name, age, and course
        public int getRollNo() {
            return rollNo;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getCourse() {
            return course;
        }

        // Main method for testing
        public static void main(String[] args) {
            try {
                // Creating a Student object
                Student student = new Student(101, "John Doe", 15, "Computer Science");
                System.out.println("Student details:");
                System.out.println("Roll No: " + student.getRollNo());
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Course: " + student.getCourse());
            } catch (AgeNotWithinRangeException | NameNotValidException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Custom exception for age not within range
    class AgeNotWithinRangeException extends Exception {
        public AgeNotWithinRangeException(String message) {
            super(message);
        }
    }

    // Custom exception for invalid name
    class NameNotValidException extends Exception {
        public NameNotValidException(String message) {
            super(message);
}
    }

