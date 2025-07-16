package _1_OperaçõesEmArquivosEDiretorios;

import java.nio.file.Path;

public class App2 {
    public static void main(String[] args) {
        Path p1 = Path.of("home");
        Path p2 = Path.of("ctosin");
        Path p3 = Path.of("log.out");
        Path completo = p1.resolve(p2, p3);
        Path p5 = completo.toAbsolutePath();
        //o metodo resolve une os paths colocando o path/string recebido como um subcaminho do path que teve o metodo chamado
        System.out.println(completo); //SAÍDA: home\ctosin\log.out
        System.out.println(p5);
    }
}
