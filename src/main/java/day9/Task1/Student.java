package day9.Task1;

public class Student extends Human {
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public Student(String theName, String theGroupName) {
        super(theName);
        this.groupName = theGroupName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Этот студент с именем " + super.getName());
    }
}
