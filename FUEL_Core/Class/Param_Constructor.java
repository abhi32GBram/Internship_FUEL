public class Student {
 // Define fields
 private String name;
 private int age;

 // This is the default constructor
 public Student() {
     this.name = "Unknown";
     this.age = 0;
 }

 // This is a parameterized constructor
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