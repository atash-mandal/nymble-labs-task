package classes;

public class PaymentProcessor {
    public void processPayment(Passenger passenger, double amount) {
        passenger.setBalance(passenger.getBalance() - amount);
    }

    public double applyDiscount(double amount, double discountPercentage) {
        return amount - (amount * discountPercentage / 100);
    }
}
