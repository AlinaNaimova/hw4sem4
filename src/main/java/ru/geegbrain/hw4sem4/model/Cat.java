package ru.geegbrain.hw4sem4.model;

import lombok.Data;

@Data
public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}