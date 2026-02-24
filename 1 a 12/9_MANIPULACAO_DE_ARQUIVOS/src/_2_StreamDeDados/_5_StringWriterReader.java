package _2_StreamDeDados;

import java.io.*;

public class _5_StringWriterReader {
    public static void main(String[] args) throws IOException{
        //lendo e escrevendo para uma string
        try (Writer out = new StringWriter()){
            IOOperations.write(out, "Textinho");
            System.out.println(out);
        }

        try (Reader in = new StringReader("Textão")){
            System.out.println(IOOperations.read(in));
        }
    }
}
