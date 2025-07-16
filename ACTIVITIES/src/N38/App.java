package N38;

import java.io.IOException;
import java.nio.file.*;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println(listar(Path.of("C:\\Users\\jlso9\\Desktop\\Curso_Java\\9_MANIPULACAO_DE_ARQUIVOS", "src")) + " bytes");
    }
    private static long listar (Path caminho) throws IOException {
        long sizeofAllFiles = 0;
        try (var files = Files.newDirectoryStream(caminho)){
            for (Path file : files){
                if (Files.isRegularFile(file)){
                    sizeofAllFiles +=Files.size(file);
                } else if (Files.isDirectory(file)){
                    sizeofAllFiles +=listar(file);
                }
            }
        }
        return sizeofAllFiles;
    }
}
