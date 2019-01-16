package Lesson10;

public class Lion extends Animal {
    @Override
    public void print() {
        System.out.println(" Lion: name - " + this.getName() + " " + " cost " + this.getCost());
    }
}
