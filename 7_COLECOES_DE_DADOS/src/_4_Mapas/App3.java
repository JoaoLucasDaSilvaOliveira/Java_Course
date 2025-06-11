package _4_Mapas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class App3 {
    public static void main(String[] args) {
        //iterando com classes especiais como keys ou values
        Map<Name, Integer> map = new LinkedHashMap<>();
        map.put(new Name("João", "Oliveira"), 21);
        map.put(new Name("Mario", "Luigi"), 11);
        map.put(new Name("Maria", "Pedra"), 31);
        map.put(new Name("Maria", "Pedra"), 31);
        System.out.println(map);
    }
}

//OBS.: é necessário implementar os métodos equals e hashcode para fazer com que não possa ter mais de um objeto igual em nosso mapa
class Name {
    private final String first;
    private final String last;

    public Name (String first, String last){
        this.first = first;
        this.last = last;
    }

    public String getLast() {
        return last;
    }

    public String getFirst() {
        return first;
    }

    @Override
    public String toString() {
        return "Name{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Name name)) return false;
        return Objects.equals(first, name.first) && Objects.equals(last, name.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }
}
