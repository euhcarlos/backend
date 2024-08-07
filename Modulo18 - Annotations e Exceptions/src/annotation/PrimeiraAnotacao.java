package annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD}) // OU ({ElementType.TYPE, ElementType.METHOD}): pode adicionar mais de um
public @interface PrimeiraAnotacao {
    String value();

    int idade();

    String[] bairros();

    //Valor que nem todos precisam colocar, pode ser o valor padrão em um e outro valor em outro
    double valor() default 10d;
}
