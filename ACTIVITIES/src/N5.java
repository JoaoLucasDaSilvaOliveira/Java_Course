public class N5 {
    public static void main(String[] args) {
        /*
            ESCREVA UM SIS QUE FAÇA A TABUADA DE 1 ~ 10 DE QLQR NRO
                - O NRO DA TABUADA DEVE VIR VIA CONSOLE
         */
        var scanner = new java.util.Scanner(System.in);
        System.out.print("Digite o número que queira saber a tabuada: ");
        double nro = Double.parseDouble(scanner.nextLine());
        for (int i=0; i<=10; i++){
            double res = nro * i;
            System.out.println(nro+" X "+i+" = "+res);
        }
    }
}
