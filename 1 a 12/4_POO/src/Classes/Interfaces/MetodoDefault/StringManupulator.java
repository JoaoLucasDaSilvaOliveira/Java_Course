package Classes.Interfaces.MetodoDefault;

public interface StringManupulator {
    String join (String s1, String s2);

    String  takeFirst (String s, int length);

    //default e static juntos não combinam!
    default String upper (String s){
        return s.toUpperCase();
    }
}
