package Lesson11.Domashnie;

public class Triangle implements IFigura {

    private int ab;
    private int bc;
    private int ac;

    public Triangle() {

    }

    public Triangle(int ab, int bc, int ac) {
        this.ab = ab;
        this.bc = bc;
        this.ac = ac;

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
