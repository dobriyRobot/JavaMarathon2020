package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Иванов", "Физика");
        Student student1 = new Student("Сидоров");
        teacher1.evaluate(student1);
    }
}
