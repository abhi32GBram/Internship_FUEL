public class Main {
  // This is the main method, which is the entry point of the program
  public static void main(String[] args) {
      // Call the printDetails function with a Student object
      Student student = new Student("John", "Doe", 20);
      printDetails(student);
  }

  // This is a function that prints the details of a Student object
  public static void printDetails(Student student) {
      System.out.println("Name: " + student.getName());
      System.out.println("Surname: " + student.getSurname());
      System.out.println("Age: " + student.getAge());
  }
}

// This is a Student class with a name, surname, and age
class Student {
  private String name;
  private String surname;
  private int age;

  public Student(String name, String surname, int age) {
      this.name = name;
      this.surname = surname;
      this.age = age;
  }

  public String getName() {
      return name;
  }

  public String getSurname() {
      return surname;
  }

  public int getAge() {
      return age;
  }
}