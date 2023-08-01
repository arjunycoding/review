package review_project_one.exceptions.Run;

public class Book {
    public String title;
    public int numberOfPages;


    static String TYPE = "book";
    public Book(String title, int numberOfPages) throws RuntimeException{
        //  Here we check if the values are null. If they are we throw an exception

        if(title == null || numberOfPages <=0 ){
            RuntimeException e = generateException();
            throw e;
        }
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

//  Here we generate an exception. we return a RuntimeException.

    private RuntimeException generateException(){
        return new RuntimeException("A book needs to have a valid title and number of pages");
    }
    public void printInfo(){
        System.out.println("Title: " + this.title + "\n # of pages: " + this.numberOfPages);
    }
    public static void printType(){
        System.out.println(TYPE);
    }
}
