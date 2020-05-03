package list;

import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // To push an item in stack
        stack.push("item1");

        // To take top item from stack
        String topItem = stack.peek();

        // To take top item from stack and remove
        String removedTopItem = stack.pop();

        // To check stack is empty or not
        if (stack.empty()) {
            System.out.println("It is empty");
        } else {
            System.out.println("It is not empty");
        }

    }
}
