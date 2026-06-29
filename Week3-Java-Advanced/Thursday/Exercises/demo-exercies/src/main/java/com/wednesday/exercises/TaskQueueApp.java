package com.wednesday.exercises;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/** Partner B — drain PriorityQueue in priority order. */
public class TaskQueueApp {
    
    public static void main(String[] args) {
        Queue<Task> q = new PriorityQueue<>();
        // TODO: offer tasks out of order, poll and print, peek demo
        Task t1 = new Task(2, "Description1");
        Task t2 = new Task(3, "Description2");
        Task t3 = new Task(1, "Description3");
        List.of(t1, t2, t3).forEach(q::add);

        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
    }
}