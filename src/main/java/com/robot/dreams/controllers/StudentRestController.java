package com.robot.dreams.controllers;

import com.robot.dreams.model.Student;
import com.robot.dreams.services.StudentsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentRestController {

    private StudentsManager studentsManager;

    @Autowired
    public StudentRestController(StudentsManager studentsManager) {
        this.studentsManager = studentsManager;
    }

    @GetMapping("api/students")
    public List<Student> getStudents() {
      return this.studentsManager.getStudents();
    }

}