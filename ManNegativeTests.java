package Man;

import homework21.Main;
import homework21.Man;
import homework21.Person;
import homework21.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;


    public class ManNegativeTests {

        private Person person;
        private Man man1;
        private Woman woman;

        private Main main;


        @Test
        public void getinformation(){
            Man man1 = new Man("David","Sortirovich",25,false);
            Assert.assertEquals(25,30);
        }
        @Test
        public void getiFirstName() {
            Man man1 = new Man("David","Sortirovich",25,false);
            Assert.assertEquals(man1.getFirstName(), "Michael");
        }
        @Test
        public void getAge() {
            Man man1 = new Man("David","Sortirovich",25,false);
            Assert.assertEquals(man1.getAge(),45);
        }
        @Test
        public void getLastName() {
            Man man1 = new Man("David", "Sortirovich", 25, false);
            Assert.assertEquals(man1.getLastName(), "Plotkin");
        }
        @Test
        public void isPartner() {
            Person man2 = new Man("Oleksandr", "Massive", 67, false);
            Assert.assertEquals(man2.isPartner(),true);
        }
        @Test
        public void isRetired() {
            Person man2 = new Man("Oleksandr", "Massive", 67, false);
            Assert.assertEquals(man2.isRetired(25),true);
        }
        @Test
        public void registerPartnership() {
            Person man2 = new Man("Oleksandr", "Massive", 67, false);
            Person woman2 = new Woman("Victoria", "Desereliz", 61, false);
            Assert.assertEquals(man2.registerPartnership(true,woman2),false);
        }
        @Test
        public void deregisterPartnership() {
            Person man2 = new Man("Oleksandr", "Massive", 67, true);
            Person woman2 = new Woman("Victoria", "Desereliz", 61, true);
            Assert.assertEquals(man2.deregisterPartnership(true,woman2),false);
        }
    }

