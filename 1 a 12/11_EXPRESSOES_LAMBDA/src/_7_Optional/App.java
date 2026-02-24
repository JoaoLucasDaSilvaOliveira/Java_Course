package _7_Optional;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Person p = new Person(Map.of(
           1,"João",
           2,"Maria",
           3,"Henrique",
           4,"Pedro"
        ));
        //ISSO É UM JEITO DE FAZER
//        var name = p.getElementById(10);
//        if (name.isPresent()){
//            String upperName = name.get().toUpperCase();
//            System.out.println(upperName);
//        }
        //ISSO É OUTRO JEITO MELHOR DE FAZER
        p.getElementById(2).ifPresent(n-> System.out.println(n.toUpperCase()));//recebe um Consumer
    }

    static class Person {
        public final Map<Integer, String> idsAndNames;

        public Person(Map<Integer, String> idsAndNames) {
            this.idsAndNames = idsAndNames;
        }

        //OPTIONAL => classe que serve como um contâiner. Pode ou não ter algo dentro dele. Serve para usar com expressões lambda
        public Optional<String> getElementById(int id){
            for (int idPerson : idsAndNames.keySet()){
                if (idPerson == id){
                    return Optional.of(idsAndNames.get(id));
                }
            }
            return Optional.empty();
        }
    }
}
