package _3_MethodReferences;

public class App2 {
    //usando method references para criação de classes
    public static void main(String[] args) {
        //criando uma instancia de Person (record) pela interface funcional PersonCreator usando method ref;
        //normalmente faríamos assim:
        createAndPrint(n -> new Person(n), "João");
        //agora com method ref fazemos assim:
        createAndPrint(Person::new, "João");
        //dessa forma chamamos o estatico new e passamos a ele o name!
    }

    public static void createAndPrint (PersonCreator personCreator, String name){
        System.out.println(personCreator.create(name));
    }
}
