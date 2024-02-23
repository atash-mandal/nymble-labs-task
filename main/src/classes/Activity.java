package classes;

public class Activity {
    private String name;
    private String description;
    private Destination destination;
    private double cost;
    private int capacity;

    public Activity(String name, String description, Destination destination, double cost, int capacity) {
        this.name = name;
        this.description = description;
        this.destination = destination;
        this.cost = cost;
        this.capacity = capacity;
    }

    public boolean isAvailable() {
        return capacity > 0;
    }

    public void bookActivity() {
        if (isAvailable()) {
            capacity--;
            System.out.println("Activity booked successfully.");
        } else {
            System.out.println("Activity is already full.");
        }
    }

    public void printDetails(){    
        System.out.println(this.name + " - Cost: " + this.cost + " - Capacity: " + this.capacity);
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }

    public String getDescription() {
        return this.description;
    }

    public Destination getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }
}