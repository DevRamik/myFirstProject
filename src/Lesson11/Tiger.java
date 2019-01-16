package Lesson11;

public class Tiger extends Animal {

    @Override
    public void voice() {
        System.out.println("Rrrrrrrrr");
    }

    @Override
    public void run() {
        System.out.println("Tiger is running");
    }

    @Override
    public void jump() {
        System.out.println("Tiger is jumping");
    }
}
