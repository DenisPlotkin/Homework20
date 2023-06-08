package Woman;

import homework21.Main;
import homework21.Man;
import homework21.Person;
import homework21.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanNegativeTests {
    private Person person;
    private Man man1;
    private Woman woman;

    private Main main;


    @Test
    public void getinformation(){
        Woman woman1 = new Woman("Olha", "Seriliz", 27, false);
        Assert.assertEquals(27,30);
    }
    @Test
    public void getiFirstName() {
        Woman woman1 = new Woman("Olha", "Seriliz", 27, false);
        Assert.assertEquals(woman1.getFirstName(), "Marina");
    }
    @Test
    public void getAge() {
        Woman woman1 = new Woman("Olha", "Seriliz", 27, false);
        Assert.assertEquals(woman1.getAge(),20);
    }
    @Test
    public void getLastName() {
        Woman woman1 = new Woman("Olha", "Seriliz", 27, false);
        Assert.assertEquals(woman1.getLastName(), "Serilizt");
    }
    @Test
    public void isPartner() {
        Person woman2 = new Woman("Victoria", "Desereliz", 61, false);
        Assert.assertEquals(woman2.isPartner(),true);
    }
    @Test
    public void isRetired() {
        Person woman2 = new Woman("Victoria", "Desereliz", 61, false);
        Assert.assertEquals(woman2.isRetired(25),true);
    }
    @Test
    public void registerPartnership() {
        Person man2 = new Man("Oleksandr", "Massive", 67, false);
        Person woman2 = new Woman("Victoria", "Desereliz", 61, false);
        Assert.assertEquals(woman2.registerPartnership(true,man2),false);
    }
    @Test
    public void deregisterPartnership() {
        Person man2 = new Man("Oleksandr", "Massive", 67, true);
        Person woman2 = new Woman("Victoria", "Desereliz", 61, true);
        Assert.assertEquals(woman2.deregisterPartnership(true,man2),false);
    }
}
