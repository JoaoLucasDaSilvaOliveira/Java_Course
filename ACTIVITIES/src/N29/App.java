package N29;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Item item1 = new Item("Xícara", 15.99);
        Item item2 = new Item("Pano", 5.00);
        Item item3 = new Item("Prato", 7.50);
        Item item4 = new Item("Panela", 100);

        String[] res = sort(item1, item2, item3, item4);
        System.out.println(Arrays.toString(res));
    }
    private static String[] sort (Item...i){
        Item maisBarato = i[0];
        Item maisCaro= i[0];
        double precoMedio=0.0;
        for (Item item : i){
            if (item.price() < maisBarato.price()){
                maisBarato = item;
            }
            if (item.price() > maisCaro.price()){
                maisCaro = item;
            }
            precoMedio += item.price();
        }
        precoMedio /=i.length;
        return new String[] {"Mais barato: "+maisBarato.name(),
                "Mais caro: "+maisCaro.name(),
                "Preço médio: "+Double.toString(precoMedio)};
    }
}

record Item (String name, double price){
}
