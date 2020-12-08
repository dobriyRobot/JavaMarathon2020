package day6;

public class Motorbike {
    private int yearOfIssue;
    private String color;
    private String model;

    public Motorbike(int year, String theColor, String theModel) {
        this.yearOfIssue = year;
        this.color = theColor;
        this.model = theModel;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int  yearDifference(int inputYear) {
        int result = this.yearOfIssue - inputYear;
        if(result > 0){
            return result;
        } else {
            result = 0;
        }
        return result;
    }
}
