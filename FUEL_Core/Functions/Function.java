public class Main {
   // This is the main method, which is the entry point of the program
   public static void main(String[] args) {
       // Call the sayHello function
       sayHello();

       // Call the add function and print the result
       int result = add(5, 7);
       System.out.println("The sum is: " + result);

       // Call the doubleValue function and print the result
       int doubled = doubleValue(5);
       System.out.println("Doubled value is: " + doubled);

       // Create a Function object and call it
       Function<String, Integer> func = x -> x.length();
       int length = func.apply("Hello, World!");
       System.out.println("The length of the string is: " + length);
   }

   // This is a function that prints a greeting
   public static void sayHello() {
       System.out.println("Hello, World!");
   }

   // This is a function that adds two integers
   public static int add(int a, int b) {
       return a + b;
   }

   // This is a function that doubles an integer
   public static int doubleValue(int a) {
       return a * 2;
   }
}