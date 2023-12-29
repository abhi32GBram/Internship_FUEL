// Define a class named Category
class Category {
  // Declare an integer variable cId
  int cId;
  // Declare a String variable cName
  String cName;
  // Declare a double variable cDouble
  double cDouble;
  // Declare a float variable cFloat
  float cFloat;
  // Declare a short variable cShort
  short cShort;
  // Declare a byte variable cByte
  byte cByte;
  // Declare a boolean variable cBool
  boolean cBool;

  // Main method where execution begins
  public static void main(String[] args) {

      // Create an object of Category
      Category obj1 = new Category();

      // Print the value of cName
      System.out.println("Value of cName is : " + obj1.cName);
      // Print the value of cId
      System.out.println("Value of cId is : " + obj1.cId);
      // Print the value of cShort
      System.out.println("Value of cShort is : " + obj1.cShort);
      // Print the value of cDouble
      System.out.println("Value of cDouble is : " + obj1.cDouble);
      // Print the value of cShort again
      System.out.println("Value of cShort is : " + obj1.cShort);
      // Print the value of cFloat
      System.out.println("Value of cFloat is : " + obj1.cFloat);
      // Print the value of cBool
      System.out.println("Value of cBool is : " + obj1.cBool);
      // Print the value of cByte
      System.out.println("Value of cByte is : " + obj1.cByte);
  }
}