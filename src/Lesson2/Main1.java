package Lesson2;

public class Main1 {
    public static void main(String[] args) {
        int tour = 1000;
//        int salary = 200;
        int rest = 50;
        int month = 5;

        boolean tourBuy = tour < (rest * month)  && tour < 2000;

        if (tourBuy == true) {
            System.out.println("Купим");
        } else {
            System.out.println("Не купим");
        }

    }
}
