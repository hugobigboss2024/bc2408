package com.bootcamp.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        if (age < 0)
            throw new IllegalArgumentException();
        this.age = age;
        this.name = name;
    }

    public boolean isAdult() {
        return this.age >= 18;
    }
}