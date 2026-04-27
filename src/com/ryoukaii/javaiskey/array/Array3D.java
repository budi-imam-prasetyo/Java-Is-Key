package com.ryoukaii.javaiskey.array;

public class Array3D {
    public Array3D(){
        int [][][] matrix = {
                {
                        {1, 2, 3},
                        {11, 12, 13},
                        {10, 20, 30}
                },
                {
                        {4, 5, 6},
                        {14, 15, 16},
                        {40, 50, 60}
                },
                {
                        {7, 8, 9},
                        {17, 18, 19},
                        {70, 80, 90}
                }
        };

//        indexed for loop
        for (int[][] layer : matrix) {
            for (int[] row : layer) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println();

//        enhanced for loop
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Level " + (i + 1) + ":");
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    System.out.print(matrix[i][j][k] + " ");
                }
            System.out.println();
            }
            System.out.println();
        }
    }
}
