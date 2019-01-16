package Lesson11.Domashnie;

public class Circle implements IFigura {

    private int radius;

    public Circle() {

    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double ploshad() {
        return 0;
    }

    @Override
    public double perimetr() {
        return 0;
    }

    @Override
    public void printToConsole() {

    }
}
