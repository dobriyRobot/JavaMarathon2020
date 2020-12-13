package day11.task1;

public class Courier implements Worker {
    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(double salary, boolean isPayed, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public String toString() {
        return "salary = " + salary + ", isPayed = " + isPayed;
    }

    public void doWork() {
        salary += 100;
        int delivered = warehouse.getCountDeliveredOrders() + 1;
        warehouse.setCountDeliveredOrders(delivered);
    }

    public void bonus() {
       if (isPayed == false){
           if (warehouse.getCountDeliveredOrders() >= 10000){
               salary += 50000;
               isPayed = true;
           } else {
               System.out.println("Бонус еще не доступен");
           }
       } else {
           System.out.println("Бонус уже был выплачен");
       }
    }
}