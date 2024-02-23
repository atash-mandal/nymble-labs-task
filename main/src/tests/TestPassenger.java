package tests;
import org.junit.Assert;
import org.junit.Test;

import classes.Activity;
import classes.Destination;
import classes.GoldPassenger;
import classes.PremiumPassenger;
import classes.StandardPassenger;

public class TestPassenger {
    @Test 
    public void testPassenger() {
        StandardPassenger test_sp = new StandardPassenger("Passenger 1", 1, 3000);
        GoldPassenger test_gp = new GoldPassenger("Passenger 2", 2, 6000);
        PremiumPassenger test_pp = new PremiumPassenger("Passenger 3", 3, 4000);
        
        Destination test_destination = new Destination("dest_1");
        Activity test_act = new Activity("ABC", "this is activity ABC", test_destination, 500, 4);

        if(test_act.isAvailable()){
            test_gp.signUpForActivity(test_act);
        }

        Assert.assertEquals("Passenger 1", test_sp.getName());
        Assert.assertTrue(test_gp instanceof GoldPassenger);
        Assert.assertTrue(test_sp instanceof StandardPassenger);
        Assert.assertEquals("2",Integer.toString(test_gp.getPassengerNum()));
        Assert.assertEquals("4000.0", Double.toString(test_pp.getBalance()));
        Assert.assertEquals("5550.0", Double.toString(test_gp.getBalance()));
    }
}
