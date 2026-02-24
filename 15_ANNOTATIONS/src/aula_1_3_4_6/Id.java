package aula_1_3_4_6;

import java.lang.annotation.*;

//criando uma annotation vazia
// aula 3 - podemos restringir o uso da annotation da seguinte forma
@Target({ElementType.FIELD, ElementType.METHOD}/*agora só podemos usar em métodos e atributos*/)//recebe um array de ElementType
//aula 4 - podemos definir como e quando a annotation vai entrar em ação, temos 3 opções
/**
 * CLASS: annotation é incluída no bytecode e está disponível na compilação
 * SOURCE: annotation só está disponível em desenvolvimento, não vai pro bytecode
 * RUNTIME: annotation é incluída no bytecode e está disponível em tempo de execução, permitindo um grande uso da annotation via java reflection api;
 */
// aula 6 - podemos definir a annotation com documentada, para ser exposta nas assinaturas do método e no javadoc
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Id {
}
