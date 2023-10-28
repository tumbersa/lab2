package org.example;
//Шаг 2
import java.util.*;

public class PostfixEvaluator {
    private static final String OPERATORS = "*/+-";

    public static int evaluate(String postfix) {
        Deque<Integer> stack = new ArrayDeque<>();
        Scanner scanner = new Scanner(postfix);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                stack.push(scanner.nextInt());
            } else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                char op = scanner.next().charAt(0);
                switch (op) {
                    case '+':
                        stack.push(num1 + num2);
                        break;
                    case '-':
                        stack.push(num1 - num2);
                        break;
                    case '*':
                        stack.push(num1 * num2);
                        break;
                    case '/':
                        stack.push(num1 / num2);
                        break;
                }
            }
        }
        scanner.close();
        return stack.pop();
    }
}