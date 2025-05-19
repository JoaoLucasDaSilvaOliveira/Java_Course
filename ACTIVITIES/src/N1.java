public class N1 {
    public static void main(String[] args) {
        //crie um programa que calcule a media de 1 aluno
        // são 3 notas fornecidas pelo user
        // conversão de string pode ser feita com ParseDouble();
        var scanner = new java.util.Scanner(System.in);
        System.out.print("Digite a nota 1: ");
        String nota1 = scanner.nextLine();
        System.out.print("Digite a nota 2: ");
        String nota2 = scanner.nextLine();
        System.out.print("Digite a nota 3: ");
        String nota3 = scanner.nextLine();
        double media = (Double.parseDouble(nota1) + Double.parseDouble(nota2) + Double.parseDouble(nota3))/3;
        System.out.println("A média é: "+media);
    }
}
