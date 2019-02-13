package Lesson21.Thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 20; i > 0; i--) {
            System.out.println(i + "-------" + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
