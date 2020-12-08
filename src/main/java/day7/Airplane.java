package day7;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private int weight;
    private int fuel;

    public Airplane(String theProducer, int theYear, double theLength, int theWeight) {
        this.producer = theProducer;
        this.year = theYear;
        this.length = theLength;
        this.weight = theWeight;
        this.fuel = 0;
    }

    void setProducer(String theProducer) {
        producer = theProducer;
    }

    void setYear(int theYear) {
        year = theYear;
    }

    void setLength(double theLength) {
        length = theLength;
    }

    void setWeight(int theWeight) {
        weight = theWeight;
    }

    void setFuel(int theFuel) {
        fuel = theFuel;
    }

    public int getFuel() {
        return fuel;
    }

    public double getLength(){
        return length;
    }
    public String getProducer(){
        return producer;
    }

    void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length +
                ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    void fillUp(int n) {
        fuel = fuel + n;
    }

    public static void compareAirplanes(Airplane air1, Airplane air2) {
        double lengthAir1 = air1.getLength();
        double lengthAir2 = air2.getLength();
        if(lengthAir1 > lengthAir2){
            System.out.println(air1.getProducer() + " длиннее чем " + air2.getProducer());
        } else {
            System.out.println(air2.getProducer() + " длиннее чем " + air1.getProducer());
        }
    }
}
