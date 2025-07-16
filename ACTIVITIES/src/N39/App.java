package N39;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) throws IOException {
        Path aqui = Path.of("C:\\Users\\jlso9\\Desktop\\Curso_Java\\ACTIVITIES\\src\\N39");
        String tempo = String.valueOf(System.currentTimeMillis());
        Files.createDirectory(aqui.resolve("file_"+tempo));
    }
}
