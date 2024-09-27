package com.bootcamp.demo;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

// !! @ExtendWith annotation, so that we can use @Mock
@ExtendWith(MockitoExtension.class) // @Mock
public class ExamTest {

    @Mock // produce a fake object without implementation
    private Calculator calculator;

    // !!! Objective: lowestScore() -> -10
    @Test
    void testExamLowestScore() {
        // Assume ... When ... Then ...
        Mockito.when(calculator.findMin()).thenReturn(99); // !!!
        // We start testing here ...
        Exam exam = new Exam(calculator);
        int result = exam.lowestScore();
        assertThat(result, equalTo(89)); // !!!
        assertThat(result, not(equalTo(99))); // !!!
        // verify
    }
}
