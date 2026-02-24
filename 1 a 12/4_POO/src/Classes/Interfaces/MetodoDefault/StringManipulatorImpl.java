package Classes.Interfaces.MetodoDefault;

public class StringManipulatorImpl implements StringManupulator, CharacterChanger{

    @Override
    public String join(String s1, String s2) {
        return s1+s2;
    }

    @Override
    public String takeFirst(String s, int length) {
        return s.substring(0, length);
    }

    @Override
    public String upper(String s) {
        return StringManupulator.super.upper(s);
    }

    public static void main(String[] args) {
        //String teste= "Ai";
        //System.out.println(teste[0]); ERRO
        //System.out.println(teste.charAt(0)); FUNCIONA
        StringManipulatorImpl s = new StringManipulatorImpl();
        System.out.println(s.join("Jo", "ão"));
        System.out.println(s.takeFirst("Pedrinho", 6));
        System.out.println(s.upper("aiaiai que mina perversa"));
        System.out.println(CharacterChanger.lower("AIAIAI QUE MINA PERVERSA"));
    }
}
