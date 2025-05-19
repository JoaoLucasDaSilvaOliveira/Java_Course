public class N2 {
    public static void main(String[] args) {
        //faça um sistema de conversão de temperatura de Farenheit para Celsius
        // formula: ((TF - 32)/9)*5
        var scanner = new java.util.Scanner(System.in);
        System.out.print("Digite a temperatura em Farenheit: ");
        double TF = Double.parseDouble(scanner.nextLine());
        double CLS = ((TF - 32)/9)*5;
        System.out.println("A temperatura é: "+ CLS+"C°");
    }
}
