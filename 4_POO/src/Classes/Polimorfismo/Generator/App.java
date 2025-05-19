package Classes.Polimorfismo.Generator;

public class App {
    public static void main(String[] args) {
        Generator random = new RandomGenerator();
        Person p1 = new Person(random);
        System.out.println(p1.getId());
        Person p2 = new Person(random);
        System.out.println(p2.getId());
        Person p3 = new Person(random);
        System.out.println(p3.getId());
        System.out.println("/// ///");
        Generator sequence = new SequenceGenerator();
        Person p4 = new Person(sequence);
        Person p5 = new Person(sequence);
        Person p6 = new Person(sequence);
        System.out.println(p4.getId());
        System.out.println(p5.getId());
        System.out.println(p6.getId());


    }
}
