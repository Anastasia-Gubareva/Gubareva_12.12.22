package Lesson9;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Mira", 3);
        Student student2 = new Student("Tolik", 4);
        Student student3 = new Student("Liza", 2 );

        students.add(new Student("Ira", 1));
        students.add(new Student("Lesya", 2));
        students.add(new Student("Vlad", 3));
        students.add(new Student("Mark", 4));
        students.add(new Student("Ilya", 5));

        Student.addNewStudent(student1);
        Student.addNewStudent(student2);
        Student.addNewStudent(student3);


        Student.show(students);
        Student.printStudents(students);
    }
}