package org.example;

import static org.example.BalancedBrackets.areBracketsBalanced;

public class Main {
   public static void main(String[] args) {
//        String infix = "3 + 2 * 5";
//        String postfix = ShuntingYard.infixToPostfix(infix);
//        int result = PostfixEvaluator.evaluate(postfix);
//        System.out.println(result); // Outputs: 13
       String infix = "(9 - (3 + 2)) * 5 / 4";
       if (areBracketsBalanced(infix)) {
           String postfix = ShuntingYard.infixToPostfix(infix);
           int result = PostfixEvaluator.evaluate(postfix);
           System.out.println(result);
       } else {
           System.out.println("Not Balanced ");
       }
//       String expr = "([{]})";
//// Function call
//       if (areBracketsBalanced(expr))
//           System.out.println("Balanced ");
//       else
//           System.out.println("Not Balanced ");
   }
}
