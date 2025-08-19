package N46;

public class App {

    public static void main(String[] args) {
        run(null,
                System.out::println,
                ()->System.out.println("Nenhuma String passada como parâmetro")
        );
    }

    public static void run (String s, CodeWithParam codeIfNotNull, CodeWithNoParam codeIfNull){
        if (s!=null){
            codeIfNotNull.execute(s);
        } else {
            codeIfNull.execute();
        }
    }

    @FunctionalInterface
    interface CodeWithParam {
        void execute (String s);
    }
    @FunctionalInterface
    interface CodeWithNoParam {
        void execute ();
    }
}
