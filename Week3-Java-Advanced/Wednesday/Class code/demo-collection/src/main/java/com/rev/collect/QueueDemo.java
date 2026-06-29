package com.rev.collect;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo 
{
    public static void main(String[] args) 
    {
        // Queue follows first in first out
        Queue<Integer> pq = new  PriorityQueue<>();
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        // Will go from least to greatest
        // Starting with 10 and going to 40
        System.out.println(pq);
    }   
    
}
