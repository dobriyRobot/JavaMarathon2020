package day9.Task1;

public class Teacher extends Human {
    private String subjectName;

    public String getSubjectName(){
        return subjectName;
    }

    public Teacher(String theName, String theSubjectName){
        super(theName);
        this.subjectName = theSubjectName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподователь с именем " + super.getName());
    }
}
