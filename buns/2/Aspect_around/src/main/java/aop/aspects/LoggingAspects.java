package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspects {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable{
        System.out.println("afterGetStudentsLoggingAdvice: в библиотеку пытаются вернуть книгу");
        Object targetMethodresult = null;
        try {
            targetMethodresult = proceedingJoinPoint.proceed();
        }
        catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice: было поймано исключение " + e);
            targetMethodresult = "неизвестное название книги";
            throw e;
        }
        System.out.println("afterGetStudentsLoggingAdvice: в библиотеку успешно вернули книгу");
        return targetMethodresult;
    }
}
