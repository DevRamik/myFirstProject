package Lesson6;

public class MatrixUtils {
    public static int[][] fillMatrix(int[][] matrix, int number) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = number;
            }
        }
        return matrix;
    }

    public static void matrixToConsole(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            //Столбец двумерного массива
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void printMainDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            //Столбец двумерного массива
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();
        }
    }

    public static int getIndexOfMassive(int[][] number, int indexStr, int indexRow) {

        return number[indexStr][indexRow];
    }

    /*public static int getMassiveSumma(int[][] matrix) {
        if () {
        }
    }*/
}

