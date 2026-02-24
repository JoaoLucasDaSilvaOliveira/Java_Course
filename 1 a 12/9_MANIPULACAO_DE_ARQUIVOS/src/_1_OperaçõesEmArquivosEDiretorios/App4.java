package _1_OperaçõesEmArquivosEDiretorios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App4 {
    public static void main(String[] args) throws IOException {
        //criando diretorios e arquivos
        String pathAtual = System.getProperty("user.dir");
        Path p1 = Path.of(pathAtual, "9_MANIPULACAO_DE_ARQUIVOS", "src", "Examples");
        System.out.println(Files.exists(p1));

        Path d1 = p1.resolve("d1");
        //lança um erro caso já exista o arqv/dir
        if (!Files.exists(d1)){
            Files.createDirectory(d1);
        }
        //não precisa, com createDirectories, fazer checagem se ja existe pq se ja existir ele só n cria
        Path d3 = Files.createDirectories(d1.resolve(Path.of("d2", "d3")));
        if (!Files.exists(d3.resolve(Path.of("d3.txt")))){
            Files.createFile(d3.resolve("d3.txt"));
        }
        Files.createFile(d3.getParent().resolve(Path.of("d2.txt")));
        Files.createFile(d3.getParent().getParent().resolve(Path.of("d1.txt")));
    }
}
