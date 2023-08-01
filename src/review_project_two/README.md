# Java Basics
##### By Arjun Yuvaraj
***
### Why is Java Object-Oriented?
  * Java is object-oriented because 99% of the time we are dealing with objects
  * The other 1% is made up of the eight primitive data types:
  
    | Data Type | Amount It Can Hold | 
    |-----------|--------------------|
    | Byte      | -128 to 127        |
    | Short     | -32K to 32K        |
    | Int       | -2B to 2B          |
    | Long      | -9Q to 9Q          |
    | Float     | -2B to 2B          |
    | Double    | -4B to 4B          |
    | Char      | 0 to 65K           |
    | Boolean   | true or false      |

### What Are Classes?
  * Classes are like the blueprints or cookie cutters for objects.
  * Inside a class there are several things:
    * Instance variables:
        ``` java :
           public String myString = "Hello";
        ```
    * Constructor
        ``` java :
           public Item(String name, int width, int height, String color, boolean interactive) throws Exception{
             this.name = name;
             this.width = width;
             this.height = height;
             this.color = color;
             this.interactive = interactive;
           }
        ```
    * Instance methods
        ``` java :
          public void dropCookie(){
            System.out.println("Sorry! You can't drop a cookie here!");
          }
        ```
    * Class-level (static) variables
        ``` java :
          static String FOOD = "Ramen"
        ```
    * Class-level (static) methods
         ``` java :
           static void printStatus(){
             System.out.println("Making some star jellies! ");
           }
        ```
    * Import statement
        ``` java :
           import review_project_two.exampleFolder1.exampleFolder2.exampleClass;
         ```
    * Package
         ``` java :
           package review_project_two.README;
        ```
    * Comment
      * Single-line
         ``` java :
           // This is a single line comment
         ```
      * Double-line
        ``` java :
          /*
            This is a multi-line comment
          */
        ```

### What is a Method Signature?
  * The method signature is the first line of a method.
  * There are several components to the method signature:
    * Access restriction 
    * Instance- or Class-level
    * Return type
    * Name
    * Parameters
    * Can throw Exception/s
  * Here is a few examples of method signatures:
    ``` java :
      public static void exampleMethod1(String parameter1, int parameter2) throws ClassNotLoadedException{
    
      private String exampleMethod2(boolean paremter1){
    
      protected char exampleMethod3(int paremter1) throws Exception, RuntimeException{
    
      char exampleMethod3(int paremter1) throws Exception, RuntimeException{ 
    ```

### What are Exceptions?
  * An exceptions is when an error occurs disturbing the program
  * There are two types of exceptions:
    * CompileTimeException:
      * A CompileTimeException is when an error in the code occurs and you use a try, catch block to handle it
    * RunTimeException:
      * Is a problem in the code that was not anticipated
      * Try-catch blocks are not needed
  * When an error occurs it is best ```e.printStackTrace();```
  * The Stack Trace is the code that was executed right before the error occurred
  * Example code:
       ``` java : 
            // Item.java - Lines 12-35
              public Item(String name, int width, int height, String color, boolean interactive) throws Exception{
                if(name == null || width == 0 || height == 0 || color == null){
                    Exception e = generateCompilietimeException();
                    throw e;
                } else if(height > 200 || width > 200){
                    Exception e = generateRuntimeException();
                    throw e;
                }
                this.name = name;
                this.width = width;
                this.height = height;
                this.color = color;
                this.interactive = interactive;
              }
    
              private Exception generateCompilietimeException(){
                String message = "The required arguments are missing or null";
                return new ClassNotLoadedException("Building", message);
              }
          
              private Exception generateRuntimeException(){
                return new RuntimeException("Sorry but the width and height cannot be above 200");
              }
       ```

### What are Variables?
  * Variables can be thought of as buckets that can hold things depending on their size and type
  * To declare a variable in java you type: ```<access restriction> <data type> <name> = <value>;```
  * Access Restrictions:
    * There are four types of access restrictions:
      * Public
        * Everyone can see it
      * Private
        * Only that class can see it
      * Default
        * Only that Package can see it
      * Protected
        * Only the children of that class can see it
  * Data Types:
    * On top of the 8 primitive types, we also have reference types.
    * For example there is ```String```, ```Scanner```,```Integer```, etc.
    
