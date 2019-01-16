package Lesson7;

public class Main {
    public static void main(String[] args) {
        int number1 = Calc.getInt();
        int number2 = Calc.getInt();
        char operator = Calc.getOperation();

        double result = Calc.calc(number1, number2, operator);
        System.out.println("Результат: " + result);
    }
}
