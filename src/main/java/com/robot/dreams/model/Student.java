package com.robot.dreams.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.beans.ConstructorProperties;

@Data
@AllArgsConstructor
public class Student {

    private int age;

    private String name;

    private String course;

}
