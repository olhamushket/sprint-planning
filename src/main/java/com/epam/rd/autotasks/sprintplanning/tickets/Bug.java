package com.epam.rd.autotasks.sprintplanning.tickets;

public class Bug extends Ticket {
    UserStory userstory;

    public static Bug createBug(int id, String name, int estimate, UserStory userStory) {
        if (!userStory.isCompleted()) {
            return null;
        }
//        throw new UnsupportedOperationException("Implement this method");
        return new Bug(id, name, estimate, userStory);
    }

    private Bug(int id, String name, int estimate, UserStory userStory) {
        super(id, name, estimate);
        this.userstory=userStory;
//        throw new UnsupportedOperationException("Implement this method");
    }

    @Override
    public String toString() {
        String result = "[Bug "+Bug.this.getId()+"] "+userstory.name+": "+Bug.this.getName();
        return result;
//        throw new UnsupportedOperationException("Implement this method");
    }
}
