package review_project_one.exceptions.Complie;

public class Main {
//    In book.java if we return give null an error will occur.
//    There are two types of review_project_one.exceptions:
//    COMPILE TIME EXCEPTION: is when the exception must have a try catch and is extended from a throwable
//      RUN TIME EXCEPTION  : is when the exception is not expected and is extended from a RunTimeException


    public static void main(String[] args) {
        //This is a compile time exception:
        try {
            Book a = new Book(null, 743);
            System.out.println("Book made");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
