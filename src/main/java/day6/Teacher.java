package day6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String theName, String theSubject){
        this.name = theName;
        this.subject = theSubject;
    }

    void evaluate(Student theStudent){
        String studentName = theStudent.getName();
        String gradeStr;
        int grade = 2 + (int)(Math.random() * 3);
        if (grade == 2){
            gradeStr = "Неудовлетворительно";
        } else if (grade == 3){
            gradeStr = "Удовлетворительно";
        } else if (grade == 4){
            gradeStr = "Хорошо";
        } else {
            gradeStr = "Отлично";
        }
        System.out.println("Преподователь " + name + " оценил студента с именем " + studentName +
                " по предмету " + subject + " на оценку " + gradeStr);
    }
}
