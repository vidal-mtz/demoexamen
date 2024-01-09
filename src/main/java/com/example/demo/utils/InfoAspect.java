package com.example.demo.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class InfoAspect {
	private static final Logger LOGGER = LogManager.getLogger(InfoAspect.class);

	@Around("execution(* com.example.demo.controller..*(..)))")
	public Object profileAllMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

		// interceptart
		String className = methodSignature.getDeclaringType().getSimpleName();
		String methodName = methodSignature.getName();

		final StopWatch stopWatch = new StopWatch();

		// Tomar el tiempo
		stopWatch.start();
		Object result = proceedingJoinPoint.proceed();
		stopWatch.stop();

		LOGGER.info("Tiempo Ejecución de " + className + "." + methodName + " :: " + stopWatch.getTotalTimeMillis()
				+ " ms");

		return result;
	}
}
