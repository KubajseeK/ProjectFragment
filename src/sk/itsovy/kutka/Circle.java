package sk.itsovy.kutka;

public class Circle {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double calcArea() {
        return Math.PI * r * r;
    }

    public double calcPerimeter() {
        return 2 * Math.PI * r;
    }


}
