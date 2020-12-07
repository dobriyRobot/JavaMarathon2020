package day5;

public class Motorbike {
    private int yearOfIssue;
    private String color;
    private String model;

    public Motorbike(int year, String theColor, String theModel){
        this.yearOfIssue = year;
        this.color = theColor;
        this.model = theModel;
    }

    public int getYearOfIssue(){
        return yearOfIssue;
    }
    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
}
