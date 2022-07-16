package com.epam.rd.autotasks.sprintplanning.tickets;

public class Bug extends Ticket {
    private final UserStory bug;

    public static Bug createBug(int id, String name, int estimate, UserStory userStory) {
        if (userStory == null || !userStory.isCompleted()) {
            return null;
        } else
            return new Bug(id, name, estimate, userStory);
    }

    Bug(int id, String name, int estimate, UserStory userStory) {
        super(id, name, estimate);
        this.bug = userStory;
    }

    @Override
    public String toString() {
        return "[Bug " + super.getId() + "] " + bug.name + ": " + super.getName();
    }
}
