package _3_MethodReferences;
import _2_IndoMaisAFundo.TextTransformer;

public class App {
    //entendendo...
    public static void main(String[] args) {
        //oq estávamos a fazer até agora:
        transformAndPrint(s-> s.toUpperCase(), "javinha eh top");

        //como temos: apenas um arg; um retorno simples (em uma linha e sem o {}), podemos chamar o metodo da classe String:
        transformAndPrint(String::toUpperCase, "javinha eh toppperson");
        //dessa forma podemos omitir o argumento da função e passar apenas o retorno da função!

        //outro caso!
        //nesse caso temos uma outra forma de transformAndPrint onde passamos um NumberTransformer e um número a ser transformado
        //diferentemente do caso acima, dessa vez o nosso parâmetro esperado pela interface é passado para um métod-o de uma classe
        // como fazer dessa forma?
        transformAndPrint(n -> String.valueOf(n), 100);
        //
        transformAndPrint(String::valueOf, 100);
        //o java já espera um valor, dessa forma ele passa automaticamente o valor para o methodo da classe, tudo isso de forma implícita

    }
    public static void transformAndPrint (TextTransformer textTransformer, String textToTransform){
        System.out.println(textTransformer.transform(textToTransform));
    }
    public static void transformAndPrint (NumberTransformer textTransformer, int numberToTransform){
        System.out.println(textTransformer.transform(numberToTransform));
    }
}
