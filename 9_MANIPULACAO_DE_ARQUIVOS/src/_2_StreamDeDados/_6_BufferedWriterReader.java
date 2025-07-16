package _2_StreamDeDados;

import java.io.*;

public class _6_BufferedWriterReader {
    public static void main(String[] args) throws IOException {
        //le blocos de informações
        //ja faz os códigos de leitura e escrita de forma embutida
        //recebem uma classe como param
        try(BufferedWriter bfw = new BufferedWriter(new FileWriter("C:\\Users\\jlso9\\Desktop\\Curso_Java\\9_MANIPULACAO_DE_ARQUIVOS\\src\\Examples\\Streams\\Buffereds.txt"))){
            IOOperations.write(bfw, "Esse é um texto escrito usando BufferedWriter");
        }
        try (BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\jlso9\\Desktop\\Curso_Java\\9_MANIPULACAO_DE_ARQUIVOS\\src\\Examples\\Streams\\Buffereds.txt"))){
            System.out.println(IOOperations.read(bfr));
        }
    }
}
