package review_project_one.methodSignature;

public class Main {
    public static void main(String[] args) {

    }

//    the method signature contains these parts:
//    The method signature is made up of 5 components:
//      Restriction type --> Public, Private, etc.
//      Class Level? --> static
//      Return type (for instance methods) --> String, int, etc.
//      Name --> helloWorld, printInfo, etc.
//      Parameters --> int number, String name, etc.
//      Can throw Exception/s --> throws RuntimeException, throws ClassNotLoadedException, etc.
//      In order. For example:
    public static void hello(String name){
        System.out.println("hello, " + name);
    }

    private String hello1(){
        return "h";
    }

    protected static int hello1(int number) throws RuntimeException{
        return number;
    }
}
