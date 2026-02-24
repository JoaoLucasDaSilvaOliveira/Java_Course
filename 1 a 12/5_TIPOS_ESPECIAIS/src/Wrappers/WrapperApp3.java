package Wrappers;

public class WrapperApp3 {
    public static void main(String[] args) {
        //trabalhando com mudanças de bases numéricas
        String s = Integer.toBinaryString(10);
        String h = Integer.toHexString(10);
        String o = Integer.toOctalString(10);
        System.out.println(s);
        System.out.println(h);
        System.out.println(o);

        //valueOf(String s, int radix) -> radix: base;
        System.out.println(Integer.valueOf("11010", 2));
        System.out.println(Integer.valueOf("aef", 16));

        //decode: detecta a base
        System.out.println(Integer.decode("101010"));
    }
}
