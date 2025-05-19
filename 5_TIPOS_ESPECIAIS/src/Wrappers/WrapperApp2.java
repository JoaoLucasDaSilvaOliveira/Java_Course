package Wrappers;

public class WrapperApp2 {
    public static void main(String[] args) {
        //diferença entre valueOf() e parseXxx();
        //  valueOf() retorna um objeto do tipo Integer
        //  parseXxx() retorna o tipo primitivo;
        Integer n = Integer.valueOf("1");
        int x = Integer.parseInt("1");
        System.out.println(n.toString());
        System.out.println(x);

        Boolean bo = Boolean.valueOf("true");
        boolean boo = Boolean.parseBoolean("true");
        System.out.println(bo.toString());
        System.out.println(boo);
    }
}
