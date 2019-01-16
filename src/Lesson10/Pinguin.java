package Lesson10;

public class Pinguin extends Animal {
    @Override
    public void print() {
        System.out.println(" Pinguin: name - " + this.getName() + " " + " cost " + this.getCost());
    }
}
