package tests;
import org.junit.*;
import classes.Destination;
import classes.Activity;

public class TestDestination {
    @Test
    public void testDestination() {
        Destination test_destination = new Destination("dest_1");
        Activity a1 = new Activity("a1", "this is activity a1", test_destination, 400, 2);
        Activity a2 = new Activity("a2", "this is activity a2", test_destination, 200, 4);
        Activity a3 = new Activity("a3", "this is activity a3", test_destination, 300, 1);
        
        test_destination.addActivity(a1);
        test_destination.addActivity(a2);
        test_destination.addActivity(a3);

        Assert.assertEquals("dest_1", test_destination.getName());
        Assert.assertEquals(3, test_destination.getActivities().size());

        test_destination.removeActivity(a2);
        Assert.assertEquals(2, test_destination.getActivities().size());
    }
}
