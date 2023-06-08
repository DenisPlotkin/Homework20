package homework21;

public class Man extends Person{
    public Man(String firstName, String lastName, int age, boolean partner) {
        super(firstName, lastName, age, partner);
    }

    @Override
    public boolean isRetired(int age) {
        return age > 65;
    }

    @Override
    public boolean registerPartnership(boolean register, Person person) {
        if (!isPartner() && !person.isPartner() && register) {
            person.setLastName(getLastName());
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
            person.setLastName(person.getMaidenName());
            setPartner(false);
            person.setPartner(false);
            return true;
        } else {
            return false;
        }
    }
}
