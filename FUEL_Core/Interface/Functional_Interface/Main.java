// Main.java
public class Main {
   public static void main(String[] args) {
       MyFunctionalInterface obj = x -> x * x;
       System.out.println(obj.myMethod(5)); // Outputs: 25
   }
}
