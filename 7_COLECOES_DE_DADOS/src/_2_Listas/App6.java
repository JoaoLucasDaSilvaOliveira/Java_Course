package _2_Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App6 {
    public static void main(String[] args) {
        //ordenando listas de objetos de classes customizadas
        List<Person> people = new ArrayList<>(List.of(
            new Person("Maria", 30),
            new Person("Paulo", 36),
            new Person("Pedro", 18)
        ));

        //Collections.sort() não funciona pois ela espera uma lista de classes que implementem Comparable, logo precisamos
        //que nossas classes especiais implementem Comparable
        //sort por idade
        Collections.sort(people);

        for (Person p : people){
            System.out.printf("%s\n", p);
        }
        System.out.println();
        //sort pelo nome
        people.sort(new PersonComparator());

        for (Person p : people){
            System.out.printf("%s\n", p);
        }
    }
}

record Person (String nome, int age) implements Comparable<Person> {
    @Override
    public String toString (){
        return "Person{"+
                "name='"+ nome()+"'"+
                ", age="+age()+
                "}";
    }

    @Override
    public int compareTo(Person o) {
        //iremos ordenar por idade
        if (this.age() < o.age()){
            return -1;
        } else if (this.age() > o.age()){
            return 1;
        } else {
            return 0;
        }
    }
}

class PersonComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.nome().compareTo(o2.nome());
    }
}
