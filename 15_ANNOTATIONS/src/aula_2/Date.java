package aula_2;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//criando uma annotation com metodos
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Date {
    String format();
    boolean enabled() default true; // podemos colocar valores padrão, aí o compilador não nos obriga a passar a informação
}
