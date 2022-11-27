package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspects {

    @Pointcut("execution(* get*())")
    private void allGetMethodsFromUniLibrary(){}

    @Pointcut("execution(* return*())")
    private void allReturnMethodsFromUniLibrary(){}

    @Pointcut("allReturnMethodsFromUniLibrary() || allGetMethodsFromUniLibrary()")
    private void  allGetAndReturnMethodsFromUniLibrary(){}


   @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: writing log #1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("beforeReturnLoggingAdvice: writing log #2");
    }

    @Before("allGetAndReturnMethodsFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice(){
        System.out.println("beforeGetAndReturnLoggingAdvice: writing log #3");
    }
}
