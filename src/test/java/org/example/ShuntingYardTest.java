package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuntingYardTest {

    @Test
    void infixToPostfix() {
        String infix = "(5 - 7) * (3 - 10)";
        assertEquals("5 7 - 3 10 - *", ShuntingYard.infixToPostfix(infix));
    }
}