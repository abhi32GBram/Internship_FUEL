// Define a class named "StudentProfile"
public class StudentProfile {
   // Declare instance variables
   String firstName;
   String lastName;
   String declaredMajor;
   double gpa;
   int expectedYearToGraduate;

   // Define a constructor that initializes the instance variables
   public StudentProfile(String firstName, String lastName,
                        String declaredMajor, double gpa, int expectedYearToGraduate) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.declaredMajor = declaredMajor;
       this.gpa = gpa;
       this.expectedYearToGraduate = expectedYearToGraduate;
   }

   // Define a method that increments the expected graduation year by 1
   public void incrementExpectedGraduationYear() {
       this.expectedYearToGraduate = this.expectedYearToGraduate + 1;
   }
}

// Define the main class
public class Main {
   // This is the main method, which is the entry point of the program
   public static void main(String[] args) {
       // Create instances of the StudentProfile class
       StudentProfile profileOne = new StudentProfile("Sally", "Salmon", "Film", 3.75, 2022);
       StudentProfile profileTwo = new StudentProfile("Max", "Tiffen", "Computer Science", 3.45, 2021);

       // Call the incrementExpectedGraduationYear method on profileTwo
       profileTwo.incrementExpectedGraduationYear();

       // Print the expected graduation year of profileTwo
       System.out.println(profileTwo.expectedYearToGraduate);
   }
}