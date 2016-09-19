package net.practice;

import java.util.ArrayList;
import java.util.List;

public class StudentMarks {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Student1", 10, 20, 30));
        students.add(new Student("Student2", 40, 20, 10));
        students.add(new Student("Student3", 30, 30, 20));

        Student highestFirstSubject = students.get(0);
        Student highestSecondSubject = students.get(0);
        Student highestThirdSubject = students.get(0);

        for (Student student : students) {
            if(student.subject1 > highestFirstSubject.subject1) {
                highestFirstSubject = student;
            }
            if(student.subject2 > highestSecondSubject.subject2) {
                highestSecondSubject = student;
            }
            if(student.subject3 > highestThirdSubject.subject3) {
                highestThirdSubject = student;
            }
        }

        System.out.println(highestFirstSubject.name + " is first in subject 1 with marks "+ highestFirstSubject.subject1);
        System.out.println(highestSecondSubject.name + " is first in subject 2 with marks "+ highestSecondSubject.subject2);
        System.out.println(highestThirdSubject.name + " is first in subject 3 with marks "+ highestThirdSubject.subject3);

    }
}


class Student {

    public String name;
    public int subject1;
    public int subject2;
    public int subject3;

    public Student(String name, int subject1, int subject2, int subject3) {
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
}