package serialization;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Client implements Serializable {
    //O JAVA UTILIZA O serialVersionUID para manter um controle de classes serializadas no momento de tentar serializar
    //  POR PADRÃO, O JAVA utiliza o nome da classe, os métodos que ela possui e o atributos para atribuir um serialVersionUID.
    //  Entretanto podemos sobrescrever esse comportamento assim:

    //@Serial // é sugerido o uso dessa annotation para a ide saber que se trata do número de serial da classe
    private static final long serialVersionUID = 1L; //OBS.: para obtermos um serialVersionUID válido, deve estar nesse exato mesmo formato de declaração.

    private int id;
    private String name;
    @JsonProperty(value = "birth-date")//usa o nome diferente do nome da classe
    @JsonFormat(
            shape = JsonFormat.Shape.STRING, //formato que será serializado/deserializado
            pattern = "dd/MM/YYYY" // padrão
    )
    private LocalDate birthDate;
    @JsonIgnore
    private transient String document; //CASO NÃO QUEIRAMOS SERIALIZAR O ATRIBUTO, COLOCAMOS O MODIFICADOR transient. Preenche, na deserialização, com null (Não válido para JSON). Para o JSON, usamos a @.

    public Client(int id, String name, LocalDate birthDate, String document) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.document = document;
    }

    public Client(int id, String name, LocalDate birthDate) {
        this(id, name, birthDate, null);
    }

    public static Client defaultClient(){
        return new Client(1, "João", LocalDate.of(2004,4,13));
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Client client)) return false;
        return id == client.id && Objects.equals(name, client.name) && Objects.equals(birthDate, client.birthDate) && Objects.equals(document, client.document);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthDate, document);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", document='" + document + '\'' +
                '}';
    }
}
