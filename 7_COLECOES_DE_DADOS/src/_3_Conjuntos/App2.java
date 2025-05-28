package _3_Conjuntos;

import java.util.*;

public class App2 {
    public static void main(String[] args) {
        //treeSet
        //  conjuntos que são naturalmente ordenados
        Set<Integer> set = new TreeSet<>(Set.of(6,8,4,3,9,7));
        System.out.println(set);

        //observe quando queremos inciar um treeSet de objetos personalizados
        Account ac1 = new Account("123", "Zé", 100);
        Account ac2 = new Account("456", "Pedro", 200);
        //sem implementar comparable: Set<Account> contas = new TreeSet<>(Set.of(ac1, ac2)); //ERRO: a classe não implementa comparable,
        //como a natureza do treeSet é comparar os elementos desde sua inserção, precisamos de um Comparator,
        //ou que a classe implemente a interface Comparable

        /*Implementando comparable: */ Set<Account> contas = new TreeSet<>(Set.of(ac1, ac2));
        System.out.println(contas);
        Set<Account> contasBalance = new TreeSet<Account>(new OrderingByNumber());
        contasBalance.addAll(Set.of(ac1, ac2));
        System.out.println(contasBalance);
    }
}

record Account (String number, String owner, double balance) implements Comparable<Account>{

    @Override
    public int compareTo(Account o) {
        //ordenaremos por String number
        return this.number.compareTo(o.number);
    }
}

//implementado ordenamento com comparator
class OrderingByNumber implements Comparator<Account> {
    @Override
    public int compare(Account o1, Account o2) {
        return -Double.compare(o1.balance(), o2.balance()); //retorna a ordem decrescente
    }
}
