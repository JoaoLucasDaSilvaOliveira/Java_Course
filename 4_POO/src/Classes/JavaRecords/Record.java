package Classes.JavaRecords;

import java.util.Objects;

//a classe record é uma classe rápida que serve para guardar informações
    //ela contém o atributos passados por parâmetros, um getter para cada um. Os atributos são final então não tem setters
    //o getter é apenas o nome do atributo, como nome()
    //sobrescreve o toString(), o hashCode() e o equals();
public record Record(String nome, double altura, int idade) {
    //código de inicialização padrão
    public Record {
        Objects.requireNonNull(nome);
        instances++;
    }
    //criando outros construtores menores
    public Record (String nome, int idade){
        this(nome, DEFAULT_HEIGHT, idade);
        System.out.println("Objeto sem altura criado!");
    }
    //pode ter elementos estáticos também
        //finais
    public static final double DEFAULT_HEIGHT=0;
    private static int instances;

        //mutáveis
    public static int getInstances() {
        return instances;
    }
}
