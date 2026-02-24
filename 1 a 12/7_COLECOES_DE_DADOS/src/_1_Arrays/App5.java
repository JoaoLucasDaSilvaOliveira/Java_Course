package _1_Arrays;

import java.util.Arrays;

public class App5 {
    public static void main(String[] args) {
        //conhecendo a classe Arrays
        String[] array = new String[5];
        int[] arrayNro = new int[5];

        //toString()
        System.out.println(Arrays.toString(array));

        //fill() -> preenche o array tod-o com algo em específico
        Arrays.fill(array, "A");
        System.out.println(Arrays.toString(array));

        //sort() -> ordena o array de forma numérica, alfabética
        int i = 100;
        char c = 'Z';
        for (int j = 0; j<arrayNro.length; j++){
            arrayNro[j] = i;
            i--;
        }
        for (int j = 0; j<array.length; j++){
            array[j] = Character.toString(c);
            c--;
        }
        System.out.println(Arrays.toString(arrayNro));
        System.out.println(Arrays.toString(array));
        Arrays.sort(arrayNro);
        Arrays.sort(array);
        System.out.println(Arrays.toString(arrayNro));
        System.out.println(Arrays.toString(array));

        //binarySearch() -> busca binária; array precisa estar ordenado
        System.out.println(Arrays.binarySearch(array, "")); // retorna um int que é a posição no array onde está o
        // elemento encontrado; retorna -1 se não encontrar

        //copyOf() -> copia um array para outro array com um outro tamanho, como se fosse um realoc
        String [] novoArr = Arrays.copyOf(array, 10);
        System.out.println(Arrays.toString(novoArr));
    }
}
