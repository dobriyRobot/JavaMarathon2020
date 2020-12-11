package day9.Task2;

public class Rectangle extends Figure{
    private double width;
    private double height;

    public Rectangle(String theColor, double theWidth, double theHeight){
        super(theColor);
        this.width = theWidth;
        this.height = theHeight;
    }

    public double area(){
        double S = width * height;
        return S;
    }
    public double perimeter(){
        double P = (width + height) * 2;
        return P;
    }
}
