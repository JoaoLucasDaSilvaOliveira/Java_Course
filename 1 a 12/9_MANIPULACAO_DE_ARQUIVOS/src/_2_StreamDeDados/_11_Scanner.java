package _2_StreamDeDados;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class _11_Scanner {
    public static void main(String[] args) throws IOException {
        //aprendendo a usar a classe scanner para vários outros fins
        try (Scanner scanner = new Scanner(Path.of("C:\\Users\\jlso9\\Desktop\\Curso_Java\\9_MANIPULACAO_DE_ARQUIVOS\\src\\Examples\\Streams\\PrintWriter.txt"))){
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
        //com a classe Scanner podemos mudar como linhas são interpretadas!
        try (Scanner scanner =  new Scanner(Path.of("C:\\Users\\jlso9\\Desktop\\Curso_Java\\9_MANIPULACAO_DE_ARQUIVOS\\src\\Examples\\Streams\\PrintWriter.txt"))){
            //vai considerar a letra a para quebra de linhas!
            scanner.useDelimiter("[aA]");
            //      usamos hasNext pq a linha não é mais o delimitador
            while (scanner.hasNext()){
                System.out.println(scanner.next());
            }
        }
    }
}