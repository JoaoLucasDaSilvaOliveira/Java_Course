package _4_AnonymousInnerClasses;

public class _1_Criando {
    //são classes onde conseguimos abstrair a declaração dela
    //observe:
    /*public static class Arroz implements _1_Comida{
        @Override
        public void sabor() {
            System.out.println("Arroz é salgado");
        }
    }*/
    //e veja de forma anonima
    public static _1_Comida comida = new _1_Comida() {
        @Override
        public void sabor() {
            System.out.println("Arroz é salgado");
        }
    };
    //bem mais simples
}
