package org.indra.aspect;

import org.aopalliance.intercept.*;

public class AroundServiceInvocationAspect implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {

		System.out.println(String.format("Antes de invocar al m�todo \"%s\"", invocation.getMethod().getName()));
		Object result = invocation.proceed();
		System.out.println(String.format("Despu�s de invocar al m�todo \"%s\"", invocation.getMethod().getName()));
		result = String.format("%s ---- Alterado", (String) result);
		return result;
	}

}
