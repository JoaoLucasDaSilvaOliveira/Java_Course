package _2_StreamDeDados;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class _7_InAndOutPutStream {
    public static void main(String[] args) throws IOException {
        //transferindo dados em forma de bytes

        try (
                InputStream in = new ByteArrayInputStream("Java eh top".getBytes(StandardCharsets.UTF_8));
                OutputStream out = new FileOutputStream("C:\\Users\\jlso9\\Desktop\\Curso_Java\\9_MANIPULACAO_DE_ARQUIVOS\\src\\Examples\\Streams\\inAndOutPutStream.txt");
                InputStream in2 = new FileInputStream("C:\\Users\\jlso9\\Desktop\\Curso_Java\\9_MANIPULACAO_DE_ARQUIVOS\\src\\Examples\\Streams\\inAndOutPutStream.txt");
                ByteArrayOutputStream out2 = new ByteArrayOutputStream();
            ){
            IOOperations.transfer(out, in);
            IOOperations.transfer(out2, in2);
            String str = out2.toString(StandardCharsets.UTF_8);
            System.out.println(str);
        }
    }
}
