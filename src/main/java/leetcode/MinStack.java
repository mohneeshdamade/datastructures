package leetcode;

import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * Implement the MinStack class:
 *
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 */
public class MinStack {

    private Stack<int[]> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        // If the stack is empty push min and max val equally
        if(stack.isEmpty()){
            stack.push(new int[]{val, val});
            return;
        }

        // if stack is not empty , put minimum pf previous minimum and current val
        stack.push(new int[]{val, Math.min(val, stack.peek()[1])});
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(1);
        int param_3 = obj.top();
        int param_4 = obj.getMin();
    }
}


