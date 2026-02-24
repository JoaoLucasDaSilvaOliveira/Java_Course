package _6_Numeros_Randomicos;

import java.util.Random;

public class AppRandom {
    public static void main(String[] args) {
        //usando a classe Random
        Random r = new Random();
        //dentro da classe temos diversos atributos;
        for (int i=0; i<10;i++){
            System.out.println(r.nextInt(0,5)); // dentro de nextInt(), podemos passar nada; o min e o max ou só o máx
            //nesse caso gera um nro pseudoaleatório entre 0~4
        }
        //podemos ter uma seed tb no random, sendo assim, sempre tempo uma mesma sequência pseudoaleatória
        Random rs = new Random(1L);
        for (int i=0; i<10;i++){
            System.out.println(rs.nextInt(0, 101));
            //isso acontece pois a sequência não é de fato aleatória, e sim que quando não passamos a seed, o sistema
            //utiliza o nano tempo do sistema como seed, sempre gerando nros diferentes.
            //agora, quando temos uma mesma seed, ela sofrerá os mesmo cálculos mátemáticos sempre, gerando sempre a
            //mesma sequência
        }
    }
}
