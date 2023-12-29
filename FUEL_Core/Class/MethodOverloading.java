class Test {
   public static void main(String[] args) {
       System.out.println("This is the Test Class - Overloading Begins Here ");
       main(10);   
       main("cum");
   }

   public static void main(int a) {
       System.out.println("This is the overloaded integer variable");
   }

   public static void main(String a) {
       System.out.println("This is the overloaded String variable");
   }  
}