package day6;

public class Car {
    private int yearOfIssue;
    private String color;
    private String model;

    public void setYearOfIssue(int year) {
        yearOfIssue = year;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setColor(String colorCar) {
        color = colorCar;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String modelCar) {
        model = modelCar;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        int result = this.yearOfIssue - inputYear;
        if(result > 0){
            return result;
        } else {
            result = Math.abs(result);
        }
        return result;
    }
}
