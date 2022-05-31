package org.indra.aspect;

import java.lang.reflect.*;

import org.springframework.aop.*;

public class BeforeServiceInvocationAspect implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {

		String argsS;
		
		if(args == null || args.length == 0) 
			argsS = "sin argumentos";
		else
			argsS = String.format("con los argumentos {%s}", args.toString());
		System.out.println(String.format("Se invoca al método \"%s\" de la clase \"%s\" %s",
				method.getName(), target.getClass().getSimpleName(), argsS));

	}

}
