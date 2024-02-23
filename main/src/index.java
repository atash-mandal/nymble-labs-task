import java.util.*;

import classes.Activity;
import classes.Destination;
import classes.GoldPassenger;
import classes.PremiumPassenger;
import classes.StandardPassenger;
import classes.TravelPackage;

public class index {
    public static void main(String[] args) {
        // destinations
        Destination d1 = new Destination("d1");
        Destination d2 = new Destination("d2");
        Destination d3 = new Destination("d3");
        Destination d4 = new Destination("d4");

        List<Destination> destinationList = new ArrayList<>();
        Collections.addAll(destinationList, d1, d2, d3, d4);

        // activities
        Activity a1 = new Activity("a1", "", d1, 500, 4);
        Activity a2 = new Activity("a2", "", d2, 300, 5);
        Activity a3 = new Activity("a3", "", d3, 500, 4);
        Activity a4 = new Activity("a4", "", d4, 500, 2);
        Activity a5 = new Activity("a5", "", d1, 500, 3);
        Activity a6 = new Activity("a6", "", d3, 500, 2);
        Activity a7 = new Activity("a7", "", d2, 500, 5);
        Activity a8 = new Activity("a8", "", d4, 500, 4);

        List<Activity> activityList = new ArrayList<>();
        Collections.addAll(activityList, a1, a2, a3, a4, a5, a6, a7, a8);

        // initialising travel packages
        TravelPackage pack1 = new TravelPackage("Package 1", 5);
        TravelPackage pack2 = new TravelPackage("Package 2", 5);
        TravelPackage pack3 = new TravelPackage("Package 3", 5);

        List<TravelPackage> packageList = new ArrayList<>();
        Collections.addAll(packageList, pack1, pack2, pack3);

        // initialising passengers
        StandardPassenger sp1 = new StandardPassenger("Passenger 1", 1, 3000);
        StandardPassenger sp2 = new StandardPassenger("Passenger 2", 2, 2000);
        StandardPassenger sp3 = new StandardPassenger("Passenger 3", 3, 4000);
        StandardPassenger sp4 = new StandardPassenger("Passenger 4", 4, 5000);

        List<StandardPassenger> standarPassengerList = new ArrayList<>();
        Collections.addAll(standarPassengerList, sp1, sp2, sp3, sp4);

        GoldPassenger gp1 = new GoldPassenger("Passenger 5", 5, 6000);
        GoldPassenger gp2 = new GoldPassenger("Passenger 6", 6, 3000);
        GoldPassenger gp3 = new GoldPassenger("Passenger 7", 7, 8000);
        GoldPassenger gp4 = new GoldPassenger("Passenger 8", 8, 4000);

        List<GoldPassenger> goldPassengerList = new ArrayList<>();
        Collections.addAll(goldPassengerList, gp1, gp2, gp3, gp4);

        PremiumPassenger pp1 = new PremiumPassenger("Passenger 9", 9, 4000);
        PremiumPassenger pp2 = new PremiumPassenger("Passenger 10", 10, 7000);
        PremiumPassenger pp3 = new PremiumPassenger("Passenger 11", 11, 3000);
        PremiumPassenger pp4 = new PremiumPassenger("Passenger 12", 12, 9000);

        List<PremiumPassenger> premiumPassengerList = new ArrayList<>();
        Collections.addAll(premiumPassengerList, pp1, pp2, pp3, pp4);

        // adding activities to destinations
        d1.addActivity(a1);
        d1.addActivity(a5);
        d2.addActivity(a2);
        d2.addActivity(a7);
        d3.addActivity(a3);
        d3.addActivity(a6);
        d4.addActivity(a4);
        d4.addActivity(a8);

        // adding itineries to travel packages
        pack1.addItinery(d2);
        pack1.addItinery(d3);
        pack2.addItinery(d2);
        pack2.addItinery(d4);
        pack2.addItinery(d1);
        pack3.addItinery(d1);
        pack3.addItinery(d2);
        pack3.addItinery(d3);
        pack3.addItinery(d4);

        // Now activities can be chosen as per availability

        System.out.println("\n----------Details---------");

        pack1.printItinerary();
        pack1.printPassengerList();

        System.out.println("\nStandard Passengers");
        for (StandardPassenger passenger : standarPassengerList) {
            System.out.println("\n");
            passenger.printDetails();
        }

        System.out.println("\nGold Passengers");
        for (GoldPassenger passenger : goldPassengerList) {
            System.out.println("\n");
            passenger.printDetails();
        }

        System.out.println("\nPremium Passengers");
        for (PremiumPassenger passenger : premiumPassengerList) {
            System.out.println("\n");
            passenger.printDetails();
        }

        System.out.println("\n----List of available activities----");
        for (Activity activity : activityList) {
            if (activity.getCapacity() > 0)
                activity.printDetails();
        }
    }
}