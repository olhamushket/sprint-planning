package com.epam.rd.autotasks.sprintplanning;

import com.epam.rd.autotasks.sprintplanning.tickets.Bug;
import com.epam.rd.autotasks.sprintplanning.tickets.Ticket;
import com.epam.rd.autotasks.sprintplanning.tickets.UserStory;

import java.util.Arrays;

public class Sprint{
    private final int capacity;
    private final int ticketsLimit;
    public int totalEs = 0;
    public int countTicket = 0;
    Ticket[] list =new Ticket[10];

    public Sprint(int capacity, int ticketsLimit) throws UnsupportedOperationException {
        this.capacity = capacity;
        this.ticketsLimit = ticketsLimit;
    }


    public boolean addUserStory(UserStory userStory) {
        if (userStory==null) {
            return false;
        }
        if (totalEs < capacity &&totalEs+userStory.getEstimate()<=capacity&& countTicket < ticketsLimit&&!userStory.isCompleted()) {
            totalEs += userStory.getEstimate();
            list[countTicket]=new Ticket(userStory.getId(), userStory.getName(), userStory.getEstimate());
            countTicket++;
            return true;
        }
        return false;
//        throw new UnsupportedOperationException("Implement this method");
    }

    public boolean addBug(Bug bugReport) {
//        throw new UnsupportedOperationException("Implement this method");
        if (bugReport==null) {
            return false;
        }
        if (totalEs < capacity&&totalEs+bugReport.getEstimate()<=capacity && countTicket < ticketsLimit-1&&!bugReport.isCompleted()) {
            list[countTicket]=new Ticket(bugReport.getId(), bugReport.getName(), bugReport.getEstimate());
            countTicket++;
            return true;
        }
        return false;
    }

    public Ticket[] getTickets() {
        Ticket[] tickets= new Ticket[countTicket];
        for (int i=0; i<countTicket; i++){
            tickets[i]=list[i];
        }
        return tickets;
//        throw new UnsupportedOperationException("Implement this method");
    }

    public int getTotalEstimate() {
        return totalEs;
//        throw new UnsupportedOperationException("Implement this method");
//    }
    }
    @Override
    public String toString() {
        return String.format(getClass().getName() + "@" + Integer.toHexString(hashCode()),getTickets());

    }
}
