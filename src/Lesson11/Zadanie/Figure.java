package Lesson11.Zadanie;

public abstract class Figure implements IFigures {
    private double side;
    private double square;
    private double perimetr;

    public Figure() {

    }

    public double getSide() {
        return this.side;
    }

    public double getSquare() {
        return this.square;
    }

    public double getPerimetr() {
        return this.perimetr;
    }

    public void setSide() {
        this.side = side;
    }

    public void setSquare() {
        this.square = square;
    }

    public void setPerimetr() {
        this.perimetr = perimetr;
    }
}
