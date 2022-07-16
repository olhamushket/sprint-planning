package com.epam.rd.autotasks.sprintplanning.tickets;

import java.util.Arrays;

public class UserStory extends Ticket {
    UserStory[] dependsOn;
    public int len=0;
    public UserStory(int id, String name, int estimate, UserStory... dependsOn) {
        super(id, name, estimate);
        this.dependsOn=dependsOn;
        com=estimate;
        if (dependsOn==null) {
            throw new UnsupportedOperationException();
        } else {
        len=dependsOn.length;}
    }

    @Override
    public void complete() {
        int completed=0;
        if (dependsOn==null){
            com=0;
        }
        for (int i = 0; i < dependsOn.length; i++) {
            if (dependsOn[i].isCompleted()) {
                completed++;
            }
        }
        if (completed==dependsOn.length) {
            com=0;
        }

//        throw new UnsupportedOperationException("Implement this method");
    }

    public UserStory[] getDependencies() {
        return Arrays.copyOf(dependsOn, dependsOn.length);
//        throw new UnsupportedOperationException("Implement this method");
    }

    @Override
    public String toString() {
        String s="[US "+UserStory.this.id+"] "+UserStory.this.name;
        return s;
//        throw new UnsupportedOperationException("Implement this method");
    }
}
