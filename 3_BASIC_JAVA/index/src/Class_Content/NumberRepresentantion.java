package Class_Content;

public class NumberRepresentantion {
    public static void main(String[] args) {
        /*long n = 20_000_000_000;*/ // dessa forma, por mais que o nro caiba no long, o padrão é int, logo é necessário um "casting"
        long n = 20_000_000_000L; // l ~ L
        double d = 12.345678901234567890; // de pontos flutuantes, double é o padrão, por isso não precisa de casting;
        float f = 12.345678901234567890f; // como o padrão é o double, float precisa de casting;

        //outras representações:
            //binario: sufixo 0b
            int bin = 0b1010;
            //octal: sufixo 0o
            int oct = 0123;
            //hexadecimal: sufixo 0x
            int hex = 0x1234;
    }
}
