package Lesson22;

public class Baskov extends Thread {
    private boolean stop = false;

    @Override
    public void run() {
        int count = 0;
        while (!stop) {
            for (int i = 0; i < 3; i++) {
                System.out.println("-----------la-la-la");
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count++;
            if (count == 3) {
                stop = true;
            }
            synchronized (Monitors.MIC) {
                Monitors.MIC.notify();
            }
            synchronized (Monitors.MIC) {
                try {
                    Monitors.MIC.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
