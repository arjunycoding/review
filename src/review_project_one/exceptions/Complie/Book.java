package review_project_one.exceptions.Complie;

import com.sun.jdi.ClassNotLoadedException;

public class Book {
    public String title;
    public int numberOfPages;


    static String TYPE = "book";
    public Book(String title, int numberOfPages) throws Exception{
//  Here we check if the values are null. If they are we throw an exception
        if(title == null || numberOfPages <=0 ){
            Exception e = generateException();
            throw e;

        }
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

//  Here we generate an exception. we return a ClassNotLoadedException.
    private Exception generateException(){
        String message = "The required arguments are missing or null";
        return new ClassNotLoadedException("Person", message);
    }
    public void printInfo(){
        System.out.println("Title: " + this.title + "\n # of pages: " + this.numberOfPages);
    }
    public static void printType(){
        System.out.println(TYPE);
    }
}
