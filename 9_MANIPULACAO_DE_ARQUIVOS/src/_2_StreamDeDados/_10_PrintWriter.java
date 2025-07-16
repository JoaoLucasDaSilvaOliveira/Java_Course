package _2_StreamDeDados;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class _10_PrintWriter {
    public static void main(String[] args) throws FileNotFoundException {
        //classe que nos possibilita escrever en arqvs de forma mais facilitada
        try (PrintWriter pw = new PrintWriter("C:\\Users\\jlso9\\Desktop\\Curso_Java\\9_MANIPULACAO_DE_ARQUIVOS\\src\\Examples\\Streams\\PrintWriter.txt")){
            //funciona como o System.out
            pw.println("ola, zé");
            pw.println("sou o JAVAh");
            pw.format("numeral: %05d", 15);
        }
    }
}
