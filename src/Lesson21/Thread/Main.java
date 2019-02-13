package Lesson21.Thread;

public class Main {
    public static void main(String[] args) {
        Thread.currentThread().setName("Standart");
        Thread myThread2 = new Thread(new MyThread2());
        myThread2.start();

        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                MyThread myThread = new MyThread();
                myThread.start();
            }
            System.out.println(i + "-------" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
