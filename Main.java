package homework21;

public class Main {
    public static void main(String[] args) {
        Person man1 = new Man("David", "Sortirovich", 25,false);
        Person man2 = new Man("Oleksandr", "Massive", 67, false);
        Person woman1 = new Woman("Olha", "Seriliz", 27, false);
        Person woman2 = new Woman("Victoria", "Desereliz", 61, false);

        System.out.println(man1.isRetired(man1.getAge()));
        System.out.println(man2.isRetired(man2.getAge()));

        System.out.println(woman1.isRetired(woman1.getAge()));
        System.out.println(woman2.isRetired(woman2.getAge()));

        System.out.println(man1.registerPartnership(true, woman1));
        System.out.println(man2.registerPartnership(true, woman2));

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);

        System.out.println(woman1.deregisterPartnership(true, man1));
        System.out.println(woman2.deregisterPartnership(true, man2));

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);


    }
}
