package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {

    @Test
    void areBracketsBalancedExample1() {
        String example1 = "({[()]})[()]";
        assertTrue(BalancedBrackets.areBracketsBalanced(example1));
    }
    @Test
    void areBracketsBalancedExample2() {
        String example2 = "(5 + 2) - 7 / (2 + 5)";
        assertTrue(BalancedBrackets.areBracketsBalanced(example2));
    }
    @Test
    void areBracketsBalancedExample3() {
        String example3 = "(5 + 2) - 7) / (2 + 5)";
        assertFalse(BalancedBrackets.areBracketsBalanced(example3));
    }
}