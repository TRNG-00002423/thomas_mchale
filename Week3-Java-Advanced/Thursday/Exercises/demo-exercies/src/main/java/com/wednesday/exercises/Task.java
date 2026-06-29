package com.wednesday.exercises;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Partner B — comparable task for PriorityQueue.
 * TODO: implement Comparable<Task> (document ordering rule)
 */
public class Task implements Comparable<Task> {
    private int priority;
    private String description;
    private static final Logger log = LoggerFactory.getLogger(Task.class);

    public Task (int priority, String description)
    {
        this.priority = priority;
        this.description = description;
        if (description == null || description.trim().isEmpty()) {
            log.warn("Created a task with an empty or null description! Priority: {}", priority);
        } else {
            log.info("Successfully created Task: [{}] with priority {}", description, priority);
        }
    }

    // TODO ctor, getters, toString

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
        log.info("Priority has changed");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        log.info("Description has changed");
    }

    @Override
    public String toString()
    {
        return this.priority + " " + this.description;
    }

    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.priority, o.priority);
    }
}