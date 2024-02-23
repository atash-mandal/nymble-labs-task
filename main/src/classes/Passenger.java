package classes;

import java.util.*;

public class Passenger {
    private String name;
    private int passengerNum;
    private double balance;
    private List<Activity> activities;
    private PaymentProcessor paymentProcessor;

    public Passenger(String name, int passengerNum, double balance) {
        this.name = name;
        this.passengerNum = passengerNum;
        this.balance = balance;
        this.activities = new ArrayList<>();
        this.paymentProcessor = new PaymentProcessor();
    }

    public void signUpForActivity(Activity activity) {
        if (activity.getCapacity() > 0) {
            double cost = activity.getCost();
            if (this instanceof GoldPassenger && cost <= (0.9*this.getBalance())) {
                cost = paymentProcessor.applyDiscount(cost, 10); // Apply 10% discount for gold passengers
            }
            if (balance >= cost || this instanceof PremiumPassenger) {
                activities.add(activity);
                activity.bookActivity();
                if (!(this instanceof PremiumPassenger)) {
                    paymentProcessor.processPayment(this, cost); // Process payment for standard and gold passengers
                }
                System.out.println("Activity signed up successfully.");
            } else {
                System.out.println("Insufficient balance to sign up for activity.");
            }
        } else {
            System.out.println("Activity is already full.");
        }
    }

    public void printDetails() {
        System.out.println("Passenger Name: " + name);
        System.out.println("Passenger Number: " + passengerNum);
        System.out.println("Balance: " + balance);
        System.out.println("Activities signed up:");
        for (Activity activity : activities) {
            System.out.println(activity.getName() + " - Destination: " + activity.getDestination().getName() +
                    " - Price: " + activity.getCost());
        }
    }

    // Getters and setters
    public String getName() {
        return this.name;
    }

    public int getPassengerNum() {
        return this.passengerNum;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }
}

