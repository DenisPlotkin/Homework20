package homework21;

public class Woman extends Person{

    public Woman(String firstName, String lastName, int age, boolean partner) {
        super(firstName, lastName, age, partner);
        this.setMaidenName(lastName);
    }

    @Override
    public boolean isRetired(int age) {
        return age > 60;
    }

    @Override
    public boolean registerPartnership(boolean register, Person person) {
        if (!isPartner() && !person.isPartner() && register) {
            setMaidenName(getMaidenName());
            setLastName(person.getLastName());
            setPartner(true);
            person.setPartner(true);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deregisterPartnership(boolean deregister, Person person) {
        if (isPartner() && person.isPartner() && deregister) {
            setLastName(getMaidenName());
            setPartner(false);
            person.setPartner(false);
            return true;
        } else {
            return false;
        }
    }
}
