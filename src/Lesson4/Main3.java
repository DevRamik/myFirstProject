package Lesson4;

public class Main3 {
    public static void main(String[] args) {
        int cash = 10000;
        int procent = 9;
        int year = 7;

        for (int i = 0; i < year; i++) {
            cash = cash + (cash / 100 * procent);
            System.out.println(cash);
        }
    }
}
