package Class_Content;

public class ImplicitCasting {
    public static void main(String[] args) {
        /*
            TEORIA:
                - Os menores tipos de dados cabem nos maiores tipos de dados;
                menor ->      byte
                              short
                              int
                              long
                              float
                maior ->      double
         */
        /*
            PRÁTICA:
         */
        byte b = 10;
        long l = b;
        // é feito um cast implícito porque b "cabe" em l
    }
}
