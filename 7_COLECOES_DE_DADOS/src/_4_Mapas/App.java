package _4_Mapas;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        //conhecendo Map
        //  HashMap -> chaves funcionam de modo hashSet, não aceitam duplicatas e não respeitam a ordem de inserção
        //  LinkedHashMap -> chaves funcionam de modo linkedHashSet, não aceitam duplicatas e respeitam a odem de inserção
        //  TreeMap -> chaves funcionam de modo TreeSet, ordena os elementos no momento de inserção, pode vir a aceitar duplicatas (tomar cuidado)
        // mapas quando você já tem um valor associado a chave e da um .put(), apaga o último valor associado à chave a atribui o novo valor

        //<TipoChave, TipoValor>
        Map<String, Object> pessoa1 = new HashMap<>();
        //inserindo chaves e valores
        pessoa1.put("Nome", "João");
        pessoa1.put("Idade", 21);
        pessoa1.put("Altura", 1.71);
        pessoa1.put("Profissão", "Programador");

        //toString();
        System.out.println(pessoa1);

        //get() -> procura por chave; retorna o obj se houver a chave, retorna null se não existir a chave
        System.out.println(pessoa1.get("Nome"));

        //getOrDefault -> procura por chave; retorna o obj se houver a chave, retorna o segundo parâmetro se não existir a chave
        System.out.println(pessoa1.getOrDefault("Nom", "Nâo encontrado"));

        //keySet() -> retorna as chaves existentes; retorna um Set
        System.out.println(pessoa1.keySet());

        //values() -> retorna os valores existentes; retorna uma coleção
        System.out.println(pessoa1.values());
    }
}
