package com.DS.stack;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        // Create a new Stack object
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the Stack
        stack.push(4);
        stack.push(7);
        stack.push(2);

        // Display the Stack
        System.out.println("Stack: " + stack);

        // Peek at the top element of the Stack
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Pop elements off the Stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Display the Stack after pop operation
        System.out.println("Stack after pop: " + stack);
    }
}
