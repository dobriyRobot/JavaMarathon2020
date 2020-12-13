package day9.Task2;

public abstract class Figure {
    private String color;

    public Figure(String theColor) {
        this.color = theColor;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();

    public abstract double perimeter();

}
