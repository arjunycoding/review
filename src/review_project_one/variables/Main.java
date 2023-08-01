package review_project_one.variables;

import java.util.Date;

public class Main {
//        to declare a variable you declare the access method followed by the type and then the  name and then the value:
        public String myString = "hello!";

//      PRIMITIVE TYPES: the 8 types that are not objects they are:
        byte b = 14;
        short s = 23;
        int i = 34;
        long l = 10000;
        float f = 123.4F;
        double d = 21345.32342;
        char c = '\u0041';
// Each variable overflows for the first few types, byte, short, int, long, and char. we will recive a compliation error.
// For float and double we will recive the scientific notaion:
//        uncomment to see errors:
//        byte bit = 1334;
//        short shoot = 23333333;
//        int ent = 3433333333;
//        long loooong = 10003333330;
//        float flight = 123.412325345353454F;
//        double dub = 21345.3234234234234234232323424232;
//
//        char bar = '\u000041';
//      REFERENCE TYPES: are the object data types:
        String a = "hello!";
        Date now = new Date();
//       etc.
}
