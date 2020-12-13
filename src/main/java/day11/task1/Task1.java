package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Warehouse warehouse2 = new Warehouse();
        Worker courier1 = new Courier(0, false, warehouse1);
        Worker courier2 = new Courier(0, false, warehouse2);
        Worker picker1 = new Picker(0, false, warehouse1);
        Worker picker2 = new Picker(0, false, warehouse2);
        businessProcess(courier1);
        System.out.println(courier1);
        businessProcess(picker1);
        System.out.println(picker1);
        courier2.doWork();
        picker2.doWork();
        System.out.println(courier2);
        System.out.println(picker2);
    }
    static void businessProcess(Worker worker){
        for(int i = 0; i < 10000; i++){
            worker.doWork();
        }
        worker.bonus();
    }
}
