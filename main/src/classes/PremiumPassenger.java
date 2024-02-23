package classes;

public class PremiumPassenger extends Passenger {
    public PremiumPassenger(String name, int passengerNum, double balance) {
        super(name, passengerNum, balance); // Premium passengers have no balance
    }
}