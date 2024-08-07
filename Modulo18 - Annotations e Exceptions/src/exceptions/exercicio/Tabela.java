package exceptions.exercicio;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.TYPE})
public @interface Tabela {
    String nomeTabela();
}
