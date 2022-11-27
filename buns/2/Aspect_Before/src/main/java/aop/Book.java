package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Roy")
    private String name;

    @Value("Somebody")
    private String author;

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Value("1888")
    private int yearOfPublication;

    public String getName() {
        return name;
    }
}
