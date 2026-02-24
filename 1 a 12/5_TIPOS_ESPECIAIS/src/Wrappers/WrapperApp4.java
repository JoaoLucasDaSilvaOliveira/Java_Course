package Wrappers;

public class WrapperApp4 {
    public static void main(String[] args) {
        //autoboxing
        Integer i = 10;
        System.out.println(i);
        i++;
        System.out.println(i);
        //abre o terminal e digita javap nomeDoArquivo, e depois javap -c nomeDoArquivo
        //observe que sempre usamos o autoboxing com a classe String
        //  String s = "s" é mesmo que String s = String.valueOf("s");
    }
}
