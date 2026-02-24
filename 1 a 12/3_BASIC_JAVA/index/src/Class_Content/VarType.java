package Class_Content;

public class VarType {
    public static void main(String[] args) {
        //var é como uma caixinha que aceita qualquer tipo de dado;
        var a = 10;
        // mas depois de setar o dado, não é possível mudar o seu tipo;
            // observe que a sempre será int;
        /*var b;
        b = 10L;*/
        // observe o erro, o tipo var sempre precisa ser inicializado em tempo de compilação, ou seja, no momento em que for criada;
        var b = 10L;
        var c = "Hello World";
        var d = true;
    }
}
