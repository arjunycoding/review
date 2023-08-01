package review_project_one.classes;

public class Book {
//   Classes are blue-prints or cookie cutters for objects.
//   They contain test things:

//    instance review_project_one.variables are different within each instance of an object

    public String title;
    public int numberOfPages;

//    You can also have comments. A single line is two slashes // and a multi line is a slash with a star: /**/
//    Class level review_project_one.variables are the same among all the objects. It is good convention to capitalize all letters:

    static String TYPE = "book";
//    Constructors create or construct an object
    public Book(String title, int numberOfPages){
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

//    You can also have methods the types are the same as class level and instance review_project_one.variables
//    This is an instance method
    public void printInfo(){
        System.out.println("Title: " + this.title + "\n # of pages: " + this.numberOfPages);
    }
//    This is a static method
    public static void printType(){
        System.out.println(TYPE);
    }
}
