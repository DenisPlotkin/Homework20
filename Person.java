package homework21;

public class Person {
    private String firstName;
    private String lastName;
    private String maidenName;
    private int age;
    private boolean partner;

    public Person(String firstName, String lastName, int age, boolean partner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPartner() {
        return partner;
    }

    public void setPartner(boolean partner) {
        this.partner = partner;
    }

    public boolean isRetired(int age) {
        return true;
    }

    public boolean registerPartnership(boolean register, Person person) {
        return true;
    }

    public boolean deregisterPartnership(boolean deregister, Person person) {
        return true;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", partner=" + partner +
                '}';
    }
}
