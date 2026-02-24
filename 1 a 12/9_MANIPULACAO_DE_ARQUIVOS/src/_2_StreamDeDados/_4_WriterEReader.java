package _2_StreamDeDados;
import java.io.*;

public class _4_WriterEReader {
    //com o conhecimento adquirido até aqui, podemos perceber que é possível abstrair o código de leitura e escrita para
    // uma classe que controle apenas isso, deixando o código mais limpo e simples
    //COMO? FileWriter e FileReader e outras classes de I/O extendem a classe Writer e Reader, sabendo disso podemos fazer:
    public static void main(String[] args) {
        try (FileWriter file = new FileWriter("C:\\Users\\jlso9\\Desktop\\Curso_Java\\9_MANIPULACAO_DE_ARQUIVOS\\src\\Examples\\Streams\\Abstração.txt")){
            IOOperations.write(file, "Texto abstraído usando classes específicas");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try (FileReader read = new FileReader("C:\\Users\\jlso9\\Desktop\\Curso_Java\\9_MANIPULACAO_DE_ARQUIVOS\\src\\Examples\\Streams\\Abstração.txt")){
            System.out.println(IOOperations.read(read));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class IOOperations {
    public static void write (Writer out, String textToWrite) throws IOException {
        out.write(textToWrite);
    }

    public static void write (BufferedWriter out, String text)  throws IOException{
        out.write(text);
    }

    public static String read (Reader in) throws IOException{
        StringBuilder sb = new StringBuilder();
        int c = in.read();
        while (c!=-1){
            sb.append((char)c);
            c = in.read();
        }
        return sb.toString();
    }

    public static String read (BufferedReader in) throws IOException {
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = in.readLine())!= null){
            sb.append(line);
        }
        return sb.toString();
    }

    //trabalhando com bytes
    public static void write (OutputStream out, byte[] bytes) throws IOException{
        out.write(bytes);
    }

    public static byte[] read (InputStream in)throws IOException{
        return in.readAllBytes();
    }

    public static void transfer (OutputStream out, InputStream in) throws IOException{
        byte[] buffer = new byte[2048];
        while (true){
            int bytesRead = in.read(buffer);
            if (bytesRead < 0){
                break;
            }
            out.write(buffer, 0, bytesRead);
        }
    }
}
