package org.example;

import static org.example.BalancedBrackets.areBracketsBalanced;

public class Main {
   public static void main(String[] args) {
//        String infix = "3 + 2 * 5";
//        String postfix = ShuntingYard.infixToPostfix(infix);
//        int result = PostfixEvaluator.evaluate(postfix);
//        System.out.println(result); // Outputs: 13


       String expr = "([{}])";
// Function call
       if (areBracketsBalanced(expr))
           System.out.println("Balanced ");
       else
           System.out.println("Not Balanced ");
   }
}
