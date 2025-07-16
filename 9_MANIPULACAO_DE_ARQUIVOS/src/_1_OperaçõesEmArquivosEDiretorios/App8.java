package _1_OperaçõesEmArquivosEDiretorios;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class App8 {
    public static void main(String[] args) throws IOException {
        //listando arqvs e diretorios
        try (DirectoryStream<Path> files = Files.newDirectoryStream(Path.of(""/*"9_MANIPULACAO_DE_ARQUIVOS", "src", "_1_OperaçõesEmArquivosEDiretorios"*/))){
            for (Path path : files){
                System.out.println(path + " - " + Files.isDirectory(path));
            }
        }
        //é possível procurar coisas em específico tb!
        //  o glob procura pelas infos que passamos
        //      * = qualquer coisa; .iml = procura os arquivos que sejam uma extensão .iml
        try (DirectoryStream<Path> files = Files.newDirectoryStream(Path.of(""/*"9_MANIPULACAO_DE_ARQUIVOS", "src", "_1_OperaçõesEmArquivosEDiretorios"*/), "*.iml")){
            for (Path path : files){
                System.out.println(path + " - " + Files.isDirectory(path));
            }
        }
    }
}
