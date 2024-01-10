//package com.Jan8.ArrayRotation;
//
//public class Teste extends rotateLeft {
//    public static void main(String[] args) {
//
//        int[] arrr = {1, 3, 5, 3, 6, 7};
//
//        rotateLeft(arrr, 1); // Rotate by 1 position
//        printArray(arrr); // Print the array
//
//        rotateLeft(arrr, 2); // Rotate by 2 positions
//        printArray(arrr); // Print the array
//
//        rotateLeft(arrr, 3); // Rotate by 3 positions
//        printArray(arrr); // Print the array
//    }
//
//    // Method to print an array
//    private static void printArray(int[] arr) {
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }
//}

package com.Jan8.ArrayRotation;

public class Teste extends rotateLeft {
    public static void main(String[] args) {

        char[] arrr = {'a', 'b', 'c', 'd', 'e', 'f'};

        rotateLeft(arrr, 1); // Rotate by 1 position
        printArray(arrr); // Print the array

        rotateLeft(arrr, 2); // Rotate by 2 positions
        printArray(arrr); // Print the array

        rotateLeft(arrr, 3); // Rotate by 3 positions
        printArray(arrr); // Print the array
    }

    // Method to print an array
    private static void printArray(char[] arr) {
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
