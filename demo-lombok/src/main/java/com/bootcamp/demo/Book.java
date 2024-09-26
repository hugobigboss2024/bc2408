package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter; // code
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Java Developer: You have to 100% understand the generated code after compile

// Maven:
// Re-define compile process:
// 1. "mvn clean compile" -> Check if any External annoitation (outside JDK)
// 2. if yes, re-generate the java source code (java file)
// 3. Compile class file (byte code)

@Getter // class level annotation, apply for all attributes
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = { "author", "price" })
@EqualsAndHashCode(exclude = "id")
public class Book {
    private int id;
    private String author;
    private double price;

    // getAuthor() -> uplift performance

    public static void main(String[] args) {
        Book book = new Book(1, "John", 99.9);
        System.out.println(book); // Book(id=1)

        System.out
                .println(new Book(1, "Peter", 10.5).equals(new Book(2, "Peter", 10.5)));
        // true
    }
}