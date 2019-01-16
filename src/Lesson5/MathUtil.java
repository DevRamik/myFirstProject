package Lesson5;

public class MathUtil {
    //Метод
    public static int summa(int chislo1, int chislo2) {

        //Модификатор доступа  + статичность + возвращаемый тип (void - ничего не возвращает)

        int summa = chislo1 + chislo2;
        return summa;
    }

    //Метод
    public static int commonDivisor(int divisor1, int divisor2) {
        for (int i = 1; i < divisor1 * divisor2; i++) {
            if (i % divisor1 == 0 && i % divisor2 == 0) {
                return i;
            }
        }
        return divisor1 * divisor2;
    }
}