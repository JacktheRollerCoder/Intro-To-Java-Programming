/** 8.29 (IDENTICAL ARRAYS) The two-dimensional arrays m1 and m2 are identical if they have the same contents.
 * Write a method that returns true if m1 and m2 are identical, using the following header: */

//public static boolean equals(int[][] m1, int[][] m2);

// Write a test program that prompts the user to enter two 3 × 3 arrays of integers and displays whether the two are identical.
//remember to use two multidimensional arrays!

import java.util.Scanner;

public class ProgramAssignment3_M01 {

    // Check if two 2D arrays are identical
    public static boolean equals(int[][] m1, int[][] m2) {
        // Check if both matrices have the same dimensions
        if (m1.length != m2.length) {
            return false;
        }
        for (int i = 0; i < m1.length; i++) {
            if (m1[i].length != m2[i].length) {
                return false;
            }
        }

        // Compare corresponding elements in both matrices
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize two 3x3 matrices
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];

        // Prompt user to enter values for matrix1
        System.out.println("Enter values for matrix1 (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        // Prompt user to enter values for matrix2
        System.out.println("Enter values for matrix2 (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        // Check if the matrices are identical
        if (equals(matrix1, matrix2)) {
            System.out.println("The two arrays are identical.");
        } else {
            System.out.println("The two arrays are not identical.");
        }

        input.close();
    }
}
