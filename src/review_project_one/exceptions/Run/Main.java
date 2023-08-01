package review_project_one.exceptions.Run;

public class Main {

    public static void main(String[] args) {
        //This is a run time exception:
        Book a = new Book(null, 743);
        System.out.println("Book made");
    }
}
