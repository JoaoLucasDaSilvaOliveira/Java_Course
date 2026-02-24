package Classes.Polimorfismo.Generator;

public class Person {
    // só é possível por causa do polimorfismo, pois o RandomGenerator implementa, logo é um Generator
    public Person (Generator g){
        this.id = g.next();
    }
    
    private int id;

    public int getId() {
        return id;
    }
}
