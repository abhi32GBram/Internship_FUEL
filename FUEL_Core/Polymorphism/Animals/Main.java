// Main.java
public class Main {
  public static void main(String[] args) {
      Animal myAnimal = new Dog();
      myAnimal.sound(); // Outputs: Dog barks

      myAnimal = new Cat();
      myAnimal.sound(); // Outputs: Cat meows
  }
}
