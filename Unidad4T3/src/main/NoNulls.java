package main;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(SOURCE)
@Target({ METHOD })
public @interface NoNulls {
	String mensaje() default "El metodo necesita tener argumentos";
}
