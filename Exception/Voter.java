package Exception;

public class Voter {

        private int voterId;
        private String name;
        private int age;

        // Parameterized constructor with checked exception
        public Voter(int voterId, String name, int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Invalid age for voter.");
            }
            this.voterId = voterId;
            this.name = name;
            this.age = age;
        }

        // Getter methods for voterId, name, and age
        public int getVoterId() {
            return voterId;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        // Main method for testing
        public static void main(String[] args) {
            try {
                // Creating a Voter object
                Voter voter = new Voter(101, "John", 17);
                System.out.println("Voter details:");
                System.out.println("Voter ID: " + voter.getVoterId());
                System.out.println("Name: " + voter.getName());
                System.out.println("Age: " + voter.getAge());
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Custom checked exception class for invalid age
    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
}
    }

