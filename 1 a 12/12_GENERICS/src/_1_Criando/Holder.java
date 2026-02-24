package _1_Criando;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Holder<T> {
    //nesse tipo de atribuição, temos <T> sendo atribuído na construção da classe. Isso
    //  significa que ao declararmos a classe, precisamos explicitar qual o tipo de T
    //  e esse T poderá ser utilizado universalmente na classe!

    private final T infoCore;
    private List<T> listCore;

    public Holder (T infoCore){
        this.infoCore = infoCore;
    }

    public T getInfoCore (){
        return infoCore;
    }

    public List<T> getListCore() {
        return listCore;
    }

    public void setListCore(List<T> listCore) {
        this.listCore = listCore;
    }

    //podemos, também, ter tipos genéricos apenas em métodos, quando não faz sentido precisar declarar na criação da classe
    public <R> Holder<R> transform (R param){
        return new Holder<>(param);
    }

    @Override
    public String toString() {
        return "Holder{" +
                "infoCore=" + infoCore +
                ", listCore=" + listCore +
                '}';
    }
}
