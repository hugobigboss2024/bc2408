package com.bootcamp.demo;

import lombok.Data;
import lombok.NonNull;

// 1. Class level Annotation
@Data // @RequiredArgsConstructor
public class Person {
    // 2. Annotation can be attribute level
    @NonNull // runtime checking on Constructor + Setter
    private String name; // non-nullable

    private String emailAddress; // nullable

    public static void main(String[] args) {
        Person p = new Person("John");
        System.out.println(p); // Person(name=John, emailAddress=null)

        Person p2 = new Person(null); // compile OK,
        // runtime -> java.lang.NullPointerException
    }
}