package com.robot.dreams.services;

import com.robot.dreams.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentsManager {

    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();

        Student student1 = new Student(23, "Max White", "math-e1342343");
        Student student2 = new Student(22, "Bob Tailor", "physics-1e342343");
        Student student3 = new Student(21, "Anna Black", "literature-1342343");
        Student student4 = new Student(25, "John Wick", "cs-1e34er343");
        Student student5 = new Student(25, "Ted Barton", "cs-r343");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        return students;
    }

}
