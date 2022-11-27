package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook();


        uniLibrary.returnBook();
        uniLibrary.getMagazine();

        uniLibrary.returnMagazine();
        uniLibrary.addBook("Alan", book);
        uniLibrary.addMagazine();



        context.close();
    }

}
