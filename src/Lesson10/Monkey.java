package Lesson10;

public class Monkey extends Animal {
    @Override
    public void print() {
        System.out.println(" Monkey: name - " + this.getName() + " " + " cost " + this.getCost());
    }
}
