package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    public int countDeliveredOrders;

    public void setCountPickedOrders(int countPickedOrders){
        this.countPickedOrders = countPickedOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders){
        this.countDeliveredOrders = countDeliveredOrders;
    }

    public int getCountPickedOrders(){
        return countPickedOrders;
    }
    public int getCountDeliveredOrders(){
        return countDeliveredOrders;
    }
    public String toString() {
        return "countPickedOrders = " + countPickedOrders + ", countDeliveredOrders = " + countDeliveredOrders;
    }
}
