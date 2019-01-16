package Lesson6;

public class Main {
    public static void main(String[] args) {
        int[][] massive = {{1, 2, 7}, {5, 3, 2}, {2, 1, 3}};//Двумерный массив - создание
        //Строчка двумерного массива
        for (int i = 0; i < massive.length; i++) {
            //Столбец двумерного массива
            for (int j = 0; j < massive[i].length; j++) {
                if (i == j) {
                    System.out.print(massive[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();

        }

    }
}
