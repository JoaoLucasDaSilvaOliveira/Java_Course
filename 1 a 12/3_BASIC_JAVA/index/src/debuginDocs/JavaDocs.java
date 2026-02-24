package debuginDocs;

/**
 * DESCRIÇÃO DA CLASSE:
 * Classe do meu programa
 *
 * @author jlso9
 * @version 1.0
 * @since 1.0
 *
 */
@Deprecated (since = "1.0", forRemoval = true)
public class JavaDocs {
    /**
     * Metodo main.
     * @param args Parametros de linha de comando
     * @since 1.0
     */
    public static void main(String[] args) {
        m1(10);
    }

    /**
     *Este é um metodo
     * @param x O booleano
     */
    private static void m1 (int x){
    }

    /**
     * Este é outro metodo
     * @param n1 Numero 1
     * @param n2 Numero 2
     * @return Por enquanto, true
     */
    private static boolean m2 (double n1, double n2){
        return true;
    }
}
