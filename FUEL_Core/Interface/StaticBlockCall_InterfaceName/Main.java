// Main.java
public class Main {
  public static void main(String[] args) {
      // Create a new house with 2 rooms
      House myHouse = new House(2);

      // Add a room to the house
      myHouse.addRoom();

      // Print the total number of rooms
      System.out.println("Total rooms in the house: " + myHouse.getNumRooms());

      // Call the static method using the interface name
      Toolbox.fixNail();
  }
}
