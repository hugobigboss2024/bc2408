package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

// A test enviroment FOR Person.class testing only
// @TestInstance(TestInstance.Lifecycle.PER_METHOD)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
class PersonTest {
    private Person adult;
    private Person child;

    // before all test case
    @BeforeAll
    void init() {
        this.adult = new Person(18, "John");
        this.child = new Person(17, "Peter");
    }

    @Test
    @Order(4)
    void testIsAdult() {
        assertTrue(adult.isAdult());
        assertFalse(child.isAdult());
    }

    @Test
    @Order(2)
    void testGetter() {
        assertEquals(18, adult.getAge());
        assertEquals("John", adult.getName());
    }

    @Test
    @Order(3)
    void testSetter() {
        child.setName("Oscar");
        assertEquals("Oscar", child.getName());
    }

    @Test
    @Order(1)
    void testConstructor() {
        assertNotNull(adult);
        assertInstanceOf(Person.class, adult);
    }

    // Maven generates the test cases caller
    public static void main(String[] args) {
        // Test Instance Per method
        // new PersonTest().testIsAdult();
        // new PersonTest().testGetter();
        // new PersonTest().testConstructor();

        // Test Instance Per Class
        PersonTest pt = new PersonTest();
        pt.testIsAdult();
        pt.testGetter();
        pt.testConstructor();
    }

}
