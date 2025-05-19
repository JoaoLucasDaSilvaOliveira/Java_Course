package Equals_E_HashCode;

import java.util.Objects;

public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public boolean equals(Object p){

        if (!(p instanceof Pessoa pessoaTemp)){
            return false;
        }
        return Integer.compare(this.idade, pessoaTemp.idade) == 0 &&
                this.nome.equals(pessoaTemp.nome);

    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }
}
