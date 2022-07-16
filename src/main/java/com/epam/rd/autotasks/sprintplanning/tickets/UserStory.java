package com.epam.rd.autotasks.sprintplanning.tickets;

import java.util.Arrays;

public class UserStory extends Ticket {
    UserStory[] dependsOn;

    public UserStory(int id, String name, int estimate, UserStory... dependsOn) {
        super(id, name, estimate);
        this.dependsOn = dependsOn;
    }

    @Override
    public boolean complete() {
        for (UserStory userStory : dependsOn) {
            if (!userStory.isCompleted()) {
                return false;
            }
        }
        super.complete();
        return true;
    }

    private boolean isDependsCompleted() {
        boolean dependsCompleted = true;
        for(UserStory userStory : dependsOn) {
            if (!userStory.isCompleted()) { // якщо не завершений, то брехня
                dependsCompleted = false;   //         завершений, то правда
                break;
            }
        }
        return dependsCompleted;
    }

    public UserStory[] getDependencies() {
        return Arrays.copyOf(dependsOn, dependsOn.length);
    }

    @Override
    public String toString() {
        return "[US "+ id + "] " + name;
    }


}