public class Array2D {
    public Array2D(){
        int [][] matrix = {
                {1, 2, 3},
                {11, 12, 13},
                {10, 20, 30}
        };

//        indexed for loop
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println();

//        enhanced for loop
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
