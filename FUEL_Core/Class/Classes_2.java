// Define a class named "Student"
public class Student {
   // Define fields
   private String name;
   private int age;

   // Define a constructor
   public Student(String name, int age) {
       this.name = name;
       this.age = age;
   }

   // Define methods
   public String getName() {
       return name;
   }

   public int getAge() {
       return age;
   }
}

// Define the main class
public class Main {
   // This is the main method, which is the entry point of the program
   public static void main(String[] args) {
       // Create an object of the Student class
       Student student = new Student("John", 20);

       // Use the object to access the fields and methods of the Student class
       System.out.println("Name: " + student.getName());
       System.out.println("Age: " + student.getAge());
   }
}