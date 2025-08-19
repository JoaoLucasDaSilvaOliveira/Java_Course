package _1_Entendendo;

public class App {
    public static void main(String[] args) {
        //nos baseamos no funcionamento das anonymous classes
        //expressões lambda apenas funcionam em classes que possuem apenas um metod-o não desenvolvido!
        //observe:
        //  anonymous class
        Operation sum = new Operation() {
            @Override
            public int calculate(int n1, int n2) {
                return n1+n2;
            }
        };
        //expressão lamba, função anonima do JS
        Operation multi = (int n1, int n2) ->{
            return n1*n2;
        };
        // e é possível deixar mais simples
        Operation multi2 = (n1, n2) -> {
            return n1 * n2;
        };
        // e da pra ficar mais simples
        Operation multi3 = (n1, n2) -> n1*n2;
        //e da pra ficar ainda mais simples
        run((n1, n2) -> n1 * n2);
        //expressão com retorno void
        print(()-> "Hello!");


        System.out.println(run(sum));
        System.out.println(run(multi));
    }

    public static int run (Operation op){
        return op.calculate(5,4);
    }
    public static void print (TextTransformer textTransformer){
        System.out.println(textTransformer.getText());
    }
}

@FunctionalInterface
interface TextTransformer {
    public String getText();
}

