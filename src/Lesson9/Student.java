package Lesson9;
import java.util.List;

public class Student {

    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

     public static void show(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.name + " " + student.course);
        }
    }

    public static void printStudents(List<Student> students) {
        int course = 3;

        while (true) {
           if (course >= 1  && course <= 5)
                break;
        }

        System.out.println("Students of course " + course + ": ");
        for (Student student : students) {
            if (student.course == course)
                System.out.println(student.name + " " + student.course);
        }
    }
    public static void addNewStudent(List<Student> listToAdd, Student student){
        listToAdd.add(student);
    }
    public static void removeStudent(List<Student> listToRemove, Student student){
        listToRemove.remove(student);

}