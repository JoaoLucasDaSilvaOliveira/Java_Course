package _1_OperaçõesEmArquivosEDiretorios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App6 {
    public static void main(String[] args) throws IOException {
        //excluindo arqvs
        String pathAtual = System.getProperty("user.dir");
        Path p1 = Path.of(pathAtual, "9_MANIPULACAO_DE_ARQUIVOS", "src", "Examples");
        Path file = p1.resolve("aq.pdf");
        if (!Files.exists(file)){
            Files.createFile(file);
        }
        Files.deleteIfExists(p1.resolve("aq.img"));

        //OBS!! não é possível excluir um diretorio que não esteja vazio!
    }
}
