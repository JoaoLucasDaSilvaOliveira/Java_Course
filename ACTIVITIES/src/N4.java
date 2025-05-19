public class N4 {
    public static void main(String[] args) {
        /*
            ESCREVA UM SIS QUE CALCULA A MEDIA DE NOTAS
                - AS NOTAS DEVEM SER VIA CONSOLE
                - RECEBER AS NOTAS ATÉ NÃO RECEBER UMA NOTA
         */
        var scanner = new java.util.Scanner(System.in);
        int i=1;
        double sum=0;
        while (true){
            System.out.print("Digite sua nota "+i+" : ");
            String notaSystemIn = scanner.nextLine();
            if (/*notaSystemIn == ""*/notaSystemIn.isBlank()){
                i--;
                break;
            } else {
                sum+= Double.parseDouble(notaSystemIn);
                i++;
            }
        }
        sum /=i;
        System.out.println("A média das notas é: "+sum);
    }
}
