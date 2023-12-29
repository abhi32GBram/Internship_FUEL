// House.java
public class House implements Toolbox {
  private int numRooms;

  public House(int initialNumRooms) {
      this.numRooms = initialNumRooms;
  }

  public void addRoom() {
      this.numRooms++;
      System.out.println("Added a room. Total rooms: " + this.numRooms);
  }

  public int getNumRooms() {
      return this.numRooms;
  }
}
