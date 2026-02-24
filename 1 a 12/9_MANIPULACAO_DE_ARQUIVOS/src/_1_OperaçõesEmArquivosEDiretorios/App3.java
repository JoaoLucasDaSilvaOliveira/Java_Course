package _1_OperaçõesEmArquivosEDiretorios;

import java.nio.file.Files;
import java.nio.file.Path;

public class App3 {
    public static void main(String[] args) {
        //checando a existencia de arquivos e diretorios
        Path p1;
        System.out.println(Files.exists(p1=Path.of("9_MANIPULACAO_DE_ARQUIVOS","src","Examples", "file1.txt")));
        //checando se eh diretorio
        System.out.println(Files.isDirectory(p1));
        System.out.println(Files.isRegularFile(p1));
        //isSameFile verifica se é o mesmo arquivo
        //is tem varios metodos atrelados!
    }
}
