package Lesson22;

public class Vedushii {
    public static void main(String[] args) {
        System.out.println("Сейчас начнётся концерт");
        Baskov baskov = new Baskov();
        Mikhailov mikhailov = new Mikhailov();
        mikhailov.setDaemon(true);

        baskov.start();
        mikhailov.start();

        while (baskov.isAlive()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Концерт закончен........");
    }
}
