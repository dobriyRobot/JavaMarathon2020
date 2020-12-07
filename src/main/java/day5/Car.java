package day5;

public class Car {
    private int yearOfIssue;
    private String color;
    private String model;

    public void setYearOfIssue(int year){
        yearOfIssue = year;
    }
    public int getYearOfIssue(){
        return yearOfIssue;
    }

    public void setColor(String colorCar){
        color = colorCar;
    }
    public String getColor(){
        return color;
    }

    public void setModel(String modelCar){
        model = modelCar;
    }
    public String getModel(){
        return model;
    }
}
