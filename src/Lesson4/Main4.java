package Lesson4;

public class Main4 {
    public static void main(String[] args) throws Exception {
        for (int day = 1; day < 366; day++) {
            for (int hour = 0; hour < 24; hour++) {
                for (int minute = 0; minute < 60; minute++) {
                    for (int second = 0; second < 60; second++) {
                        System.out.println("От старта прошло: " + day + " дней, " + hour + " часов " + minute + " минут " + second +
                                " секунд ");
                        Thread.sleep(1000);

                    }
                }
            }
        }
    }
}
