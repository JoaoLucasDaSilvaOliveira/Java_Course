package aula_7;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Inherited // faz com que as classes que herdem a classe que possui a ann abaixo, também a possuam, assim como o pai
public @interface Item {
}
