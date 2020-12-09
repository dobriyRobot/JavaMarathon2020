package day8;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private int weight;
    private int fuel;

    public Airplane(String theProducer, int theYear, double theLength, int theWeight){
        this.producer = theProducer;
        this.year = theYear;
        this.length = theLength;
        this.weight = theWeight;
        this.fuel = 0;
    }

    public String toString(){
        return "Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length +
                ", вес: " + weight + ", количество топлива в баке: " + fuel;
    }

    void setProducer(String theProducer){
        producer = theProducer;
    }
    void setYear(int theYear){
        year = theYear;
    }
    void setLength(double theLength){
        length = theLength;
    }
    void setWeight(int theWeight){
        weight = theWeight;
    }
    void setFuel(int theFuel){
        fuel = theFuel;
    }
    public int getFuel(){
        return fuel;
    }
    void info (){
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length +
                ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }
    void fillUp (int n){
        fuel = fuel + n;
    }
}
