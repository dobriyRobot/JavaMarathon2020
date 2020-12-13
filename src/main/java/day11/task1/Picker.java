package day11.task1;

public class Picker implements Worker{
    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(double salary, boolean isPayed, Warehouse warehouse){
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    public double getSalary(){
        return salary;
    }
    public boolean getIsPayed(){
        return isPayed;
    }
    public String toString() {
        return "salary = " + salary + ", isPayed = " + isPayed;
    }

    public void doWork(){
        salary = salary + 80;
        int picked = warehouse.getCountPickedOrders() + 1;
        warehouse.setCountPickedOrders(picked);
    }
    public void bonus(){
        if (isPayed == false){
            if (warehouse.getCountPickedOrders() >= 10000){
                salary += 70000;
                isPayed = true;
            } else {
                System.out.println("Бонус еще не доступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
