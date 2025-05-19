package _1_Arrays;

public class App2 {
    public static void main(String[] args) {
        //iterando um array
        //forma oldschool
        int [] primeNumbers = {2,5,7,11,13,17,19};
        for (int i =0; i< primeNumbers.length; i++){
            System.out.printf("=>%d ", primeNumbers[i]);
        }
        System.out.println("\n");

        //enhanced for
        //oq acontece aqui?
        // crio uma variável para conter o que tem dentro do array a cada iteração
        //  :
        //  passo o array a iterar
        for (int i: primeNumbers){
            System.out.printf("=>%d ", i);
        }
    }
}
