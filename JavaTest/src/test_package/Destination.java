package test_package;

import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;
    private List<Activity> activities;

    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public void printActivities() {
        for (Activity activity : activities) {
            System.out.println(activity.getName() + " - Cost: " + activity.getCost() +
                    " - Capacity: " + activity.getCapacity() + " - Description: " + activity.getDescription());
        }
    }

    // Getters
    public String getName() {
        return this.name;
    }
}
