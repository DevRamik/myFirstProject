package Lesson6;

public class TestMatrix {
    public static void main(String[] args) {
       int [][] matrix = new int[4][5] ;
       int [][] resultFill =  MatrixUtils.fillMatrix(matrix, 7);

       MatrixUtils.matrixToConsole(resultFill);
       MatrixUtils.printMainDiagonal(resultFill);
       MatrixUtils.printMainDiagonal(resultFill);
       int resultGet = MatrixUtils.getIndexOfMassive(resultFill, 0, 3);
       System.out.println(resultGet);
    }
}
