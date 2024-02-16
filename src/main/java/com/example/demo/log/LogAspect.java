package com.example.demo.log;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.security.PublicKey;
import java.util.Arrays;

@Slf4j
@Aspect
@Component
public class LogAspect {

    @Before("target(com.example.demo.service.HelloService)")
    public void beforeHelloservice(JoinPoint joinPoint){
        String className = joinPoint.toShortString();
        Object [] asd = joinPoint.getArgs();
        log.info("Before " +className + " "+ Arrays.toString(asd));
    }

    @Around("target(com.example.demo.service.HelloService)")
    public Object aroundHelloService(ProceedingJoinPoint joinPoint) throws Throwable {
        String classname = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        try {
            log.info("Around before" +classname + " "+ methodName);
            return joinPoint.proceed(joinPoint.getArgs());
        }catch (Throwable throwable){
            log.info("Around Error");
            return throwable;
        }finally {
            log.info("Around selesai");
        }
    }

}
