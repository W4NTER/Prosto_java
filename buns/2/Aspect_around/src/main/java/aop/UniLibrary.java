package aop;


import org.springframework.stereotype.Component;

@Component
public class UniLibrary {

    public void getBook(){
        System.out.println("We are getting the book from UniLibrary");
        System.out.println("-------------------------------------------");

    }

    public String returnBook(){
        System.out.println("We are returning the book from UniLibrary");
        System.out.println("-------------------------------------------");

        return "Война и мир";
    }

    public void getMagazine(){
        System.out.println("We are getting the magazine from UniLibrary");
        System.out.println("-------------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("We are returning the magazine at UniLibrary");
        System.out.println("-------------------------------------------");
    }
    public void addBook(String person_name, Book book){
        System.out.println("We are adding the book at UniLibrary");
        System.out.println("-------------------------------------------");
    }
    public void addMagazine(){
        System.out.println("We are adding the book at UniLibrary");
        System.out.println("--------------------------------------------");
    }
}
