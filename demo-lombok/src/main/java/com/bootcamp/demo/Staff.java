package com.bootcamp.demo;

import lombok.NonNull;

public class Staff {
    private String name;
    private Double salary;

    // 3. Parameter Annotation -> generate exception checking
    public Staff(@NonNull String name, @NonNull Double salary) {
        this.name = name;
        this.salary = salary;
    }

    // 3. Parameter Annotation -> generate exception checking
    public void work(@NonNull String detail) {
        System.out.println("Staff is working on " + detail);
    }

    public static void main(String[] args) {
        new Staff("John", 20000.0).work("something"); // Staff is working on something
        new Staff("Peter", 25000.0).work(null); // java.lang.NullPointerException
    }

    // ! This is not expected as you thought, if you do not assign value in
    // constructor
    // public Staff(@NonNull String name, @NonNull Double salary) {
    // if (name == null) {
    // throw new NullPointerException("name is marked non-null but is null");
    // } else if (salary == null) {
    // throw new NullPointerException("salary is marked non-null but is null");
    // }
    // }

    // ! Solution
    // You have to explicitly write your own business code inside the constructor
    // this.name = name;
    // this.salary = salary;
}