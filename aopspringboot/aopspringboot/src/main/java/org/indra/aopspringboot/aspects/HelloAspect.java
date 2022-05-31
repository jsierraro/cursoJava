package org.indra.aopspringboot.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.*;

@Aspect
@Component
public class HelloAspect {

	@Pointcut("execution(* org.indra.aopspringboot.services.HelloAspectService.*(...))")
	public void foo() {
		System.out.println("Se ejecuta el servicio");
	}
	
}
