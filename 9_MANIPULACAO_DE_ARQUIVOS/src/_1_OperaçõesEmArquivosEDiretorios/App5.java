package _1_OperaçõesEmArquivosEDiretorios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App5 {
    public static void main(String[] args) throws IOException {
        //criando diretorios e arquivos temporarios
        Path tempDir = Files.createTempDirectory("app_");
        System.out.println(tempDir); // cria na pasta temp do sistema
        String pathAtual = System.getProperty("user.dir");
        Path p1 = Path.of(pathAtual, "9_MANIPULACAO_DE_ARQUIVOS", "src", "Examples");
        Path tempDir2 = Files.createTempDirectory(p1, "app_");
        Path tempFile = Files.createTempFile(tempDir2, "file_",null); //suffix null coloca como tmp;
    }
}
