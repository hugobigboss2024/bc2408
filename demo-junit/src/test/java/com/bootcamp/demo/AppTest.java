package com.bootcamp.demo;

// static import
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test; // Junit5

class AppTest {

    @Test
    void shouldAnswerWithTrue() {
        boolean event1 = 2 > 3;
        // assertTrue(event1); // static method
        assertFalse(event1);
    }

    @Test
    void testSameObject() {
        String s1 = "abc";
        String s2 = "abc";
        assertSame(s1, s2);

        String s3 = new String("abc");
        assertNotSame(s2, s3);
    }

    @Test
    void testThrow() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Person(-1, "John");
        });

        assertDoesNotThrow(() -> {
            new Person(10, "John");
        });
    }

    @Test
    void testAssertTimeout() {
        // Performance Test
        assertTimeout(Duration.ofMillis(60), () -> {
            // Business logic ...
            Thread.sleep(50);
        });
    }
}
