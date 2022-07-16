package com.epam.rd.autotasks.sprintplanning;

import com.epam.rd.autotasks.sprintplanning.tickets.Bug;
import com.epam.rd.autotasks.sprintplanning.tickets.Ticket;
import com.epam.rd.autotasks.sprintplanning.tickets.UserStory;

import java.util.Arrays;

public class Sprint {
    protected int capacity;
    protected int ticketsLimit;
    protected int ticketsLimitCount;
    protected int totalEstimate;
    protected Ticket[] tickets;
    protected int i;

    public Sprint(int capacity, int ticketsLimit) {
        this.capacity = capacity;
        this.ticketsLimit = ticketsLimit;
        tickets = new Ticket[ticketsLimit];
    }

    public boolean addUserStory(UserStory userStory) {
        if (ticketsLimitCount < ticketsLimit && userStory != null&&userStory.getDependencies()!=null) {
            if (totalEstimate + userStory.getEstimate() <= capacity && !userStory.isCompleted()) {
                tickets[i] = userStory;
                totalEstimate += userStory.getEstimate();
                i++;
                ticketsLimitCount++;
                return true;
            }
        }
        return false;
    }

    public boolean addBug(Bug bugReport) {
        if (ticketsLimitCount < ticketsLimit && bugReport != null) {
            if (totalEstimate + bugReport.getEstimate() <= capacity && !bugReport.isCompleted()) {
                tickets[i] = bugReport;
                totalEstimate += bugReport.getEstimate();
                i++;
                ticketsLimitCount++;
                return true;
            }
        }
        return false;
    }

    public Ticket[] getTickets() {
        return Arrays.copyOf(tickets, getTicketsLimitCount());
    }

    public int getTotalEstimate() {
        return totalEstimate;
    }

    public int getTicketsLimitCount() {
        return ticketsLimitCount;
    }
}
