package _2_StreamDeDados;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class _1_App {
    public static void main(String[] args) throws IOException {
        //da pra fazer assim:
        /*FileWriter out = new FileWriter("C:\\Users\\jlso9\\Desktop\\Curso_Java\\9_MANIPULACAO_DE_ARQUIVOS\\src\\Examples\\Streams\\out.txt", StandardCharsets.UTF_8);
        out.write("Hello World");
        out.close();*/

        //mas eh melhor assim:
        try (FileWriter out = new FileWriter("C:\\Users\\jlso9\\Desktop\\Curso_Java\\9_MANIPULACAO_DE_ARQUIVOS\\src\\Examples\\Streams\\out.txt", StandardCharsets.UTF_8)){
            out.write("Hello World");
        }
    }
}
