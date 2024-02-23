package tests;
import org.junit.*;
import classes.Activity;
import classes.Destination;

public class TestActivity {
    @Test
    public void testActivity() {
        Destination test_destination = new Destination("dest");
        Activity test_act = new Activity("ABC", "this is activity ABC", test_destination, 400, 2);

        Assert.assertEquals("400.0", Double.toString(test_act.getCost()));
        Assert.assertEquals("ABC", test_act.getName());
        Assert.assertEquals("dest", test_act.getDestination().getName());
        Assert.assertEquals("2", Integer.toString(test_act.getCapacity()));
        Assert.assertEquals("this is activity ABC", test_act.getDescription());
    }
}
