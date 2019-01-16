package Lesson5;

import java.util.Scanner;

public class ConsoleUtils {

    //Метод
    public static void printPrivetByNumber() {
        System.out.println("Введите число: ");

        //Объект (создание)

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        for (int i = 0; i < inputNumber; i++) {
            System.out.println("Привет");
        }
    }
}
