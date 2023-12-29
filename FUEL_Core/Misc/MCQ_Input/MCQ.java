import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Who was the first man to set foot on the moon?");
       System.out.println("A. Neil Armstrong");
       System.out.println("B. Buzz Aldrin");
       System.out.println("C. Michael Collins");
       System.out.println("D. John Glenn");
       System.out.println("E. Yuri Gagarin");
       System.out.println("F. Charles Lindbergh");
       System.out.println("Enter your choice (A-F): ");
       String choice = scanner.nextLine();

       switch(choice) {
           case "A":
               System.out.println("Correct! Neil Armstrong was the first man to set foot on the moon.");
               break;
           case "B":
               System.out.println("Incorrect. Buzz Aldrin was the second man to land on the moon.");
               break;
           case "C":
               System.out.println("Incorrect. Michael Collins remained in lunar orbit.");
               break;
           case "D":
               System.out.println("Incorrect. John Glenn was the first American to orbit the Earth, but he did not land on the moon.");
               break;
           case "E":
               System.out.println("Incorrect. Yuri Gagarin was the first man to orbit the Earth, but he did not land on the moon.");
               break;
           case "F":
               System.out.println("Incorrect. Charles Lindbergh was the first man to fly solo across the Atlantic Ocean, but he did not land on the moon.");
               break;
           default:
               System.out.println("Invalid choice.");
               break;
       }
   }
}