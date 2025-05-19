package N23;

import java.text.NumberFormat;
import java.util.Currency;

public class Item {

    private String precoCurrency;
    private double preco;
    private String descricao;

    public Item (double preco, String descricao, String crcod){
        NumberFormat formato = NumberFormat.getCurrencyInstance();
        formato.setCurrency(Currency.getInstance(crcod));
        this.precoCurrency = formato.format(preco);
        this.preco = preco;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return String.format("Descrição: %-15s\nPreço: %-15s", descricao, precoCurrency);
    }
}
