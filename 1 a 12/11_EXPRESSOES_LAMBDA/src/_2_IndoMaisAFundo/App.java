package _2_IndoMaisAFundo;

public class App {
    public static void main(String[] args) {
        //podemos fazer assim:
        /*textTransform((String s)->s.toUpperCase(), "javinha");*/
        //ou assim:
        textTransform(s -> s.toUpperCase(), "javinha");
        //IMPORTANTE: com apenas um parâmetro, ao omitirmos o tipo, podemos não colocar os ()
    }

    public static void textTransform (TextTransformer textTransformer, String text){
        textTransformer.transform(text);
    }
}
