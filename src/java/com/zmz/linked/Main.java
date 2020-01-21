package com.zmz.linked;

import com.zmz.array.stack.ArrayStack;
import com.zmz.array.stack.Stack;

import java.util.Random;

public class Main {
    public static void main1(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }
        linkedList.add(2, 666);
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);
    }

    public static void main(String[] args) {
        int opCount = 10000000;
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        double time1 =testStack(arrayStack,opCount);
        System.out.println(time1);

        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        double time2 =testStack(arrayStack,opCount);
        System.out.println(time2);
    }

    public static Double testStack(Stack<Integer> stack, int opCount) {
        long startTime = System.nanoTime();
        Random random =new Random();
        for (int i = 0; i < opCount; i++) {
            stack.push(i);
        }
        for (int i = 0; i < opCount; i++) {
            stack.peek();
        }
        long endTime = System.nanoTime();
        return (endTime-startTime)/1000000000.0;
    }
}
