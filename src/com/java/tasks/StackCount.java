package com.java.tasks;

import java.util.Arrays;
import java.util.Stack;

public class StackCount {

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(7);
        stack1.push(5);
        stack1.push(1);
        stack1.push(6);
        stack1.push(1);
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(2);
        stack2.push(5);
        stack2.push(2);
        stack2.push(1);

        int sum = 0, k = 12, count = 0;
        Stack<Integer> temp = stack1;
        while (!temp.isEmpty()) {
            if (sum + temp.peek() < k) {
                temp.pop();
                count++;
            } else {
                temp = stack2;
                if (sum < k) {
                    sum += temp.peek();
                    temp.pop();
                    count++;
                } else break;
            }
        }
        System.out.println(count);
    }
}
