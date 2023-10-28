package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostfixEvaluatorTest {

    @Test
    void evaluate() {
        String postfix = "5 7 - 3 10 - *";
        assertEquals(14,PostfixEvaluator.evaluate(postfix));
    }
}