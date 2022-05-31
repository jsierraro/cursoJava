package org.indra.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.*;

public class AfterServiceInvocationAspect implements AfterReturningAdvice{

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

		System.out.println(String.format("Se invoca al método \"%s\" de la clase \"%s\" y devuelve \"%s\"",
				method.getName(), target.getClass().getSimpleName(), returnValue));
		
	}

}
