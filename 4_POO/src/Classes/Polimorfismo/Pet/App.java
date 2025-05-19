package Classes.Polimorfismo.Pet;

public class App {
    public static void main(String[] args) {
        /*Dog d = new Dog ();
        d.feed();


        Cat c = new Cat ();
        c.feed();*/

        Pet p = new Dog ();
        p.feed();
        //não temos acesso a sit (). No polimorfismo, só conhecemos aqui que existe na superclasse e o que foi sobrescrito
        //é necessário fazer um casting
        /*
        Dog d = (Dog) p; //podemos fazer assim, mas fica perigoso, veja pq:
        Cat c = (Cat) p; // p originalmente é um Dog. O cod compila, mas breca;
        d.sit();
        c.sit();
         */
        //para não ficar perigoso, fazemos assim:
        if (p instanceof Dog){
            Dog bicho  = (Dog) p;
            bicho.sit();
        } else {
            Cat bicho = (Cat) p;
            bicho.sit();
        }
        //outra forma mais simples
        if (p instanceof Dog bicho){
            bicho.sit();
        } else {
            Cat bicho = (Cat) p;
            bicho.sit();
        }
    }
}
