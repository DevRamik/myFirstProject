package Lesson7;

import java.util.Scanner;

public class Calc {
    //Калькулятор
    public static int getInt() {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        String inputNumber = scanner.nextLine();
        char[] inputNumberToChar = inputNumber.toCharArray();
        for (int i = 0; i < inputNumberToChar.length; i++) {
            char currentChar = inputNumberToChar[i];
            if (currentChar != '0' && currentChar != '1' && currentChar != '2' && currentChar != '3'
                    && currentChar != '4' && currentChar != '5' && currentChar != '6'
                    && currentChar != '7' && currentChar != '8' && currentChar != '9') {
                System.out.println("Это не число! Повторите ввод: ");
                return Calc.getInt();
            }
        }
        int number1 = Integer.parseInt(inputNumber);//Преобразование в число
        return number1;
    }

    public static char getOperation() {
        System.out.println("Введите оператор: ");
        Scanner scanner = new Scanner(System.in);
        String inputOperation = scanner.nextLine();
        char[] inputNumberToChar = inputOperation.toCharArray();
        if (inputNumberToChar.length > 1) {
            System.out.println("Это не оператор! Повторите ввод: ");
            return getOperation();
        }

        char currentChar = inputNumberToChar[0];
        if (currentChar != '+' && currentChar != '-' && currentChar != '*' && currentChar != '/') {
            System.out.println("Это не оператор! Повторите ввод: ");
            return Calc.getOperation();
        }
        return currentChar;
    }

    public static double calc(int number1, int number2, char operator) {
        if (operator == '*') {
            return number1 * number2;
        }
        if (operator == '/') {
            return number1 / number2;
        }
        if (operator == '-') {
            return number1 - number2;
        }
        return number1 + number2;
    }


}
