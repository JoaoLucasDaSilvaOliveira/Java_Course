package _1_Criando;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Holder<String> h1 = new Holder<>("Info Core String");
        Holder<Integer> h2 = new Holder<>(1);
        Holder<Object> h3 = new Holder<>("Holder de holder");
        h3.setListCore(List.of(h1, h2));
        h3.getListCore().forEach(System.out::println);
    }

}
