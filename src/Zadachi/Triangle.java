package Zadachi;

import java.util.Scanner;

public class Triangle {

    //Метод - нахождения площади треугольника
    public static int area(int a, int b, int c) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сторону A: ");
        a = scanner.nextInt();
        System.out.println("Введите сторону B: ");
        b = scanner.nextInt();
        System.out.println("Введите сторону C: ");
        c = scanner.nextInt();

        int p = (a + b + c) / 2;
        int square = (p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь треугольника равна: " + square);
        return p;
    }
}
