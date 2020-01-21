package com.zmz.array;

import com.zmz.array.queue.ArrayQueue;
import com.zmz.array.queue.LoopQueue;
import com.zmz.array.queue.Queue;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int opCount = 10000000;
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        double time1 =testQueue(arrayQueue,opCount);
        System.out.println(time1);

        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 =testQueue(loopQueue,opCount);
        System.out.println(time2);
    }

    public static double testQueue(Queue<Integer> q, int opCount){
        long startTime = System.nanoTime();
        Random random= new Random();
        try{
            for (int i = 0; i < opCount; i++) {
                q.enqueue(random.nextInt(Integer.MAX_VALUE));
            }
            for (int i = 0; i < opCount; i++) {
                q.dequeue();
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        long endTime = System.nanoTime();
        return (endTime - startTime)/1000000000.0;
    }
}
