package review_project_one.explanations;

public class Access {
//    There are four types of access restrictions:
//        Public  - Everyone can see it
//       Private  - Only that class can see it
//       Default  - Only that Package can see it
//      Protected - Only the children of that class can see it
//    Access restriction for declaring who and what can access that variable or method
//   EXAMPLES:

    public String anyone = "Bring it on! everyone can see me";
    private String none = "Im scared. Only this file can see me";

    String onlyPackage = "I am ready to see the world! I can only be accessed by my package";

    protected String onlyFamily = "Stranger Danger! Only my children can see me";
}
