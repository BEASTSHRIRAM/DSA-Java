package StackAndQueues;

import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(34);
        stack.push(44);
        stack.push(54);
        stack.push(64);
        stack.push(74);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        Queue<Integer> queue =new LinkedList<>();
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(89);
        deque.addLast(78);
        deque.removeFirst();


    }
}
