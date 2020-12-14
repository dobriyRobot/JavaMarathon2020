package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> autoList = new ArrayList<>();
        autoList.add("Toyota");
        autoList.add("Nissan");
        autoList.add("Jeep");
        autoList.add("Bentley");
        autoList.add("Citroen");
        System.out.println(autoList);
        autoList.add(2, "LADA");
        autoList.remove(0);
        System.out.println(autoList);
    }
}
