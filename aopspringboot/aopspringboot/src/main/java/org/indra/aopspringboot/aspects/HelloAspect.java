package org.indra.aopspringboot.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.*;

@Aspect
@Component
public class HelloAspect {

	// sintaxis: execution(* clase.metodo() )  podemos sustituir "metodo()" por "*()" para hacerlo con todos
	@Pointcut("execution(* org.indra.aopspringboot.services.HelloAspectService.*())")
	public void foo() {
		System.out.println("Se ejecuta el servicio");
	}
	
	@Before("foo()")
	public void myadvice(JoinPoint jp) {
		System.out.println("Antes de ejecutar el servicio " + jp.getSignature());
	}
}
