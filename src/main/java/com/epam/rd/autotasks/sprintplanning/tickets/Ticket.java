package com.epam.rd.autotasks.sprintplanning.tickets;

import com.epam.rd.autotasks.sprintplanning.Sprint;

public class Ticket {
    public final int id;
    public final String name;
    public final int estimate;
    protected boolean isFinished;

    public Ticket(int id, String name, int estimate) {
        this.id=id;
        this.name=name;
        this.estimate=estimate;
    }

    public int getId() {
        return id;
//        throw new UnsupportedOperationException("Implement this method");
    }

    public String getName() {
        return name;
//        throw new UnsupportedOperationException("Implement this method");
    }

    public boolean isCompleted() {
           return isFinished;
//        throw new UnsupportedOperationException("Implement this method");
    }

    public boolean complete() {
        isFinished = true;
        return false;
//        throw new UnsupportedOperationException("Implement this method");
    }

    public int getEstimate() {
        return estimate;
//        throw new UnsupportedOperationException("Implement this method");
    }
}
