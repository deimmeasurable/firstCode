package cohortAssignment;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        boolean result=stack.empty();
        System.out.println("is the stack empty"+result);

        stack.push(78);
        stack.push(10);
        stack.push(11);
        stack.push(20);

        System.out.println("element in stack:"+stack);
        result = stack.empty();
        System.out.println("is the stack empty:"+result);
        stack.pop();
        stack.pop();
        int log =stack.peek();

        System.out.println(stack);
        System.out.println(log);

    }
}
