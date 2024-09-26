package com.bootcamp.demo;

// What we learned in JDK:
// laptop JDK 17
// VSCode Extension JDK -> laptop JDK
// laptop Maven -> JDK 17
// Maven project pom -> Java compiler 1.5

// Maven Cycle:
// mvn clean -> clear target folder
// mvn compile -> compile all java files under main folder
// mvn test compile -> Included "compile" step

// Library:
// 1. Implicitly import (JDK - java.lang), i.e. StringBuilder.class
// 2. Explicitly import (JDK - java.util, java.math), i.e. BigDecimal, ArrayList
// 3. External Library - Outside JDK (lombok), i.e. @Getter

// When you initialize a maven java project, it preloads JDK library under
// java.lang.

// VSCode "Run" button 
// -> call javac command (JDK 17) to compile (to class file under another path)
// -> run the class file by java command
// -> finally, delete the class file under that path
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Book book = new Book();
        book.setAuthor("Vincent");
        book.setPrice(30.1);
        book.setId(1);
        System.out.println(book.getAuthor());
        System.out.println(book.getPrice());
        System.out.println(book.getId());

        System.out.println(book); // Book(id=1, author=Vincent, price=30.1)
        Book book2 = new Book(2, "Peter", 99.9);
        Book book3 = Book.builder() //
                .author("Sally") //
                .id(2) //
                .price(99.9) //
                .build();
        System.out.println(book3);

        // equals()
        // hashcode()

        // toString()
        // builder
        // getter, setter
        // constructor
    }
}