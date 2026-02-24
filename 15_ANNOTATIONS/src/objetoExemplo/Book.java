package objetoExemplo;//entendendo annotations

import aula_1_3_4_6.Id;
import aula_2.Date;
import aula_5.Role;
import aula_7.Item;

import java.time.LocalDate;

/***
 * Classe que servirá para ilustrar como funciona as annotations
 */
@Item
public class Book {

    @Id
    private final int id;

    private final String title;

    @Date(format = "dd/MM/YYYY")
    private final LocalDate releaseDate;

    public Book(int id, String title, LocalDate releaseDate) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
    }

    @Role("ADMIN")
    @Role("OPERATOR")
    @Id
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "objetoExemplo.Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}

