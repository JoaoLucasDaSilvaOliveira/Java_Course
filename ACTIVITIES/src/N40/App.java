package N40;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\jlso9\\Desktop\\Curso_Java\\ACTIVITIES\\src\\N40\\WriteConsole.txt"), StandardCharsets.UTF_8)){
            while (true){
                String text = scan.nextLine();
                if (text.isBlank()){
                    break;
                }
                osw.write(text+"\n");
            }
        }
    }
}
