package SimpleOperationTests;

import homework21.Main;
import homework21.Man;
import homework21.Person;
import homework21.Woman;
import org.testng.Assert;
import org.testng.annotations.*;

public class SimpleTests {
    private Person person;
    private Man man1;
    private Woman woman;

    private Main main;

    @BeforeTest
    public void setupclassmethod(){
        System.out.println("Homework 21");
    }
    //@BeforeClass
    //public void setupclass(){
        //System.out.println("Homework 21");
    //}
    //@BeforeMethod
    //public void setupmethodclass(){
        //System.out.println("Homework 21");
    //}

    @Test(dependsOnMethods = "getAge")
    public void getinformation(){
        Man man1 = new Man("David","Sortirovich",25,false);
        Assert.assertEquals(25,25,"Its true");
    }
    @Test(enabled = false)
    public void getFirstName() {
        Man man1 = new Man("David","Sortirovich",25,false);
        Assert.assertEquals(man1.getFirstName(), "David","It is the real name");
    }
    @Test(enabled = true)
    public void getAge() {
        Man man1 = new Man("David","Sortirovich",25,false);
        Assert.assertEquals(man1.getAge(),25,"Its true age");
    }
    @Test
    public void getLastName() {
        Man man1 = new Man("David", "Sortirovich", 25, false);
        Assert.assertEquals(man1.getLastName(), "Sortirovich","Its true");
    }
    @Test
    public void isPartner() {
        Person woman2 = new Woman("Victoria", "Desereliz", 61, false);
        Assert.assertEquals(woman2.isPartner(),false,"Its true answer");
    }
    @Test
    @Ignore
    public void isRetired() {
        Person woman2 = new Woman("Victoria", "Desereliz", 61, false);
        Assert.assertEquals(woman2.isRetired(25),false,"Maybe its true answer");
    }
    @Test(priority = 2)
    public void registerPartnership() throws InterruptedException {
        Thread.sleep(1000);
        Person man2 = new Man("Oleksandr", "Massive", 67, false);
        Person woman2 = new Woman("Victoria", "Desereliz", 61, false);
        Assert.assertEquals(woman2.registerPartnership(true,man2),true,"In this method used priority");
    }
    @Test(priority = 1,description = "the best test ever",groups = {"SmokeTest"})
    public void deregisterPartnership() throws InterruptedException {
        Thread.sleep(1000);
        Person man2 = new Man("Oleksandr", "Massive", 67, true);
        Person woman2 = new Woman("Victoria", "Desereliz", 61, true);
        Assert.assertEquals(woman2.deregisterPartnership(true,man2),true,"This method used groups in regression");
    }
}
