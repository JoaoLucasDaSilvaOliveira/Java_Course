package _4_Closures;

import _2_IndoMaisAFundo.TextTransformer;
import _3_MethodReferences.*;

public class App {
    //o que são closures?
    //  são valores externos à expressão lambda que podem ser utilizados em sua construção
    public static void main(String[] args) {
        //observe:
        /*final*/ int multiplicador = 2;
        multiplicador = 4;
        //observe
        //ERRO: NumberTransformer numberTransformer = (n) -> String.valueOf(n * multiplicador);
        //isso não funciona pois em caso de expressões lambda a var precisa ser final ou implicitamente final
        //  nesse caso estamos passando diretamente o valor e anteriormente trocamos o valor original, causando ambiguidade no código

        //nesse caso não temos o mesmo problema, observe:
        createAndPrint(String::valueOf, 200*multiplicador);
        //isso acontece pq passamos o multiplicador para a função, e a função para a var para a expressão lambda, de forma final
        //  se dentro da função houvesse uma reatribuição, não funcionaria o nosso código.
        //podemos fazer isso, falando em variaveis locais, apenas com vars que seja implícita ou explicitamente final!

        //OUTRO CASO:
        value = 20;
        NumberTransformer numberTransformer = n -> String.valueOf(n+value);
        //pq roda nesse caso? Com atributos a conversa é um pouco diferente. Quando tratamos de atributos, o valor só é passado no momento da compilação, isso significa que se trocarmos ou não o valor, só será passado 1 na compilação.
    }
    private static int value = 10;

    public static void createAndPrint(NumberTransformer numberTransformer, int numberToTransform){
        System.out.println(numberTransformer.transform(numberToTransform));
    }
}
