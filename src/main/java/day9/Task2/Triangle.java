package day9.Task2;

public class Triangle extends Figure {
    private double widthA;
    private double widthB;
    private double widthC;

    public Triangle(String theColor, double theWidthA, double theWidthB, double theWidthC) {
        super(theColor);
        this.widthA = theWidthA;
        this.widthB = theWidthB;
        this.widthC = theWidthC;
    }

    public double area() {
        double p = (widthA + widthB + widthC) / 2;
        double S = Math.sqrt((p * (p - widthA) * (p - widthB) * (p - widthC)));
        return S;
    }

    public double perimeter() {
        double P = widthA + widthB + widthC;
        return P;
    }
}
