package _6_CollectionsELambda;

import _3_MethodReferences.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class sort2 {
    public static void main(String[] args) {
        var people = new ArrayList<>(List.of(
                new Pessoa("Zoão", 21),
                new Pessoa("Yedro", 19),
                new Pessoa("Bedro", 19),
                new Pessoa("Isadora", 35)
        ));
        people.forEach((PersonObj)-> System.out.printf("Nome: %s\nIdade: %d\n\n", PersonObj.name, PersonObj.age));
        /*people.sort(Comparator.comparing((PersonObj)->{
            return PersonObj.name;
        }));*/
        //ouuuu
        people.sort(Comparator.comparing(Pessoa::name));
        people.forEach((PersonObj)-> System.out.printf("Nome: %s\nIdade: %d\n\n", PersonObj.name, PersonObj.age));
    }
    public static record Pessoa (String name, int age){}
}
