package _3_Conjuntos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        //primeiro contato com Set
        //  não tem ordem, é um conjunto de dados
        //  não pode ter elementos duplicados
        //  hashSet -> conjunto não ordenado de elementos
        //  linkedHashSet -> conjunto "ordendado" de elementos que respeita a ordem de inserção
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("E");
        set.add("I");
        set.add("O");
        set.add("U");
        set.add("U"); //observe que ao tentar duplicar um elemento, não temos um erro e sim um warning. Simplesmente não adiciona na coleção
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("A");
        set2.add("E");
        set2.add("I");
        set2.add("O");
        set2.add("U");
        set2.add("U"); //observe que ao tentar duplicar um elemento, não temos um erro e sim um warning. Simplesmente não adiciona na coleção
        System.out.println(set); // hashSet se baseia no algorítimo de hashing para "ordenação"
        System.out.println(set2); //LinkedHashSet se baseia em ponteiros para as próximos elementos do conjunto, dando uma ideia de iteração

        //métodos comuns
        //  set.size() -> retorna o tamanho
        //  set.clear() -> remove todos os elementos do conjunto
        //  set.contains() -> retorna um booleano sinalizando se há ou não o elemento no conjunto
    }
}
