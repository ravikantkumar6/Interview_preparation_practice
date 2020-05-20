package com.amazon;

import java.util.Stack;

public class EvaluatePostfix {

    static boolean isOperand(char c) {
        return c >= 48 && c <= 57;
    }

    static double evaluatePreFix(String exprsn) {
        Stack<Double> stack = new Stack<Double>();
        for (int j = exprsn.length() - 1; j >= 0; j--) {
            if (isOperand(exprsn.charAt(j))) {
                stack.push((double) exprsn.charAt(j) - 48);
            } else {
                double d1 = stack.pop();
                double d2 = stack.pop();
                switch (exprsn.charAt(j)) {
                    case '+':
                        stack.push(d1 + d2);
                        break;
                    case '-':
                        stack.push(d1 - d2);
                        break;
                    case '*':
                        stack.push(d1 * d2);
                        break;
                    case '/':
                        stack.push(d1 / d2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    static double evalautePostFix(String exprsn) {
        Stack<Double> stack = new Stack<Double>();
        for (int j = 0; j < exprsn.length(); j++) {
            if (isOperand(exprsn.charAt(j))) {
                stack.push((double) exprsn.charAt(j) - 48);
            } else {
                double d1 = stack.pop();
                double d2 = stack.pop();
                switch (exprsn.charAt(j)) {
                    case '+':
                        stack.push(d1 + d2);
                        break;
                    case '-':
                        stack.push(d1 - d2);
                        break;
                    case '*':
                        stack.push(d1 * d2);
                        break;
                    case '/':
                        stack.push(d1 / d2);
                        break;
                }
            }
        }
        return stack.pop();
    }


    public static void main(String[] args) {
        String exprsn = "+9*26";
        System.out.println(evaluatePreFix(exprsn));
        String postFix_exprsn = "138*+";
        System.out.println(evalautePostFix(postFix_exprsn));
    }

}
