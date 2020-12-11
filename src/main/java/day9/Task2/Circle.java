package day9.Task2;

public class Circle extends Figure {
    private double radius;

    public Circle(String theColor, double theRadius) {
        super(theColor);
        this.radius = theRadius;
    }

    public double area() {
        double S = Math.PI * Math.pow(radius, 2);
        return S;
    }

    public double perimeter() {
        double P = 2 * Math.PI * radius;
        return P;
    }

}
