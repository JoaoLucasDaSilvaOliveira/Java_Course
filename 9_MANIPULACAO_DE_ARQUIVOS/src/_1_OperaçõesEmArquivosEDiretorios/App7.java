package _1_OperaçõesEmArquivosEDiretorios;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class App7 {
    public static void main(String[] args) throws IOException {
        //copiando, movendo e renomeando arqvs

        //criando a estrutura de pastas!
        String pathAtual = System.getProperty("user.dir");
        Path p1 = Path.of(pathAtual, "9_MANIPULACAO_DE_ARQUIVOS", "src", "Examples");
//        Files.createDirectories(p1.resolve("pasta1"));
//        Files.createDirectories(p1.resolve("pasta2"));

        //criando o arqv
//        Files.createFile(p1.resolve("pasta1", "teste.txt"));

        Path origin = p1.resolve("pasta1", "teste.txt");
        Path destination = p1.resolve("pasta2", "copiaTeste.txt");

        //podemos colocar assim:
//        Files.copy(origin, destination);
        //ou assim: para fazer a copia com replace no arqv antigo
//        Files.copy(origin, destination, StandardCopyOption.REPLACE_EXISTING);
        //movendo:
//        Files.move(destination, p1.resolve("pasta1", "copiaTesteMovido.txt"));

        //renomeando
        Files.move(origin.getParent().resolve("copiaTesteMovido.txt"), p1.resolve("pasta1", "copiaTesteMovidoRenomeado.txt"));
    }
}
