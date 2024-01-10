//package com.Jan8.ArrayRotation;
//
//public class rotateLeft {
//    public static void rotateLeft(int[] arr, int d) {
//        // Get the length of the array
//        int n = arr.length;
//
//        // Loop for the number of rotations
//        for (int i = 0; i < d; i++) {
//            // Store the first element of the array in a temporary variable
//            int temp = arr[0];
//
//            // Shift the rest of the elements in the array by one place
//            System.arraycopy(arr, 1, arr, 0, n - 1);
//
//            // Update the last index of the array with the temporary variable
//            arr[n - 1] = temp;
//        }
//        // Test the rotateLeft method with an array of integers
//    }
//}


package com.Jan8.ArrayRotation;

public class rotateLeft {
    public static void rotateLeft(char[] arr, int d) {
        // Get the length of the array
        int n = arr.length;

        // Loop for the number of rotations
        for (int i = 0; i < d; i++) {
            // Store the first element of the array in a temporary variable
            char temp = arr[0];

            // Shift the rest of the elements in the array by one place
            System.arraycopy(arr, 1, arr, 0, n - 1);

            // Update the last index of the array with the temporary variable
            arr[n - 1] = temp;
        }
    }
}
