package tests;

import org.junit.Assert;
import org.junit.Test;
import classes.Activity;
import classes.Destination;
import classes.GoldPassenger;
import classes.PremiumPassenger;
import classes.StandardPassenger;
import classes.TravelPackage;

public class TestTravelPackage {
    @Test
    public void testTravelPackage() {
        Destination test_destination = new Destination("dest");
        Activity test_act = new Activity("ABC", "this is activity ABC", test_destination, 400, 2);
        StandardPassenger test_sp = new StandardPassenger("Passenger 1", 1, 3000);
        GoldPassenger test_gp = new GoldPassenger("Passenger 2", 2, 6000);
        PremiumPassenger test_pp = new PremiumPassenger("Passenger 3", 3, 4000);

        TravelPackage test_pack = new TravelPackage("Package 1", 4);

        test_destination.addActivity(test_act);
        test_pack.addItinery(test_destination);
        test_pack.addPassenger(test_sp);
        test_pack.addPassenger(test_gp);
        test_pack.addPassenger(test_pp);

        Assert.assertEquals("4", Integer.toString(test_pack.getCapacity()));
        Assert.assertEquals("Package 1", test_pack.getName());
        Assert.assertEquals("3", Integer.toString(test_pack.getPassengers().size()));
        Assert.assertEquals("1", Integer.toString(test_pack.getItinery().size()));
    }
}