* Here are some examples:
   ``` java :
    CookieHouse cookieHouse1 = new CookieHouse("Strawberry Cookies house", "Red", "To create star jellies");
    public String myString = "Hello World!";
    public int roundPi = 3;
    public Float myFloat = 3.14159; 
  ```

### What are Packages and Import Statements?
  * A package is a container of a java class.
  * An import statement is when we import a java class.
  * For example, lets look at the products folder. Let's say we want to create three cookie house in ```Main.java```
    * In the code below we are "packing" the code
    * The syntax ```package <folder>.<if any subfolders>;```
      ``` java :
        // products/Building.java - Line 3
        package review_project_two.products;
      ```
    * Later, in ```Main.java``` we can import the packaged classes.
    * The syntax ```import <folder<if any subfolders .subfolders>>.<class name>;```
      ``` java :
        // Main.java - Line 3
        import review_project_two.products.CookieHouse;
      ```

### What are Abstract Classes?
  * Abstract classes are classes that are ment to be inhertied
  * Inside of abstract classes we can have an abstract method
    * Abstract methods is a type of method thats its children must complete
    * Example Code:
      ``` java :
        // Building.java - Line 20
        public abstract void dropCookie();
      
        // products/CookieHouse.java - Line 9-11
        public void dropCookie(){
          System.out.println("Sorry! You can't drop a cookie here!");
        }
      ```

### What are Class Hierarchies?
  * Class Hierarchies is the parent-child relationship between two classes
  * For example ```Building.java``` is the parent of ```CookieHouse.java```
  * ```CookieHouse.java``` inherits all of the methods, variables, and properties of ```Building.java```

### What is the Equals method?
  * The ```.equals()``` method compares weather two objects are the same
  * It is important to add this function to all the custom objects you build. 
  * If you don't when comparing two objects you will almost always get ```false```
  * Example Code:
    ``` java :
     // Item.java - Line 43-49
     public boolean equals(Object o){
        if(o instanceof Item){
            Item that = (Item) o;
            return this.name.equals(that.name);
        }
        return false;
     }
    ```
    
  * First we check if the object passed is an instance of ```Item```
  * Next we cast ```o``` to ```Item``` and assign it to ```that```
  * Finally, we compare the values of ```this.value``` and ```that.value```
  * If this is true we return ```true```. Otherwise we return ```false```

### What is the toString Method?
  * The ```toString``` method coverts any object into a string.
  * It's good practice to have a ```toString```
  * Here is an example:
    ``` java :
       // Item.java - Line 39-41
       public String toString(){
         return this.name;
       }
    ```
  * A ```toString``` method can return anything you want it to

### What are Collections?
  * There are three types of collections:
  * **List**
    * A collection of objects
    ``` java :
      // Main.java - Lines 19-27
      List trees = new ArrayList<Tree>();
      trees.add(new Tree("Tree 1", "Brown", 4));
      trees.add(new Tree("Tree 2", "Orange", 3));
      trees.add(new Tree("Tree 3", "Green", 7));
      trees.add(new Tree("Tree 4", "Brown", 1));
      trees.add(new Tree("Tree 5", "Yellow", 6));
      trees.add(new Tree("Tree 6", "Purple", 3));
    
    ```
  * **Set**
    * A collection of distinct objects
    ``` java :
        // Main.java - Lines 30-39
        Set hello = new HashSet<Tree>();
        hello.add(new Tree("Tree 1", "Brown", 4));
        hello.add(new Tree("Tree 2", "Orange", 3));
        hello.add(new Tree("Tree 3", "Green", 7));
        hello.add(new Tree("Tree 4", "Brown", 1));
        hello.add(new Tree("Tree 5", "Yellow", 6));
        hello.add(new Tree("Tree 6", "Purple", 3));
        
    ```
  * **Map**
    * A collection of key-value pairs
    * The keys and values can be of any object type
  * You may not create a collection of primitive types