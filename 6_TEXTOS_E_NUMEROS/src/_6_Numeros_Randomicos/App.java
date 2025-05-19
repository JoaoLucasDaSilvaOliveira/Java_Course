package _6_Numeros_Randomicos;

public class App {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            //Math.random();
            //  todos os numeros gerados são double entre 0 e 0.9999999999999999999...
            double d = Math.random();
            System.out.println(d);
            //  se quisermos gerar um número em um intervalo em específico, usamos alguns princípios matemáticos e tipos
            //  ex.: 0.4568498....... e queremos um nro entre 0~10; multiplicamos pelo range(10 nesse caso) e convertemos para int
            //  explicitamente, assim "cortando" as casas decimais
            System.out.println((int)(d*10));
            //  observe que não conseguimos chegar em 10, no máximo 9, ou seja, sempre conseguimos um nro entre 0 e o range
            //  *caso não queira começar em 0!
            //  ex.: 0.2135.... e queremos um nro entre 10~20 incluíndo 10 e 20; multiplicamos pela quantidade de nros entre 10 e 20
            //  (10,11,12,13,14,15,16,17,18,19,20; 11 nros no total) e somamos o nro que queremos iniciar, 10 nesse caso
            System.out.println((int)((d*11)+10));
        }
    }
    //algoritimo para gerar nros aleatórios em um intervalo:
    public static int random(int to, int from){
        int range = to - from + 1;
        return (int)((Math.random()*range)+from);
    }
}
