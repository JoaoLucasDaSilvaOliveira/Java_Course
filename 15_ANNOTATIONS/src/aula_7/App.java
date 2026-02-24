package aula_7;

import aula_2.Date;
import objetoExemplo.Book;

import java.util.Arrays;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws NoSuchFieldException {
        //mostrando as annotations da classe
        Arrays.stream(Book.class.getAnnotations()).forEach(System.out::println);
        //mostrando as annotations de um campo
        Stream.of(Book.class.getDeclaredField("releaseDate").getAnnotations())
                .forEach(System.out::println);
        //capturando uma annotation e vendo oq ela tem
        Date releaseDateAnn = Book.class.getDeclaredField("releaseDate").getAnnotation(Date.class);
        System.out.println(releaseDateAnn);
        System.out.println(releaseDateAnn.format());
    }
}
