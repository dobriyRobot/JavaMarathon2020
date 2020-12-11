package day9.Task1;

public class Human {
    private String name;

    public Human(String theName) {
        this.name = theName;
    }

    public String getName(){
        return name;
    }

    public void printInfo(){
        System.out.println("Этот человек с именем " + name);
    }
}
