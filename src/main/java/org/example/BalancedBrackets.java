package org.example;

//Балансировка скобок
import java.util.*;
public class BalancedBrackets {
    /**
     *
     * @param expr - algebraic expression in infix form
     * @return whether the parentheses in the expression are balanced or not
     */
    static boolean areBracketsBalanced(String expr) {
// Using ArrayDeque is faster than using Stack class
        Deque<Character> stack = new ArrayDeque<Character>();
// Traversing the Expression
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
// Push the element in the stack
                stack.push(x);
                continue;
            }
// If current character is not opening bracket, then it must be closing. So stack cannot be empty at this point.
            if (stack.isEmpty() && (x == ')' || x == ']' || x == '}'))
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
// Check Empty Stack
        return (stack.isEmpty());
    }
}
