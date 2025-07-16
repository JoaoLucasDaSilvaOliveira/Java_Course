package _1_OperaçõesEmArquivosEDiretorios;

import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        //caminhos!
        //C:\System\Java\file.exe
        Path p1 = Path.of("C:", "System", "file.exe");
        Path p2 = p1.getFileName();
        Path p3 = p1.getRoot();
        //retorna quantos caminhos tem, como se fosse um .length()
        //  todos os métodos abaixo ignoram o root: C:\
        System.out.println(p1.getNameCount());
        for (int i=0; i<p1.getNameCount(); i++){
            Path p4 = p1.getName(i);
            System.out.println(p4);
        }
    }
}
