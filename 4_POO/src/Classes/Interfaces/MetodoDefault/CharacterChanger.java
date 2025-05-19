package Classes.Interfaces.MetodoDefault;

public interface CharacterChanger {

    default String upper (String s){
        return getChar() + s.substring(1);
    }
    //com a ideia do default em interfaces, vem a ideia do private e static
    private char getChar (){
        return '*';
    }

    static String lower (String s){
        return s.toLowerCase();
    }
}
