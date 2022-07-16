package com.epam.rd.autotasks.sprintplanning.tickets;

import com.epam.rd.autotasks.sprintplanning.Sprint;

public class Ticket {
    public final int id;
    public final String name;
    public final int estimate;
    public int com;

    public Ticket(int id, String name, int estimate) {
        super();
        this.id=id;
        this.name=name;
        this.estimate=estimate;
        com=estimate;
        //        throw new UnsupportedOperationException("Implement this method");
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
           return com==0;
//        throw new UnsupportedOperationException("Implement this method");
    }

    public void complete() {
        com=0;
//        throw new UnsupportedOperationException("Implement this method");
    }

    public int getEstimate() {
        return estimate;
//        throw new UnsupportedOperationException("Implement this method");
    }
}
