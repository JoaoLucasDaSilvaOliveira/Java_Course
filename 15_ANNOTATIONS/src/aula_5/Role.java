package aula_5;

//nessa aula vamos aprender a como usar as annotations quando precisamos as repetir

import java.lang.annotation.Repeatable;

@Repeatable(Roles.class)
public @interface Role {
    String value();
}
